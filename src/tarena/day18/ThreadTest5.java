package tarena.day18;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThreadTest5 {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		Thread t1 = new Thread() {
			public void run() {
				SimpleDateFormat f =
						new SimpleDateFormat(
								"HH:mm:ss");
				try {
					while(true) {
						String s = f.format(new Date());
						System.out.println(s);
						//暂停一秒，如果暂停状态被打断
						//会出现中断异常
						Thread.sleep(1000);
					}
				} catch(InterruptedException e) {
					System.out.println("计时结束");
				}
			}
		};
		t1.start();
		new Scanner(System.in).nextLine();
		t1.interrupt();// main 线程中打断 t1 的暂停状态
	}
}







