package tarena.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileIOTest {
    public static void main(String[] args) throws Exception {
        copy(new File("d:/a.zip"),
                new File("d:/a_copy.zip"));
    }

    public static void copy(File from, File to)
            throws Exception {
        FileInputStream in =
                new FileInputStream(from);
        FileOutputStream out =
                new FileOutputStream(to);
//		int b;
//		while((b = in.read()) != -1) {
//			out.write(b);
//		}		
        byte[] buff = new byte[8192]; // 1k, 2k, 4k, 8k,1024,2048,4096,8192
        int n;
        while ((n = in.read(buff)) != -1) {
            out.write(buff, 0, n);
        }
        in.close();
        out.close();
    }


    private static void test3() throws Exception {
        FileInputStream in = new FileInputStream("d:/f3.txt");
        int b;
        while ((b = in.read()) != -1) {
            System.out.println(b);
        }
        in.read();
        System.out.println("------------------");
        in = new FileInputStream("d:/f3.txt");
        byte[] buff = new byte[4];
        int n; // 这次读取字节量
        while ((n = in.read(buff)) != -1) {
            for (int i = 0; i < n; i++) {
                System.out.println(buff[i]);
            }
            System.out.println("////////////");
        }
    }

    private static void test2() throws Exception {
        // 创建 FileInputStream
        // 测试 read() 和 read(byte[] buff)

        FileInputStream in = new FileInputStream("d:/f3.txt");
        int b = in.read();
        System.out.println(b);
        b = in.read();
        System.out.println(b);
        b = in.read();
        System.out.println(b);

        byte[] buff = new byte[5];

        int n = in.read(buff);
        System.out.println("读取了" + n + "个字节: ");
        System.out.println(Arrays.toString(buff));

        n = in.read(buff);
        System.out.println("读取了" + n + "个字节: ");
        System.out.println(Arrays.toString(buff));

        n = in.read(buff);
        System.out.println("读取了" + n + "个字节: ");
        System.out.println(Arrays.toString(buff));
    }

    private static void test1() throws Exception {
        FileOutputStream out = new FileOutputStream("d:/f3.txt");
        out.write(97); // 00 00 00 61
        out.write(98); // 00 00 00 62
        out.write(99); // 00 00 00 63
        out.write(0x4e); // 4e00 是中文 "一"
        out.write(0x00);

        //
        byte[] buff = {100, 101, 102, 103, 104, 105, 106};
        out.write(buff); // 输出数组中所有字节
        out.write(buff, 3, 3); // 输出数组中3位置的3个字节

        out.close();// 释放系统资源
    }
}
