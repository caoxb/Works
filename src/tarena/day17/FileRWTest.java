package tarena.day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileRWTest {
    public static void main(String[] args) throws Exception {
        copy(
                new File("D:/workspace/corejava/src/tarena/day17/CharsetTest.java"),
                new File("d:/a.java"),
                "GBK",
                "UTF-8"
        );
    }

    public static void copy(
            File from, File to,
            String fromCharset, String toCharset) throws Exception {
        // 一行一行的复制
        // BufferedReader / PrintWriter
        BufferedReader in =
                new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(from), fromCharset));
        PrintWriter out = new PrintWriter(to, toCharset);
        String s;
        while ((s = in.readLine()) != null) {
            out.println(s);
        }
        in.close();
        out.flush();
        out.close();

    }


    private static void test2() throws Exception {
        BufferedReader in =
                new BufferedReader(
                        new FileReader(
                                "D:/workspace/corejava/src/tarena/day17/CharsetTest.java"));
        String s;
        // readLine() 返回折行字符之前的整行字符串
        while ((s = in.readLine()) != null) {
            System.out.println(s);
        }
        in.close();
    }

    private static void test1() throws Exception {
        FileWriter out = new FileWriter("d:/f9.txt");
        out.write("a中");
        out.flush();
        out.close();
    }
}








