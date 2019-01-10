package tarena.day19;

public class ThreadTest3 {
    static class Run1 implements Runnable {
        static int i;

        public synchronized void add() {
            i++;
            i++;
        }

        public synchronized int get() {
            return i;
        }

        public void run() {
            while (true) {
                add();
            }
        }
    }


    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Run1 r1 = new Run1();
        Thread t1 = new Thread(r1);
        t1.start();
        //
        Run1 r2 = new Run1();
        while (true) {
            int n = r2.get();
            if (n % 2 == 1) {
                System.out.println(n);
                //System.exit(0);
            }
        }
    }
}











