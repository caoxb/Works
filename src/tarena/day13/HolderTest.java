package tarena.day13;

import java.util.Date;


public class HolderTest {
    public static void main(String[] args) {
        // 泛型信息仅在编译期起作用，
        // 运行期内存中不存在泛型信息，都是Object类型
        //		Holder<Integer> h = new Holder<Integer>();
        //		h.setValue(/*(Integer)*/56);
        //		test2(h);
        //		Integer o =/*(Integer)*/ h.getValue();
        //		System.out.println(o);
        //		Holder<Integer> h1 =
        //				new Holder<Integer>(5);
        //		Holder<Double> h3 =
        //				new Holder<Double>(3.14);
        //		Holder<String> h2 =
        //				new Holder<String>("asdf");
        //		test4(h1);
        //		test4(h3);
        // test4(h2);

        Holder<Integer> h = houZhu(345);
        System.out.println(h.getValue());
    }

    /* 创建 Holder 对象，将 t 放入 Holder 内
     */
    public static <T extends Number> Holder<T> houZhu(T t) {
        Holder<T> h = new Holder<T>(t);
        return h;
    }


    // 只接收放数字(Byte,Short,Integer,Float,Double)
    // 的 Holder
    // ? extends Number -
    //								特定的未知类型
    //								且必须继承自 Number
    private static void test4(Holder<? extends Number> h) {
        Number o = h.getValue();
        System.out.println(o);
    }

    // ? - 某种特定的未知类型
    private static void test3(Holder<?> h) {
        Object o = h.getValue();
        System.out.println(o);

        //h.setValue(...) // 不允许放入任何数据
    }

    private static void test2(Holder h) {
        Object o = h.getValue();
        System.out.println(o);
        h.setValue("abc");
    }

    private static void test1() {
        Holder h1 = new Holder();
        h1.setValue(5);
        h1.setValue("asd");
        h1.setValue(new Date());
        Object o = h1.getValue();
        System.out.println(o);
        //
        Holder<String> h2 = new Holder<String>();
        h2.setValue("asdf");
        String s = h2.getValue();
        System.out.println(s);
    }
}
