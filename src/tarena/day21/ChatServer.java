package tarena.day21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tarena.day21.ChatServer.TongXinThread;

public class ChatServer {
    ServerSocket ss;
    List<TongXinThread> list = new ArrayList<TongXinThread>();

    public ChatServer() throws Exception {
        ss = new ServerSocket(8000);
    }

    void startServer() {
        // 启动接受客户端连接的线程
        new Thread() {
            public void run() {
                try {
                    while (true) {
                        Socket s = ss.accept();
                        TongXinThread tx = new TongXinThread(s);
                        list.add(tx);
                        tx.start();
                    }
                } catch (Exception e) {
                }
            }
        }.start();
    }

    class TongXinThread extends Thread {
        Socket s;
        PrintWriter out;
        BufferedReader in;

        public TongXinThread(Socket s) throws Exception {
            this.s = s;
            out = new PrintWriter(
                    new OutputStreamWriter(
                            s.getOutputStream()));
            in = new BufferedReader(
                    new InputStreamReader(
                            s.getInputStream()));
        }

        public void run() {
            // 接收是阻塞的
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    // 收到聊天内容，遍历发送给所有客户端
                    Iterator<TongXinThread> it = list.iterator();
                    while (it.hasNext()) {
                        TongXinThread tx = it.next();
                        try {
                            tx.send(s);
                        } catch (Exception e) {
                            list.remove(tx);
                        }
                    }
                }
            } catch (Exception e) {
            }
            // 当前连接已经断开
            list.remove(this);
        }

        // 发送数据的方法
        public void send(String s) {
            out.println(s);
            out.flush();
        }
    }


    public static void main(String[] args) throws Exception {
        ChatServer server = new ChatServer();
        server.startServer();// 启动服务器
    }
}
