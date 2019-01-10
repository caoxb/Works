package tarena.day07;


public class StudentTest {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		Student stu = new Student();
		stu.name = "张三";
		stu.setAge(20);
		System.out.println(stu.name);
		System.out.println(stu.getAge());
		
		stu.setSchool("tarena");
		System.out.println(stu.getSchool());
	}
}
