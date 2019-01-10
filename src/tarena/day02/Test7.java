package tarena.day02;

public class Test7 {
	public static void main(String[] args) {
		System.out.println(1 + 2 - 3 * 4 / 5);
		// 求余数
		// 求模（mod）
		System.out.println(10 % 3);

		// 创建一个用于获得用户控制台输入的工具
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int i1 = sc.nextInt(); // 获得用户输入的整数
		int i2 = sc.nextInt();
		System.out.println("i1=" + i1);
		System.out.println("i2=" + i2);

		if (i1 > i2) {
			System.out.println("i1 大");
		}
		if (i1 < i2) {
			System.out.println("i1 小");
		}
		if (i1 == i2) {
			System.out.println("i1, i2相等");
		}
		if (i1 != i2) {
			System.out.println("i1, i2不相等");
		}
		///////////////////
		if(i1 > i2 && i1 > 10) {
			System.out.println("i1 比 i2 大，且i1大于10");
		}
		if(i1 == i2 || i1 == 10) {
			System.out.println("i1 等于 i2 或者 i1 等于 10");
		}
	}
}
