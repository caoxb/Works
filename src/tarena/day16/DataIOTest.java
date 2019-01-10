package tarena.day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataIOTest {
    public static void main(String[] args) throws Exception {
        //		File f =new File("d:/stu.dat");
        //		List<Student> list = new ArrayList<Student>();
        //		Collections.addAll(list,
        //				new Student("张三","男",23),
        //				new Student("李四","女",22),
        //				new Student("王五","女",26),
        //				new Student("赵六","男",25));
        //		save(f, list);

        List<Student> list =
                load(new File("d:/stu.dat"));
        for (Student stu : list) {
            System.out.println(stu.getName());
            System.out.println(stu.getGender());
            System.out.println(stu.getAge());
        }
    }

    // UTFUTFintUTFUTFintUTFUTFintUTFUTFint
    public static List<Student> load(File f) throws Exception {
        List<Student> list = new ArrayList<Student>();
        DataInputStream in =
                new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(f)));
        try {
            // in.available() 获得可读剩余字节量
            while (in.available() > 0) {
                String n = in.readUTF();// 连读三个数据
                String g = in.readUTF();
                int a = in.readInt();
                Student stu = new Student(n, g, a);// 封装为学生对象
                list.add(stu); // 学生对象放入集合
            }
        } catch (EOFException e) {
            e.printStackTrace();
        }    // 捕获到eof说明结束
        return list;
    }

    // 向文件 f 以固定字节格式保存学生信息
    // UTFUTFintUTFUTFintUTFUTFintUTFUTFint
    public static void save(
            File f, List<Student> list) throws Exception {
        DataOutputStream out =
                new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(f)));
        for (Student stu : list) {
            out.writeUTF(stu.getName());
            out.writeUTF(stu.getGender());
            out.writeInt(stu.getAge());
        }
        out.flush();
        out.close();
    }

    private static void test2() throws Exception {
        DataInputStream in =
                new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream("d:/f5.txt")));
        int i = in.readInt();
        double d = in.readDouble();
        long l = in.readLong();
        String s = in.readUTF();
        System.out.println(i);
        System.out.println(d);
        System.out.println(l);
        System.out.println(s);
        in.close();
    }

    private static void test1() throws Exception {
        DataOutputStream out =
                new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(
                                        "d:/f5.txt")));
        out.writeInt(987654321);
        out.writeDouble(3.14);
        out.writeLong(999999999999999L);
        out.writeUTF("a中");
        out.flush();
        out.close();
    }
}










