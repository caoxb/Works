package tarena.day21;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws Exception {
        test1();
    }

    private static void test1() throws Exception {
        Socket s = new Socket("127.0.0.1", 8000);
        // 从通道中可以取得双向通信的字节流
        final InputStream in = s.getInputStream();
        final OutputStream out = s.getOutputStream();

        new Thread() {
            public void run() {
                try {
                    while (true) {
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
                    while ((b = in.read()) != -1) {
                        System.out.println(b);
                    }
                } catch (Exception e) {
                }
            }
        }.start();

    }
}
