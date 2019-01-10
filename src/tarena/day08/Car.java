package tarena.day08;

public class Car {
	static String brand;	// 品牌
	int weight; // 重量

	public void go() {
		System.out.println(brand+" 汽车启动");
	}

	public static void test() {
		// 静态代码块中不能使用实例的成员
		// System.out.println(weight);
	}
}
