package tarena.day03;

public class TestWhile {
	public static void main(String[] args) {
		test2();
	}
	
	public static void test2() {
		int i =1;
		do {
			System.out.println(i++);
		} while(i<=10);		
	}
	
	public static void test1() {
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
	}
}
