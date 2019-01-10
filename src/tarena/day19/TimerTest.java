package tarena.day19;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		final TimerTask task1 = 
				new TimerTask() {
					public void run() {
						SimpleDateFormat f = 
								new SimpleDateFormat(
										"HH:mm:ss");
						System.out.println(
								f.format(new Date()));
					}
				};
		
		final Timer timer = new Timer();
		timer.schedule(task1, 3000, 1000);
		
		timer.schedule(new TimerTask() {
			public void run() {
				task1.cancel();
				timer.cancel();
			}
		}, 10000);
		
		new Scanner(System.in).nextLine();
		task1.cancel();
		timer.cancel();
		
	}
}
