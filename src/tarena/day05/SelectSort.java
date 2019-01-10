package tarena.day05;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {23, 54, 34, 64, 4, 45, 76, 4};
        sort(arr);
        System.out.println(
                java.util.Arrays.toString(arr));
    }

    /*
     * i 在递增过程中，从i向后选择一个最小值，
     * 与i位置交换
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int pos = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = tmp;
        }
    }
}
