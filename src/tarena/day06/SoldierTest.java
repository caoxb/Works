package tarena.day06;

public class SoldierTest {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		// 定义一个类，在java类型系统中
		// 成为一种新的数据类型
		Soldier s1 = new Soldier();
		System.out.println(s1.blood);
		s1.go();
		s1.standby();
		
		Soldier s2 = new Soldier();
		s2.blood = 50;
		s2.go();
		
		System.out.println(s1.blood);
	}
}
