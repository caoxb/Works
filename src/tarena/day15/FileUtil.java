package tarena.day15;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static boolean dirDelete(File dir) {
        File[] arr = dir.listFiles();
        for (File f : arr) {
            if (f.isFile()) {// f是文件
                if (!f.delete()) {//如果f文件删不掉
                    return false;
                }
            } else {// f是目录
                if (!dirDelete(f)) {//如果f目录删不掉
                    return false;
                }
            }
        }
        return dir.delete();
    }


    public static List<File> find(File dir, String regex) {
        List<File> list = new ArrayList<File>();
        File[] arr = dir.listFiles();
        for (File f : arr) {
            if (f.isFile()) {// f是文件
                if (f.getName().matches(regex)) {
                    list.add(f);
                }
            } else { // f是目录
                // 递归从子目录f中找到所有匹配的文件
                List<File> list2 = find(f, regex);
                list.addAll(list2);
            }
        }
        return list;
    }

    public static long dirLength(File dir) {
        File[] arr = dir.listFiles();
        long len = 0;
        for (File f : arr) {
            if (f.isFile()) {// f是文件
                len += f.length();
            } else {// f是目录
                len += dirLength(f);// 递归求f目录的大小
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(dirDelete(new File("d:/___workspace")));
    }

}
