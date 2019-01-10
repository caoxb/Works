package tarena.day16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws Exception {
        test1();
    }

    private static void test1() throws Exception {
        //		PrintStream out =
        //				new PrintStream(
        //						new FileOutputStream(
        //								"d:/f6.txt"));
        PrintStream out =
                new PrintStream(new File("d:/f6.txt"));
        out.print("hello");
        out.println("world");
        out.print("你好");
        out.println("世界");
        out.println(new Student("zhangsan", "M", 12));
        out.close();
    }
}





