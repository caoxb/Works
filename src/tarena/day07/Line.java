package tarena.day07;

public class Line extends Shape {
	public void draw() {
		System.out.println("-");
	}

	/*
	 * 返回线段长度
	 */
	public int length() {
		return 10;
	}
}
