package tarena.day08;
import tarena.day07.Point;
public class FinalTest {
	static final double PI = 3.14;
	
	
	public static void main(String[] args) {
		test1();
	}
	public static void test1() {
		final int i = 10;
		// i = 100; // 变量的值不可变

		final Point p = new Point(3, 5);
		p.setX(30);
		p.setY(50);
		System.out.println(p.getX());
		// p = new Point(); // 引用变量的值是对象内存地址
	}
}
