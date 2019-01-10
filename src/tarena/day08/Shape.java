package tarena.day08;
// 存在抽象方法的类必须是抽象类（半成品类）
public abstract class Shape {

	public Shape() {
		System.out.println("-----");
	}

	/* 抽象方法
	 * 声明 Shape 类型对象中存在一个 draw 方法,
	 * 但此处不写具体代码实现
	 */
	public abstract void draw();


	public void clear() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
	}
}
