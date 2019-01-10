package tarena.day12;

import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        test2();
    }

    private static void test2() {
        Student stu1 =
                new Student(
                        23, "a张三", 12, new Date(), 183, 120);
        Student stu2 =
                new Student(
                        24, "z李四", 15, new Date(0), 166, 50);


        Comparator c1 = new Comparator() {
            // o1 > o2， 返回正数 o1 < o2， 返回负数 o1 = o2， 返回0
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                if (s1.getHeight() > s2.getHeight()) {
                    return 1;
                } else if (s1.getHeight() < s2.getHeight()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Comparator c2 = new Comparator() {
            // o1 > o2， 返回正数 o1 < o2， 返回负数 o1 = o2， 返回0
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                if (s1.getHandsome() > s2.getHandsome()) {
                    return 1;
                } else if (s1.getHandsome() < s2.getHandsome()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };


        TreeMap map = new TreeMap(c1);
        map.put(stu1, 98);
        map.put(stu2, 92);
        System.out.println(map);
    }


    private static void test1() {
        TreeMap map = new TreeMap();
        map.put(20, "随便1");
        map.put(16, "随便2");
        map.put(31, "随便3");
        map.put(18, "随便4");
        map.put(15, "随便5");
        map.put(17, "随便6");
        map.put(27, "随便7");
        map.put(33, "随便8");
        map.put(29, "随便9");

        System.out.println(map);
    }
}
