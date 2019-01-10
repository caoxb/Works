package tarena.day14;

import java.util.Scanner;

import tarena.day13.Student;

public class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 2);
            String s = new Scanner(System.in).nextLine();
            test1(s);
            test2(new Student(15, "asdf", 23));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("请不要直接按回车，先写字！！");
        } catch (Exception e) {
            System.out.println("出错!!!");
        } finally {
            // 一般在此处清理占用的系统资源
            // 独占的文件、网络连接、数据库连接
            System.out.println(
                    "只要执行了try块，" +
                            "不管出错不出错，" +
                            "finally 总会被执行");
        }
    }

    private static void test2(Student stu) {
        System.out.println(stu.getName());
        System.out.println(stu.getName().length());
    }

    private static void test1(String s) {
        System.out.println("首字母：" + s.charAt(0));
    }
}
