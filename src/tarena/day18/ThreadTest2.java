package tarena.day18;

public class ThreadTest2 {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		class Thread1 extends Thread {
			boolean y;
			public Thread1(boolean y) {
				this.y = y;
			}
			public void run() {
				String name = 
						Thread.currentThread().getName();
				for(int i=1;i<=1000;i++) {
					System.out.println(name + " - " +i);
					if(y) {
						Thread.yield();
					}
				}
			}
		}
		
		Thread t1 = new Thread1(true);
		Thread t2 = new Thread1(true);
		t1.setPriority(1);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
}






