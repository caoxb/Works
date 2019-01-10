package tarena.day04;

import javax.tools.JavaCompiler;

public class Test3 {
    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        int[] arr = {12, 4, 3, 46, 54, 3, 6};
        // toString方法将数组中的数据连接为一个字符串
        String s = java.util.Arrays.toString(arr);
        System.out.println(s);

        // 将数组复制为指定长度的新数组
        int[] arr2 = java.util.Arrays.copyOf(arr, 5);
        System.out.println(java.util.Arrays.toString(arr2));
    }

    public static void test1() {
        int[] arr = {2, 3, 4, 5, 6, 7};
        int[] newArr = new int[arr.length];

        System.arraycopy(arr, 0, newArr, 0, arr.length);

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

}
