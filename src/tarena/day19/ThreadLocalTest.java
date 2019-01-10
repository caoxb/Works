package tarena.day19;

public class ThreadLocalTest {
    static ThreadLocal<Double> threadLocal = new ThreadLocal<Double>();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread() {
                public void run() {
                    test1();
                }
            }.start();
        }
    }

    private static void test1() {
        double d = Math.random();
        // 将 d 绑定到当前线程
        threadLocal.set(d);
        System.out.println("test1() - " + d);
        test2();
    }

    private static void test2() {
        // 访问在当前线程绑定的数据
        double d = threadLocal.get();
        System.out.println("test2() - " + d);
        test3();
    }

    private static void test3() {
        double d = threadLocal.get();
        // 移除在当前线程上绑定的数据
        threadLocal.remove();
        System.out.println("test3() - " + d);
    }
}







