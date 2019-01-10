package tarena.day15;

import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws Exception {
        test2();
    }

    private static void test2() throws Exception {
        RandomAccessFile r =
                new RandomAccessFile("d:/a.bmp", "rw");
        r.seek(18);
        int w = r.readInt();
        int h = r.readInt();
        System.out.println(w);
        System.out.println(h);
        // 01 02 03 04 --> 04 03 02 01
        int width = w >>> 24; // 00 00 00 01
        width |= (w & 0x00ff0000) >>> 8;
        width |= (w & 0x0000ff00) << 8;
        width |= w << 24;
        int height = h >>> 24; // 00 00 00 01
        height |= (h & 0x00ff0000) >>> 8;
        height |= (h & 0x0000ff00) << 8;
        height |= h << 24;
        System.out.println(width);
        System.out.println(height);
        r.seek(54);
        while (r.getFilePointer() < r.length()) {
            int b = r.read();
            b = ~b;
            r.seek(r.getFilePointer() - 1);
            r.write(b);
        }
    }


    private static void test1() throws Exception {
        // 文件找不到异常 FileNotFoundException
        // 此构造方法，文件不存在会新建文件，
        // 如果所在目录不存在，会出现异常
        RandomAccessFile r =
                new RandomAccessFile(
                        "d:/f2.txt", "rw");
        r.write(97);    // 00 00 00 61 --> 61
        r.write(354);    // 00 00 01 62 --> 62

        r.writeInt(Integer.MAX_VALUE); // 7f ff ff ff
        r.writeDouble(3.14); // 表示 double 的 8 个字节
        r.writeUTF("a中"); // UTF-8格式输出字符串

        r.seek(0); // 将指针定位到 0 位置

        int n = r.read(); // 61 --> 00 00 00 61
        System.out.println(n);
        n = r.read();
        System.out.println(n);
        System.out.println("-->" + r.getFilePointer());
        int n2 = r.readInt();// 读四个字节
        System.out.println("-->" + r.getFilePointer());
        double d = r.readDouble();// 读八个字节
        System.out.println("-->" + r.getFilePointer());
        String s = r.readUTF();// 先读2字节确定字节量，再度相应的字节数量
        System.out.println(n2);
        System.out.println(d);
        System.out.println(s);


        //		n = r.read(); // 已经没有数据，读到-1
        //		System.out.println(n);
    }
}
