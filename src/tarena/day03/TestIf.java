package tarena.day03;

public class TestIf {
	public static void main(String[] args) {
		System.out.println("主方法开始");
		test3();
		System.out.println("主方法结束");
	}

	public static void test3() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("输入工资：");
		int n = sc.nextInt();

		int n1 = n - 2000; 	// 工资-2000
		double r = 0;			// 税率
		int k = 0;				// 扣除数

		// 根据不同条件为税率 r 和 扣除数 k 赋不同的值
		if(n1>=0 && n1 < 500) {
			r = 0.05;
			k = 0;
		} else if(n1 >= 500 && n1 < 2000 ) {
			r = 0.1;
			k = 25;
		} else if(n1 >= 2000 && n1 < 5000 ) {
			r = 0.15;
			k = 125;
		} else if(n1 >= 5000 && n1 < 20000 ) {
			r = 0.2;
			k = 375;
		} else if(n1 >= 20000 && n1 < 40000 ) {
			r = 0.25;
			k = 1375;
		} else if(n1 >= 40000 && n1 < 60000 ) {
			r = 0.3;
			k = 3375;
		} else if(n1 >= 60000 && n1 < 80000 ) {
			r = 0.35;
			k = 6375;
		} else if(n1 >= 8000 && n1 < 100000 ) {
			r = 0.4;
			k = 10375;
		} else {
			r = 0.45;
			k = 15375;
		}

		double tax = n1 * r - k;
		System.out.println("应收税："+tax);
	}

	public static void test2() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("输入数字：");
		int n = sc.nextInt();

		if (n < 0) {
			System.out.println("负数");
		} else if (n > 100) {
			System.out.println("大于100");
		} else if (n > 0) {
			System.out.println("正数");
		} else {
			System.out.println("零");
		}
	}

	public static void test1() {
		System.out.println("代码行1");
		System.out.println("代码行2");
		System.out.println("代码行3");
	}
}
