package tarena.day09;

public class StudentTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        test3();
    }

    private static void test3() throws CloneNotSupportedException {
        Student stu1 = new Student(19929, "张三", 23);
        Student stu2 = (Student) stu1.clone();
        System.out.println(stu1 == stu2);
        System.out.println(stu1.equals(stu2));

        stu1 = null;
        System.gc(); // 建议jvm执行垃圾回收
    }

    private static void test2() {
        Student stu1 = new Student(19929, "张三", 23);
        Student stu2 = new Student(19929, "张三", 23);
        // == 比较变量的值
        System.out.println(stu1 == stu2);
        System.out.println(stu2.equals(stu1));
    }

    private static void test1() {
        Student stu = new Student(
                19929, "张三", 23);
        System.out.println(stu.toString());
    }
}
