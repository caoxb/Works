package tarena.day19;

public class StackTest {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        // 创建栈
        // 创建生产者
        // 创建消费者
        // 启动生产者
        // 启动消费者

        Stack stack = new Stack();
        Producer p = new Producer(stack);
        p.start();
        Consumer c = new Consumer(stack);
        c.start();


        while (true) {
            synchronized (stack) {
                stack.notifyAll();
            }
        }
    }
}
