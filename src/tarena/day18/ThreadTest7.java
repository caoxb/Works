package tarena.day18;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreadTest7 {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        System.out.print("输入文件路径：");
        String path = sc.nextLine();
        final PrintWriter out = new PrintWriter(path);
        final List<String> list = new ArrayList<String>();


        final Thread t = new Thread() {
            public void run() {
                while (true) {// 阻塞
                    if (list.size() > 0) {
                        for (String s : list) {
                            out.println(s);
                        }
                        out.flush();
                        list.clear();
                    }
                    try {
                        Thread.sleep(10000);
                    } catch (Exception e) {
                    }
                }
            }
        };

        t.start();


        new Thread() {
            public void run() {
                while (true) {// 阻塞
                    String s = sc.nextLine();// 阻塞
                    if (":w!".equals(s)) {
                        // 打断 t 线程，让 t 线程结束暂停状态，
                        // 立即循环回去执行保存动作
                        t.interrupt();
                        continue;
                    } else if (":q!".equals(s)) {
                        // 退出虚拟机
                        System.exit(0);
                    }
                    list.add(s);
                }
            }
        }.start();
    }
}
