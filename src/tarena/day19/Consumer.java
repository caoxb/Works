package tarena.day19;
// 消费者线程
public class Consumer extends Thread {
	private Stack stack;
	public Consumer(Stack stack) {
		this.stack = stack;
	}

	public void run() {
		while(true) {
			char c = stack.pop();
			System.out.println("弹出 --> "+c);
		}
	}
}
