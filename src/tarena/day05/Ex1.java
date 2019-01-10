package tarena.day05;

// 指定整数范围，将范围内的数字生成数组
public class Ex1 {
    public static void main(String[] args) {
        int[] arr = select();
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static int[] select() {
        // 创建顺序存放 1-36 整数的数组
        int[] arr = createArray(1, 37);
        // 创建7个长度的新数组
        int[] result = new int[7];
        // 循环7次，产生7个数字
        for (int i = 0; i < 7; i++) {
            // 将 arr 数组中所有数字打乱顺序
            shuffle(arr);
            // 在 arr 数组中随机找一个位置 r
            int r = (int) (Math.random() * arr.length);
            // 将随机位置 r 中的数字放入 result 数组
            result[i] = arr[r];
            // 将随机位置r移除，并得到移除之后的新数组
            arr = remove(arr, r);
        }
        return result;
    }

    public static int[] remove(int[] arr, int i) {
        int[] arr2 = new int[arr.length - 1];
        if (i == 0) {
            System.arraycopy(arr, 1, arr2, 0, arr.length - 1);
        } else if (i == arr.length - 1) {
            System.arraycopy(arr, 0, arr2, 0, arr.length - 1);
        } else {
            System.arraycopy(arr, 0, arr2, 0, i);
            System.arraycopy(arr, i + 1, arr2, i, arr.length - i - 1);
        }
        return arr2;
    }

    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int r = (int) (Math.random() * arr.length);
            int tmp = arr[i];
            arr[i] = arr[r];
            arr[r] = tmp;
        }
    }

    // [min, max)
    public static int[] createArray(int min, int max) {
        int[] arr = new int[max - min];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + i;
        }
        return arr;
    }
}
