package tarena.day04;

// 复制数组
public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {23, 5, 34, 21, 6, 4};
        int[] newArr = copy(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static int[] copy(int[] arr) {
        // 创建与参数数组相同长度的新数组
        int[] arr2 = new int[arr.length];

        // 遍历每一个位置，从参数数组向新数组复制
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        // 返回新数组
        return arr2;
    }
}
