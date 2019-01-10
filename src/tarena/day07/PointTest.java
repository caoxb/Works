package tarena.day07;

public class PointTest {
	public static void main(String[] args) {
		Point3D p = new Point3D();
		p.setX(3);
		p.setY(9);
		p.setZ(5);
		System.out.println(p.distance());
		
		Point p1 = new Point();
		p1.setX(3);
		p1.setY(9);
		System.out.println(p1.distance());
	}
}
