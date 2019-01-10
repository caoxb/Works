package tarena.day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 线程池测试
public class ThreadPoolTest {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        class Run1 implements Runnable {
            int id;

            public Run1(int id) {
                this.id = id;
            }

            public void run() {
                String name =
                        Thread.currentThread().getName();
                System.out.println(name + " - 任务" + id);
            }
        }
        ExecutorService pool =
                Executors.newFixedThreadPool(3);
        //Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            pool.execute(new Run1(i));
        }
    }
}








