package tarena.day04;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 10};
        reverse(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    // 反转
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - 1 - i);
        }
    }

    // 交换
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
