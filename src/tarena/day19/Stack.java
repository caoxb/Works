package tarena.day19;

// 栈
public class Stack {
	private char[] arr = new char[2];
	private int index;

	public synchronized void push(char c) {
		while(index == arr.length) {
			// 让当前线程在此暂停
			// 当前线程会在当前对象上等待
			try{
				wait();
			} catch(InterruptedException e) {}
		}
		arr[index] = c;
		index++;
		// 在当前对象上发出通知
		// 会通知到其他在当前对象上等待的线程
		notifyAll();
	}
	public synchronized char pop() {
		while(index == 0) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		index--;
		char c = arr[index];
		notifyAll();
		return c;
	}
}
