package tarena.day03;

// 求 100 - 999 内的水仙花数
public class Ex6 {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			int n1 = i % 10;			// 个位
			int n2 = i / 10 % 10;	// 十位
			int n3 = i / 100;			// 百位
			// 判断i的三位数字的立方和是否等于其自身
			if(i == n1*n1*n1 + n2*n2*n2 + n3*n3*n3) {
				System.out.println(i);
			}
		}
	}
}

