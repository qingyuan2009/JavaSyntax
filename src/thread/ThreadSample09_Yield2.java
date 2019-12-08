package thread;

public class ThreadSample09_Yield2 {

	public static void main(String[] args) {
		new Thread(() -> {
			for (int i = 0; i < 100; i++) {				
				System.out.println("Lambda 线程" + i );
			}
		}).start();

		for (int i = 0; i < 100; i++) {			
			if (i % 20 == 0) {
				Thread.yield();				
			}
			System.out.println("Main 线程 " + i);
		}

	}

}
