package tarena.day07;

public class Person {
	String name;
	/* private 限制一个成员变量或方法或构造方法，
	 * 只能在当前类内部访问
	 */
	private int age;
	
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age) {
		if(age <6 || age > 60) {
			return;
		}
		this.age = age;
	}
	public int getAge() {
		if(this.age > 25) {
			return 25;
		}
		return this.age;
	}
}	
