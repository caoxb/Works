package tarena.day21;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
    public static void main(String[] args) throws Exception {
        test1();
    }

    private static void test1() throws Exception {
        /* 必须选择一个没有被其他程序占用的端口，
         * 否则会出现异常：
         * Address Already In Use ... JVM_BIND
         */
        ServerSocket ss = new ServerSocket(8000);
        // 在此等待其他主机连接，
        // 接收到连接请求后，
        // 会建立连接通道
        // Socket 对象看做虚拟通道的一端
        Socket s = ss.accept();

        // 从通道中可以取得双向通信的字节流
        final InputStream in = s.getInputStream();
        final OutputStream out = s.getOutputStream();

        new Thread() {
            public void run() {
                try {
                    while (true) {// 阻塞
                        String str = new Scanner(System.in).nextLine();
                        out.write(str.getBytes());
                        out.flush();
                    }
                } catch (Exception e) {
                }
            }
        }.start();
        new Thread() {
            public void run() {
                try {
                    int b;
                    while ((b = in.read()) != -1) {// 阻塞
                        System.out.println((char) b);
                    }
                } catch (Exception e) {
                }
            }
        }.start();


        //		s.close(); // 断开虚拟连接通道
        //		ss.close(); // 停止服务，不再等待与客户端连接
    }
}





