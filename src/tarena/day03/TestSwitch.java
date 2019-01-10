package tarena.day03;

public class TestSwitch {
    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("输入月份：");

        int m = sc.nextInt();
        /*
         * xxx月有 30 天
         * xxx月有 31 天
         * 2 月有28或29天
         * 您输入了错误的月份：xxx
         */
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(m + "月有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(m + "月有30天");
                break;
            case 2:
                System.out.println("2 月有28天或29天");
                break;
            default:
                System.out.println("您输入了错误的月份：" + m);
        }
    }

    public static void test1() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("输入数字：");

        int n = sc.nextInt();
        // 一个条件成立，
        // 会从这个分支开始向后执行所有分支，
        // 直到遇到一个 break 为止
        switch (n) {
            case 1:
                System.out.println("一");
            case 2:
                System.out.println("二");
                break; // 中断
            case 3:
                System.out.println("三");
            default:
                System.out.println("输入的数字是：" + n);
        }
        System.out.println("switch结束");
    }
}
