package thread;

public class ThreadSample07_Stop implements Runnable {

	private boolean flag = true;

	public static void main(String[] args) {
		ThreadSample07_Stop t = new ThreadSample07_Stop();
		new Thread(t).start();
		for (int i = 0; i < 100; i++) {

			System.out.println("Main --> " + i);
			if (i == 80)
				t.terminate();  //外部用标志位来终止线程
		}
	}

	@Override
	public void run() {
		int i = 1;
		while (flag) {
			System.out.println("Thread --> " + i++);
		}
	}

	public void terminate() {
		this.flag = false;
	}

}
