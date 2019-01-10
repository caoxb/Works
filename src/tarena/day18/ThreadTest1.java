package tarena.day18;

public class ThreadTest1 {
    public static void main(String[] args) {
        test2();
    }

    private static void test2() {
        /* Runnable 不是线程；
         * 是在线程内执行的一段任务代码
         */
        class Run1 implements Runnable {
            public void run() {
                // 获得正在执行这行代码的现成对象
                Thread t = Thread.currentThread();
                for (int i = 1; i <= 1000; i++) {
                    System.out.println(
                            t.getName() + " - " + i);
                    try {// 当前执行的线程暂停
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        }

        Run1 r = new Run1(); // 要在线程内执行的任务代码
        // 将任务 r，放入线程
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start(); // 启动后执行 r.run()
        t2.start();
    }


    private static void test1() {
        class Thread1 extends Thread {
            // run() 方法，就是线程启动后，
            // 执行的任务代码
            public void run() {
                // 获得正在执行这行代码的现成对象
                Thread t = Thread.currentThread();
                for (int i = 1; i <= 1000; i++) {
                    System.out.println(
                            t.getName() + " - " + i);
                }
            }
        }

        Thread t1 = new Thread1();
        Thread t2 = new Thread1();
        System.out.println(t1.getName());
        System.out.println(t2.getName());


        Thread main = Thread.currentThread();

        t1.start(); // 启动该线程，执行线程中的 run() 方法
        System.out.println(main.getName() + " 线程中启动了 t1 线程");

        t2.start(); // 启动该线程，执行线程中的 run() 方法
        System.out.println(main.getName() + " 线程中启动了 t2 线程");

    }
}








