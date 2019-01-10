package tarena.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        test2();
    }

    private static void test2() {
        List<Student> list =
                new ArrayList<Student>();
        Collections.addAll(list,
                new Student(12, "张三", 23),
                new Student(13, "李四", 21),
                new Student(14, "王五", 25),
                new Student(15, "赵六", 22),
                new Student(16, "张三三", 23),
                new Student(17, "李四四", 21));
        // 1. Student 类实现 Comparable 接口
        // 2. 外接比较器 Comparator 接口
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.getAge() > s2.getAge()) {
                    return 1;
                } else if (s1.getAge() < s2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (Student s : list) {
            System.out.println(
                    s.getName() + "," + s.getAge());
        }
    }

    private static void test1() {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list,
                "asdf", "we", "gye", "rty", "we");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        int i = Collections.binarySearch(list, "gye");
        System.out.println(i);

        Collections.shuffle(list);
        System.out.println(list);
    }
}





