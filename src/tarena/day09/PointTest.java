package tarena.day09;

public class PointTest {
	public static void main(String[] args) {
		test2();
	}

	private static void test2() {
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,4);
		System.out.println(p1.equals(p2));
	}

	private static void test1() {
		Point p = new Point(6,1);
		System.out.println(p.toString());
	}
}
