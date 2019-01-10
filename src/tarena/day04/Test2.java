package tarena.day04;

public class Test2 {
    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        char[] arr = new char[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('a' + i);
        }

        ///
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void test1() {
        int[] arr = new int[3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr = new int[]{23, 9};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
