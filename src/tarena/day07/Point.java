package tarena.day07;

public class Point {
	private int x;
	private int y;
	public Point() {
		System.out.println("Point()");
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(x, y)");
	}
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public int getX() {return x;}
	public int getY() {return y;}
	
	public double distance() {
		return Math.sqrt(x*x + y*y);
	}
	
}
