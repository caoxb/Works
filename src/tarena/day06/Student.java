package tarena.day06;

public class Student {
	// 属性
	// 成员变量具有默认值
	// 数字默认0
	// 引用类型默认 null
	int id;				// 学号
	String name;		// 姓名，字符串类型
	String gender;	// 性别，字符串类型
	int age;				// 年龄

	// 选课方法
	public void selectCourse() {
		System.out.println(name+" 在选课！");
	}
}	
