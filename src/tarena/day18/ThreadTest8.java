package tarena.day18;

public class ThreadTest8 {
	public static void main(String[] args) {
		class Thread1 extends Thread {
			int start;
			int end;
			public Thread1(int start, int end) {
				this.start = start;
				this.end = end;
			}
			public void run() {
				zhiShu(start, end);
			}
		}
		
		new Thread1(3,2000000).start();
		new Thread1(2000000,4000000).start();
		new Thread1(4000000,6000000).start();
		new Thread1(6000000,8000000).start();
		new Thread1(8000000,1000000).start();
	}	
	
	// [start, end)
	public static void zhiShu(
			int start, int end) {
		outer:
		for(int i=start;i<end;i++) {
			for(int j=2;j<Math.sqrt(i)+1;j++) {
				if(i % j == 0) {
					continue outer;
				}
			}
			System.out.println(i);
		}
	}
	
}
