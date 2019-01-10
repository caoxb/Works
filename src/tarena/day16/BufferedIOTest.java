package tarena.day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedIOTest {
    public static void main(String[] args) throws Exception {
        encript(new File("d:/a.jpg"),
                new File("d:/a_enc.jpg"),
                698734);
    }

    public static void encript(
            File from, File to, int e) throws Exception {
        BufferedInputStream in =
                new BufferedInputStream(
                        new FileInputStream(from));
        BufferedOutputStream out =
                new BufferedOutputStream(
                        new FileOutputStream(to));
        int b;
        // 读取一个字节给b赋值，并判断 b 是否是 -1
        while ((b = in.read()) != -1) {
            b = b ^ e;
            out.write(b);
        }
        out.flush();
        out.close();
        in.close();


    }


    private static void test1() throws Exception {
        FileOutputStream fout =
                new FileOutputStream("d:/f4.txt");
        // 创建 BufferedOutputStream 与
        // FileOuputStream 相接
        BufferedOutputStream bout =
                new BufferedOutputStream(fout);

        /* 通过 BufferedOutputStream 输出的
         * 字节，会暂时缓存在其内部字节数组中(缓冲区中)，
         * 如果缓冲区满了，这些字节会自动刷出，
         * 也可以通关过调用 flush() 方法，手动刷出
         */
        bout.write(new byte[]{97, 98, 99, 100, 101});
        bout.flush(); // 刷出缓冲区的字节
        bout.close();
    }
}








