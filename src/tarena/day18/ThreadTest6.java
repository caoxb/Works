package tarena.day18;

import java.util.Scanner;

public class ThreadTest6 {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		class Thread1 extends Thread {
			boolean flag = true;			
			public void run() {
				int i=0;
				while(flag) {
					System.out.println(i++);
				}
			}
		}
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		new Scanner(System.in).nextLine();
		t1.flag = false;
	}
}	






