package tarena.day12;

import java.util.HashMap;


public class HashMapTest {
    public static void main(String[] args) {
        test1();
    }

    private static void test2() {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(2, 5);

        HashMap map = new HashMap();
        map.put(p1, 100000);
        map.put(p2, 120000);

        System.out.println(map);
        //

        Point p3 = new Point(1, 6);
        map.put(p3, 150000);
        System.out.println(map);

        System.out.println(p1.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1.equals(p2));
    }

    private static void test1() {
        HashMap map = new HashMap();
        map.put("MON", "星期一");
        map.put("TUE", "星期二");
        map.put("WEN", "星期三");
        map.put(null, "---");
        map.put("NONE", null);
        map.put("TUE", "星期二二");
        map.put(null, null);
        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get("TUE"));
    }
}

