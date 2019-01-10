package tarena.day07;

public class ShapeTest {
	public static void main(String[] args) {
		test2();
	}	
	public static void test2() {
		test3(new Line());
		Shape s = new Circle();
		test3(s);
		Rectangle r = new Rectangle();
		test3(r);
		Shape s2 = new Shape();
		test3(s2);
	}
	public static void test3(Shape s) {
		// s.length(); // 子类中特有成员被隐藏
		s.draw();
		if(s instanceof Line) {
			// 通过判断，可以保证安全的转型
			Line l= (Line) s;
			System.out.println(l.length());
		}
	}

	public static void test1() {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Line l = new Line();
		
		c.draw();
		c.clear();
		r.draw();
		r.clear();
		l.draw();
		l.clear();
	}
}
