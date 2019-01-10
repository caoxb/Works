package tarena.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Serialize - 序列化
public class SerializeTest {
    public static void main(String[] args) throws Exception {
        //		List<Student> list =
        //				new ArrayList<Student>();
        //		Collections.addAll(
        //				list,
        //				new Student(11,"张三","男",new Date(),170),
        //				new Student(12,"李四","女",new Date(),160),
        //				new Student(13,"王五","女",new Date(),180),
        //				new Student(14,"赵六","男",new Date(),166));
        //		save(new File("d:/stu2.dat"), list);
        //		List<Student> list =
        //				load(new File("d:/stu2.dat"));
        //		for(Student stu: list) {
        //			System.out.println(stu.getName());
        //		}

        test1();
    }

    // 序列化保存一个集合
    public static void save(
            File f, List<Student> list) throws Exception {
        ObjectOutputStream out =
                new ObjectOutputStream(
                        new FileOutputStream(f));
        out.writeObject(list);
        out.flush();
        out.close();
    }

    // 反序列化恢复一个集合
    public static List<Student> load(File f) throws Exception {
        ObjectInputStream in =
                new ObjectInputStream(
                        new FileInputStream(f));
        List<Student> list =
                (List<Student>) in.readObject();
        in.close();
        return list;
    }


    private static void test2() throws Exception {
        ObjectInputStream in =
                new ObjectInputStream(
                        new FileInputStream("d:/f10.dat"));
        Student stu = (Student) in.readObject();
        System.out.println(stu.getId());
        System.out.println(stu.getName());
//		System.out.println(stu.getGender());
        System.out.println(stu.getBirthday());
        System.out.println(stu.getHeight());
        in.close();
    }


    private static void test1() throws Exception {
        Student stu =
                new Student(
                        198212, "张三", "男",
                        new Date(), 183);

        ObjectOutputStream out =
                new ObjectOutputStream(
                        new FileOutputStream(
                                "d:/f10.dat"));

        out.writeObject(stu);
        out.flush();
        out.close();
    }
}






