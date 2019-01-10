package tarena.day11;

public class Outer1 {
	private int i = 10;
	private static int j = 10;
	
	public void c(Inner1 i1) {
		i1.a();
	}
	
	public class Inner1 {
		public void a() {
			System.out.println("hello Inner1"+i);
		}
	}
	
	public static class Inner2 {
		public void b() {
			System.out.println("hello Inner2"+j);
		}
	}
}
