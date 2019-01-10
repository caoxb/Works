package tarena.day05;

// 二分法，
// 折半查找
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 23, 543, 543, 543, 4561, 4562, 4563};
        int index = binarySearch(arr, 543);
        System.out.println("543 在" + index + "位置");
    }

    /*
     * 在 arr 数组中查找 value 所在的位置,
     * 返回位置索引号，
     * 如果没有，返回负数表示无意义值
     */
    public static int binarySearch(int[] arr, int value) {
        int lo = 0;
        int hi = arr.length - 1;
        int m;
        // 高位指针不能低于低位指针，否则意味着找不到
        while (lo <= hi) {
            m = (lo + hi) / 2;
            if (value > arr[m]) {
                lo = m + 1;
            } else if (value < arr[m]) {
                hi = m - 1;
            } else {
                return m; // 找到
            }
        }
        return -1;// 找不到返回无意义值
    }
}