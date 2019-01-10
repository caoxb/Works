package tarena.day10;

import java.math.BigDecimal;
import java.math.BigInteger;

// Wrapper: 包装类
public class WrapperTest {
    public static void main(String[] args) {
        test4();
    }

    private static void test4() {
        System.out.println(2 - 1.9);
        System.out.println(4.35 * 100);

        BigDecimal bd1 = BigDecimal.valueOf(2);
        BigDecimal bd2 = BigDecimal.valueOf(1.9);
        BigDecimal bd3 = bd1.subtract(bd2);
        System.out.println(bd3.toString());
        System.out.println(bd3.doubleValue());
        BigInteger i1 = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger i2 = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger i3 = i1.add(i2);
        long n = i3.longValue();
        System.out.println(n);
        String s = i3.toString();
        System.out.println(s);
        double d = i3.doubleValue();
        System.out.println(d);
    }

    private static void test3() {
        double d1 = 3.0 / 0;
        double d2 = Math.sqrt(-2);
        System.out.println(d1);
        System.out.println(d2);
        if (Double.isInfinite(d1)) {
            System.out.println("无穷大");
        }
        if (Double.isNaN(d2)) {
            System.out.println("不是数");
        }
    }

    private static void test2() {
        int i1 = Integer.parseInt("2345");
        int i2 = Integer.parseInt("ff", 16);
        int i3 = Integer.parseInt("377", 8);
        int i4 = Integer.parseInt("11111111", 2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        System.out.println(Integer.toBinaryString(255));
        System.out.println(Integer.toOctalString(255));
        System.out.println(Integer.toHexString(255));
    }

    private static void test1() {
        // 创建：
        Integer i1 = new Integer(1000);
        // -128 至 127 间的数字实例会缓存重复使用
        Integer i2 = Integer.valueOf(1000);
        Integer i3 = Integer.valueOf(1000);
        System.out.println(i1 == i2);
        System.out.println(i2 == i3);


    }
}
