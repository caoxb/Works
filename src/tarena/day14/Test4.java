package tarena.day14;

public class Test4 {
    public static void main(String[] args) {
        double d = test1(3, 0);
        System.out.println(d);
    }

    private static double test1(double d1, double d2) {
        if (d2 == 0) {
            // 手动创建、抛出异常
            ArithmeticException e = new ArithmeticException("/ by zero");
            throw e;// 抛出 e, 在此处产生异常
        }
        return d1 / d2;
    }
}
