package tarena.day18;

public class ThreadTest4 {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		class Thread1 extends Thread {
			int t;
			public Thread1(int t) {
				this.t = t;
			}			
			public void run() {
				String name = 
						Thread.currentThread().getName();
				for(int i=1;i<=t;i++) {
					System.out.println(name+" - "+i);
				}
			}
		}
		
		Thread t1 = new Thread1(100);
		Thread t2 = new Thread1(10000);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
	}
}







