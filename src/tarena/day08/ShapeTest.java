package tarena.day08;

public class ShapeTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		test2(c);
	}

	static void test2(Shape s) {
		// 方法调用是后期绑定
		s.draw();
	}




	static void test1() {
		//Shape s1 = new Shape();
	}
}	
