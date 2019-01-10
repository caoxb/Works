package tarena.day15;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        test6();
    }

    private static void test6() {
        // 存在的文件
        File f1 = new File("d:/b.txt");
        // 不存在的文件
        File f2 = new File("c:/b.txt");
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        // 磁盘文件会被重命名或移动
        // 但是，f1,f2 所表示的路径不变
        f1.renameTo(f2);
        System.out.println(f1.getName());
        System.out.println(f2.getName());
        System.out.println(f1.exists());
        System.out.println(f2.exists());
    }


    private static void test5() {
        File dir = new File("D:/Setup");
        // list()使用外接的过滤器，对每个文件进行判断
        String[] arr1 = dir.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.indexOf("-") >= 0;
            }
        });
        File[] arr2 = dir.listFiles(new FileFilter() {
            public boolean accept(File f) {
                return f.length() > 100 * 1024 * 1024;
            }
        });

        for (String s : arr1) {
            System.out.println(s);
        }
        System.out.println("----------------------");
        for (File f : arr2) {
            System.out.println(
                    f.getName() + " - " + f.length());
        }
    }

    private static void test4() {
        File dir = new File("D:/Setup");
        String[] arr1 = dir.list();
        File[] arr2 = dir.listFiles();

        for (String s : arr1) {
            System.out.println(s);
        }
        System.out.println("----------------------");
        for (File f : arr2) {
            System.out.println(
                    f.getName() + " - " + f.length());
        }
    }

    private static void test3() {
        File f1 = new File("d:/f1.txt");
        File f2 = new File("d:/aa");

        System.out.println(f1.exists());
        System.out.println(f2.exists());

        System.out.println(f1.delete());
        System.out.println(f2.delete());
    }


    private static void test2() throws IOException {
        File f1 = new File("d:/f1.txt");
        File f2 = new File("d:/aa");
        File f3 = new File("d:/aa/bb/cc");
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println(f3.exists());
        System.out.println(f1.createNewFile());
        System.out.println(f2.mkdir());
        System.out.println(f3.mkdirs());
        //
        File tmp =
                File.createTempFile("basdfasd", ".txt");
        System.out.println(tmp.getAbsolutePath());
    }


    private static void test1() {
        File f1 = new File("D:/Setup");
        System.out.println("路径是否存在: " + f1.exists());

        System.out.println("是否可执行: " + f1.canExecute());
        System.out.println("是否可读: " + f1.canRead());
        System.out.println("是否可写: " + f1.canWrite());
        System.out.println("是否隐藏文件: " + f1.isHidden());
        System.out.println("是否是文件: " + f1.isFile());
        System.out.println("是否是文件夹: " + f1.isDirectory());
        System.out.println("获得绝对路径字符串: " + f1.getAbsolutePath());
        System.out.println("获得文件名: " + f1.getName());
        System.out.println("获得所在目录路径: " + f1.getParent());
        System.out.println("获得最后修改时间: " + f1.lastModified());
        System.out.println("文件字节量: " + f1.length());

    }
}












