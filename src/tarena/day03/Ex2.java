package tarena.day03;
// 寻找 100 以内，能被3整除，但不能被5整除的数
public class Ex2 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i % 3 == 0 && i % 5 != 0) {
				System.out.println(i);
			}
		}
	}
}
