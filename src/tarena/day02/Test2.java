package tarena.day02;

public class Test2 {
	public static void main(String[] args) {
		double d1 = 3.14;
		double d2 = 3D;

		float f1 = 3.14F;
		float f2 = 0xFFFFFFFF;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(f1);
		System.out.println(f2);
		
		double d3 = 6.36E29;
		System.out.println(d3);
		
		//
		d1 = Double.MAX_VALUE;
		f1 = Float.MAX_VALUE;
		System.out.println(d1);
		System.out.println(f1);
	}
}
