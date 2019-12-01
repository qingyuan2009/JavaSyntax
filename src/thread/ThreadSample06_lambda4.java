package thread;

public class ThreadSample06_lambda4 {	
	
	public static void main(String[] args) {		
		
		//使用lambda, Runnable->run()
		new Thread(()-> {
			for (int i = 0; i < 100; i++) {
				System.out.println("一边学习");				
			}
		}).start();
		
		new Thread(()-> {
			for (int i = 0; i < 100; i++) {
				System.out.println("一边唱歌");				
			}
		}).start();
	}

}

