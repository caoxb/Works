package tarena.day08;

public class CarTest {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		//c1.brand = "BMW";
		//c2.brand = "BENZ";
		//c3.brand = "保十洁";
		Car.brand = "BMW";
		
		c1.go();
		c2.go();
		c3.go();
	}
}
