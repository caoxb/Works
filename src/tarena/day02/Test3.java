package tarena.day02;

public class Test3 {
	public static void main(String[] args) {
		char c1 = 'a';// 00000000 01100001 - 97
		char c2 = 'b';// 20013
		
		c1 = 97;
		c2 = 20013;
		
		c1 = '\u0061';
		c2 = '\u4e2d';
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1 + 1);
		System.out.println(c2 + 1);
	}
}
