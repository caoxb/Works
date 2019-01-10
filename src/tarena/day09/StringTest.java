package tarena.day09;

public class StringTest {
	public static void main(String[] args) {
		test1();

		String s = "asdfasd";
	}

	private static void test2() {
		String s0 = " aoshd fqwue hfuwqfquw eq";
		String s = "";
		// 1970-1-1 0点毫秒值为 0
		long t = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			s += s0;
		}
		System.out.println(
				System.currentTimeMillis() - t);
	}


	private static void test1() {
		String s1 = "hello";// 常量池中的Srring实例
		String s2 = "hello";// 常量池中的Srring实例
		// new 在堆内存中创建实例
		String s3 = new String(
				new char[]{'h','e','l','l','o'});
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		// == 比较内存地址
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		// String 中重写了 equals 方法，比较每个字符
		System.out.println(s1.equals(s3));
	}
}
