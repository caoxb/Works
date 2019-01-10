package tarena.day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) throws ParseException{
		test3();
	}

	private static void test3() throws ParseException{
		/*
		 * 输入生日(yyyy-MM-dd)：19.........
		 * 您已经生存了xxxx天
		 * 当前毫秒值： System.currentTimeMillis()
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("输入生日(yyyy-MM-dd)：");
		String s = sc.nextLine();

		// s --> Date实例 --> 取出内部毫秒值
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date d = f.parse(s);
		long t = d.getTime();

		// 当前时间毫秒值 - t
		t = System.currentTimeMillis() - t;
		t = t / 24 / 60 / 60 / 1000;
		System.out.println("您已存活了 "+t+" 天");
	}

	private static void test2() throws ParseException{
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = new Date();
		String s = f.format(d);// Date 格式化为字符串
		System.out.println(s);
		//
		s = "1986-8-2 12:10:49";
		d = f.parse(s);// 字符串解析为 Date 实例
		System.out.println(d);
	}

	private static void test1() {
		Date d1 = new Date();
		Date d2 = new Date(0);// 格林尼治时间

		// println 方法内部，会调用对象的 toString() 方法
		// 并打印 toString() 返回的字符串
		System.out.println(d1);
		System.out.println(d2);

		System.out.println(d1.getTime());
		System.out.println(d2.getTime());
	}
}
