package tarena.day06;

public class StudentTest {
	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		// 创建学生实例，并赋值给s1变量
		// s1变量中保存的是学生实例的内存首地址
		Student s1 = new Student();
		// 给学生 s1 中的四个属性赋值
		s1.id = 3242;
		s1.name = "张三";
		s1.gender = "男";
		s1.age = 12;
		// 显示学生 s1 中属性的值
		System.out.println(s1.id);
		System.out.println(s1.name);

		// 同过学生 s1
		// 执行selectCourse()方法中的代码
		s1.selectCourse();

		Student s2 = new Student();
		s2.name = "李四";
		s2.selectCourse();
	}
}
