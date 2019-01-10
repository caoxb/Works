package tarena.day07;
// 测试参数传递
public class ParamTest {
	public static void main(String[] args) {
		//		int i = 10;
		//		test1(i);// 传递基本类型i变量的值（数值）
		//		System.out.println(i);

		Point p1 = new Point(3,4);
		test2(p1);// 传递引用变量的值（对象内存首地址）
		System.out.println(p1.getX());
		System.out.println(p1.getY());
	}

	public static void test2(Point p1) {
		p1.setX(1);
		p1.setY(1);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
	}


	public static void test1(int i) {
		i = i+1;
		System.out.println(i);
	}
}
