package tarena.day07;

public class Point3D extends Point {
	private int z;

	public Point3D() {
		//super(); //默认调用父类的无参构造方法
		// 如果父类没有无参构造方法，
		// 必须手动调用父类另外一个构造方法
		super(0, 0);
		System.out.println("Point3D()");
	}

	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return z;
	}

	// 父类 x,y 平面中计算据原点距离
	// 对于三维点子类不适用，
	// 在子类中可以重写此方法
	// 		1.签名(返回类型、方法名、参数列表)一一致
	//		2.访问范围不能变小
	//		3.抛出的异常不能更多
	public double distance() {
		//int x = this.getX();
		//int y = this.getY();
		//return Math.sqrt(x*x + y*y + z*z);
		// super.xxxx() 可以调用父类中的代码
		double d = super.distance();
		return Math.sqrt(d*d + z*z);
	}

}
