package tarena.day03;

public class Homework1 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("请输入年号");
		int y = sc.nextInt();

		if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
			System.out.println("闰年");
		} else {
			System.out.println("平年");
		}
	}
}
