package tarena.day02;

public class Test10 {
	public static void main(String[] args) {
		java.util.Scanner sc = 
				new java.util.Scanner(System.in);
		System.out.println("请输入数字1:");
		int n1 = sc.nextInt();
		System.out.println("请输入数字2：");
		int n2 = sc.nextInt();
		System.out.println("请输入数字3：");
		int n3 = sc.nextInt();
		
		
		System.out.println("输入的最大数字为：");
		int max = 
				n1>n2 ? 
				(n1>n3? n1 : n3) :  
				(n2>n3? n2 : n3);
		System.out.println(max);
	}
}
