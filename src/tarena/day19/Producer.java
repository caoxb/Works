package tarena.day19;
// 生产者线程
public class Producer extends Thread {
	private Stack stack;
	public Producer(Stack stack) {
		this.stack = stack;
	}

	public void run() {
		while(true) {
			char c = (char) (Math.random() * 26 + 'a');
			stack.push(c);
			System.out.println("压入 <-- " + c);
		}
	}
}
