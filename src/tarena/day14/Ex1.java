package tarena.day14;

// 求一个数字的阶乘
/*
 * f(1)=1
 * f(2)=2*f(2-1)
 * f(3)=3*f(3-1)
 * f(4)=4*f(4-1)
 * f(5)=5*f(5-1)
 */
public class Ex1 {
    public static long f(long n) {
        if (n == 1) {
            return 1;
        }
        long result = n * f(n - 1);
        return result;
    }

    public static void main(String[] args) {
        long r = f(3);
        System.out.println(r);
    }

}
