package tarena.day10;

public class StringTest {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		String s = "hello";
		String s2 = s.toUpperCase();
		System.out.println(s2);
		// 1. 方法完成什么功能
		// 2. 方法接收什么参数
		// 3. 方法返回什么
		String s3 = s.replace('l','*');
		System.out.println(s3);

		// substring
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 4));

		// endsWith
		System.out.println(s.endsWith("llo"));

		// charAt
		System.out.println(s.charAt(4));

		// indexOf
		System.out.println(s.indexOf("llo"));
	}
}
