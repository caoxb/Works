package tarena.day05;

public class Test1 {
    public static void main(String[] args) {
        test3();
    }

    public static void test3() {
        // 只创建了外围数组，
        // 每个位置存放 null 值，
        // 表示没有存放其他数组的内存地址
        int[][] arr = new int[3][];
        System.out.println(arr[0]);

        arr[0] = new int[]{2, 3};
        arr[1] = new int[]{4, 5, 6, 7};
        arr[2] = new int[]{6, 5, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }

    public static void test2() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }

    public static void test1() {
        // 创建了4个1维数组
        // 外面是存放 int[] 数组的数组
        // 里面的数组是存放 int 的一维数组
        int[][] arr = new int[3][3];
        arr[0][0] = 5;
        arr[2][2] = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }
}
