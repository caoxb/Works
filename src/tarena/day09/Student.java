package tarena.day09;

public class Student /*extends Object*/ implements Cloneable {
	private int id;
	private String name;
	private int age;


	public Student() {
		//super();
		// 独占打开一个磁盘文件
		// 建立网络连接
		// 连接数据库
	}
	public Student(int id, String name, int age) {
		//super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		String s =
				"id: "+this.id+
						", name: "+this.name+
						", age: "+this.age;
		return s;
	}

	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		if(!  (obj instanceof Student)) return false;

		// 自己的属性是否等于 obj 中的属性
		Student stu = (Student) obj;
		if(this.id == stu.id &&
				this.name.equals(stu.name) &&
				this.age == stu.age){
			return true;
		} else {
			return false;
		}
	}

	// 垃圾回收器回收此对象占用内存时,
	// 自动调用此方法
	public void finalize() {
		// 释放独占的文件
		// 断开网络连接
		// 断开数据库连接...
		System.out.println(name+" 占用的内存即将被清理");
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}



