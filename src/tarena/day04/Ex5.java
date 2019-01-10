package tarena.day04;

// 向数组中指定位置插入一个值
public class Ex5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = insert(arr, 4, 5);
        System.out.println(java.util.Arrays.toString(arr2));
    }

    // 向 arr 中的 i 位置插入 value
    public static int[] insert(int[] arr, int i, int value) {
        int[] arr2 = new int[arr.length + 1];
        System.arraycopy(arr, 0, arr2, 0, i);
        System.arraycopy(arr, i, arr2, i + 1, arr.length - i);
        arr2[i] = value;
        return arr2;
    }
}
