package thread;

public class ThreadSample10_Join {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {				
				System.out.println("Lambda �߳�" + i );
			}
		});
		t1.start();

		for (int i = 0; i < 100; i++) {			
			if (i == 20) {
				t1.join(); 	//��ӣ�main�����̱߳�����		
			}
			System.out.println("Main �߳� " + i);
		}

	}

}
