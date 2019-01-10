package tarena.day02;

public class Test6 {
	public static void main(String[] args) {
		// 4字节的int赋值给4字节的float
		// 可能会有精度损失
		float f = 0x7fffffff;
		System.out.println(0x7fffffff);
		System.out.println(f);
		// 0000000000000 00000000 10000000
		int i = 0x00000080;
		
		byte b = (byte) i;
		System.out.println(i);
		System.out.println(b);
	}
}
