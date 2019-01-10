package tarena.day04;

// 求数组中的最大值
public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {123, 34, 54354, 234, 65543, 34};
        int n = max(arr);
        System.out.println(n);
    }

    public static int max(int[] arr) {
        int m = 0x80000000;
        for (int i = 0; i < arr.length; i++) {
            // 如果数组中的某个值比 m 大
            if (arr[i] > m) {
                m = arr[i]; // 则将数组中的较大值赋给 m
            }
        }
        return m;
    }
}
