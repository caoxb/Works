package tarena.day03;
//求数字1-10，每个数字的阶乘
public class Ex4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int jc = 1;
			for(int j=1;j<=i;j++) {
				jc = jc * j;
			}
			System.out.println(i+"! = "+jc);
		}
	}
}
