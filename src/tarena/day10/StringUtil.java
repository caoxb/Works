package tarena.day10;

public class StringUtil {
	/*
	 * zhangsan@abc.com --> zhangsan
	 */
	public static String parseName(String email) {
		int index = email.indexOf("@");
		String s = email.substring(0, index);
		return s;
	}
	/*
	 * abcba,123443t1 正着念反着念都一样
	 */
	public static boolean huiWen(String s) {
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String name = StringUtil.parseName("asdf@asdf.com");
		boolean b = StringUtil.huiWen("abcba");
		System.out.println(name);
		System.out.println(b);
	}
}
