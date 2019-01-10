package tarena.day03;

public class TestFor {
    public static void main(String[] args) {
        test3();
    }

    public static void test3() {
        for (int i = 1, j = 1;            // 逗号隔开声明多个变量
             i <= 10 && j <= 100;
             i++, j += 10) {            // 逗号隔开做多项数据修改
            System.out.println("i = " + i + ", j = " + j);
        }
    }

    public static void test2() {
        for (int i = 1; ; ) {
            System.out.println(i++);
            if (i > 10) {
                break;// 中断循环
            }
        }

    }

    public static void test1() {
        for (int i = 1;
             i <= 10;
             i++) {
            System.out.println(i);
        }
    }
}
