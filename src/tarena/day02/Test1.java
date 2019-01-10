package tarena.day02;

public class Test1 {
	public static void main(String[] args) {
		byte b1 = 127;//声明变量 b1，并为其赋值 127
		byte b2 = -128;
		System.out.println(b1);
		System.out.println(b2);
		
		//
		short s1 = 0x7FFF;//01111111 11111111 
		short s2 = -0x8000;// 10000000 00000000
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = 077777;
		s2 = -0100000;
		System.out.println(s1);
		System.out.println(s2);
		
		// 声明 int 类型 i1, i2 用十六进制表示其最大最小值
		int i1 = 0x7FFFFFFF;
		int i2 = 0x80000000;
		System.out.println(i1);
		System.out.println(i2);
		
		// 声明 long 类型 l1, l2 用十六进制表示其最大最小值
		long l1 = 0x7FFFFFFFFFFFFFFFL;
		long l2 = 0x8000000000000000L;
		System.out.println(l1);
		System.out.println(l2);
	}
}
