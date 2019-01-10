package tarena.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 字符集：charset
 * 字符编码：encoding
 */
public class CharsetTest {
    public static void main(String[] args) throws Exception {
        copy(
                new File("d:/f7.txt"),
                new File("d:/f7_copy.txt"),
                "GBK",
                "GBK");
    }

    public static void copy(
            File from, File to,
            String fromCharset, String toCharset) throws Exception {

        InputStreamReader in =
                new InputStreamReader(
                        new FileInputStream(from), fromCharset);
        OutputStreamWriter out =
                new OutputStreamWriter(
                        new FileOutputStream(to), toCharset);

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        in.close();
        out.flush();
        out.close();

    }


    private static void test3() throws Exception {
        InputStreamReader in =
                new InputStreamReader(
                        new FileInputStream("d:/f7.txt"));
        // 文件中 gbk 字符集 --》java 内存中 unicode 字符集
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        in.close();
    }


    private static void test2() throws Exception {
        // UNICODE --> 指定字符集
        OutputStreamWriter out =
                new OutputStreamWriter(
                        new FileOutputStream("d:/f8.txt"),
                        "UTF-8");
        // 字符在java内存中是 unicode 编码，
        // write 方法将字符转换为指定字符编码
        out.write("a@中");
        out.flush();
        out.close();
    }


    private static void test1() throws Exception {
        // UNICODE ——》系统默认字符集
        OutputStreamWriter out =
                new OutputStreamWriter(
                        new FileOutputStream("d:/f7.txt"));

        // java 内存中字符都是 unicode 码,
        // write 方法会将字符编码转换为 GBK 编码保存至文件
        out.write("a@中");
        out.flush();
        out.close();
    }
}






