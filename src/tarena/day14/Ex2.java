package tarena.day14;

/*
 * 斐波那契数列
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
 *
 *
 *  求第 n 个斐波那契数
 *  f(1)=1
 *  f(2)=1
 *  ...
 *  f(4)=...
 *  f(5)=f(4)+f(3)
 *  f(6)=f(5)+f(4)
 */
public class Ex2 {
    public static void main(String[] args) {
        long n = fbnq(8);
        System.out.println(n);
    }

    public static long fbnq(int n) {
        long n1 = 1;
        long n2 = 1;
        for (int i = 3; i <= n; i++) {
            n2 = n1 + n2;
            n1 = n2 - n1;
        }
        return n2;
    }

    public static long ____fbnq(int n) {
        if (n == 1 || n == 2) return 1;

        long result = fbnq(n - 1) + fbnq(n - 2);
        return result;
    }


}


