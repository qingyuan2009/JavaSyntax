package thread;

//�̳�Tread
public class ThreadSample01_Thread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 80; i++) {			
			System.out.println("һ������");			
		}
	}	

	public static void main(String[] args) {
		ThreadSample01_Thread thread = new ThreadSample01_Thread();
		//����Ҫ��start �������߳�
		thread.start();
		for (int i = 0; i < 80; i++) {			
			System.out.println("һ��д����");			
		}
	}

}
