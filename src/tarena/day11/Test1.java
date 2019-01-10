package tarena.day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

    public static void main(String[] args) {
        Date m = test4("yyyy-MM-dd");
        System.out.println(m.toString());
    }

    public static Date test4(final String fmt) {
        // 匿名内部类, {} 是这个类的类体
        // 继承父类 Date
        // new 直接创建它的实例
        Date d = new Date() {
            public String toString() {
                SimpleDateFormat f = new SimpleDateFormat(fmt);
                String s = f.format(this);
                return s;
            }
        };
        return d;
    }

    private static Date test3(final String fmt) {
        class MyDate extends Date {
            public String toString() {
                // 局部内部类使用外面的一个局部变量
                // 这个局部变量必须是 final 的
                SimpleDateFormat f = new SimpleDateFormat(fmt);
                String s = f.format(this);
                return s;
            }
        }
        MyDate d = new MyDate();
        return d;
    }

    private static void test2() {
        class Inner1 {
            public void a() {
                System.out.println("Hello 局部内部类");
            }
        }
        Inner1 i1 = new Inner1();
        i1.a();
    }

    private static void test1() {
        // 静态 Inner2 属于类，直接用Outer1类创建
        Outer1.Inner2 i2 = new Outer1.Inner2();

        // 非静态 Inner1 属于实例，用 Outer1 的实例创建
        Outer1 o1 = new Outer1();
        Outer1.Inner1 i1 = o1.new Inner1();

        i2.b();
        i1.a();
    }
}
