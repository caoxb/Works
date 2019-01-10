package tarena.day04;

public class Test1 {
    public static void main(String[] args) {
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        int n = sc.nextInt();
        if (zhiShu(n)) {
            System.out.println("质数");
        } else {
            System.out.println("不是质数");
        }
    }

    public static boolean zhiShu(int n) {
        if (n == 2) {
            return true;
        }
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    /*
     * 返回 a - z 随机字符
     */
    public static char randomChar() {
        char c = (char) ('a' + Math.random() * 26);
        return c;
    }


    /*
     * 接收三个整数，返回三个中的最大值
     */
    public static int max(int n1, int n2, int n3) {
        int x =
                n1 > n2 ?
                        (n1 > n3 ? n1 : n3) :
                        (n2 > n3 ? n2 : n3);
        return x;
    }


    public static double divide(int n1, int n2) {
        double d = n1 / (double) n2;
        return d; // 从此代码块内将 d 的值，传递出去
    }

    // void - 此方法不会传出运算结果
    public static void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}









