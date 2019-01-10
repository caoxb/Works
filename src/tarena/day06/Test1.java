package tarena.day06;
import java.util.Arrays;// 指明路径
import java.util.Scanner;// 指明路径

public class Test1 {
	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		int[] arr = {1234,54,34,6,56,45,765,45,54,75};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int index = Arrays.binarySearch(arr, 34);
		System.out.println(index);

		Arrays.fill(arr, 9);
		System.out.println(Arrays.toString(arr));
	}
}



