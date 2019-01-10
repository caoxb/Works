package tarena.day07;
// Student 类从 Person 继承代码
// Student 是 Person 的子类
// Person 是 Student 的父类
// 继承属性变量、成员方法
// 不继承构造方法、私有成员
public class Student extends Person {
	private String school;
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getSchool() {
		return school;
	}
	
	
	public void a() {
		System.out.println(this.name);
		// System.out.println(this.age);
		this.setAge(20);
		System.out.println(this.getAge());
	}
}
