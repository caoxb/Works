package tarena.day03;

//寻找一个整数的约数
public class Ex3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("请输入一个整数");
        int n = sc.nextInt();

        System.out.println(n + "的约数有：");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
