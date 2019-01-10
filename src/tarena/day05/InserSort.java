package tarena.day05;

// 插入排序算法
public class InserSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 4, 9, 2};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    /*
     * 对给定数组中数据进行排序
     */
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] <= arr[j + 1]) {
                    break;
                }
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }
}




