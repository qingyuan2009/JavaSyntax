package thread;

public class ThreadSample06_lambda4 {	
	
	public static void main(String[] args) {		
		
		//ʹ��lambda, Runnable->run()
		new Thread(()-> {
			for (int i = 0; i < 100; i++) {
				System.out.println("һ��ѧϰ");				
			}
		}).start();
		
		new Thread(()-> {
			for (int i = 0; i < 100; i++) {
				System.out.println("һ�߳���");				
			}
		}).start();
	}

}

