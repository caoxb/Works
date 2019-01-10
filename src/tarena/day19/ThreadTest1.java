package tarena.day19;

public class ThreadTest1 {
    static class Run1 implements Runnable {
        int i;

        public void add() {
            i++;
            i++;
        }

        public int get() {
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
        while (true) {
            int n = r1.get();
            if (n % 2 == 1) {
                System.out.println(n);
                //System.exit(0);
            }
        }
    }
}











