package tarena.day18;

public class ThreadTest3 {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		Thread t1 = new Thread() {
			public void run() {
				for(int i=1;i<=1000;i++) {
					System.out.println("t1 - "+i);
				}
			}
		};
		t1.start();
		for(int i=1;i<=1000;i++) {
			System.out.println("main - " + i);
			if(i == 500) {
				try {
					t1.join();// main会暂停，等待 t1 线程结束
				} catch(Exception e) {}
			}
		}

	}
}







