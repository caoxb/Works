package tarena.day07;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		Person p1 = new Person();
		p1.name = "张三";
		// 不允许直接访问Person对象内的age变量
		// 隐藏age变量
		// p1.age = 1000;
		p1.setAge(20);
		int a = p1.getAge();
		System.out.println(a);
	}
}
