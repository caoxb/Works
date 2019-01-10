package tarena.day04;

// 将原数组，复制为指定长度的新数组
public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {23, 6, 1};
        int[] newArray = copy(arr, 10);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    /**
     * @param arr 原数组
     * @param len 新数组长度
     * @return 复制的新数组
     */
    public static int[] copy(int[] arr, int len) {
        int[] arr2 = new int[len];
        int min = arr.length < len ? arr.length : len;
        for (int i = 0; i < min; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}






