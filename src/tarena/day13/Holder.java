package tarena.day13;
// Holder 吼住任何对象
// 定义类型参数 T
public class Holder<T> {
	private T value;

	public Holder() {
		super();
	}

	public Holder(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
