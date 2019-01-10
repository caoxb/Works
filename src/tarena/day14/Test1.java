package tarena.day14;

class Test1 {
    public static void main(String[] args) {
        try {
            // 如果方法内部出错，会抛出一个异常对象
            int n = test1(3, 0);
            System.out.println(n);
        } catch (ArithmeticException e) { // 捕获test1()方法中抛出的异常对象
            String msg = e.getMessage();
            System.out.println(msg);
            e.printStackTrace();
        }

        System.out.println("出错之后还继续执行么？");
    }

    private static int test1(int n1, int n2) {
        /* n2 如果是 0，
         * 执行 / 0 运算时，
         * 虚拟机自动创建了 ArithmeticException 类型的对象，
         * 并从此方法传出（抛出）该异常对象
         */
        return n1 / n2;
    }
}
