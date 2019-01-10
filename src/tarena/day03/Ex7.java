package tarena.day03;

public class Ex7 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("第一个数：");
        int n1 = sc.nextInt();
        System.out.println("第二个数：");
        int n2 = sc.nextInt();

        int min = n1 < n2 ? n1 : n2;

        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
