package thread;

//�̳�Tread
public class ThreadSample01 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 80; i++) {			
			System.out.println("һ������");			
		}
	}	

	public static void main(String[] args) {
		ThreadSample01 thread = new ThreadSample01();
		//����Ҫ��start �������߳�
		thread.start();
		for (int i = 0; i < 80; i++) {			
			System.out.println("һ��д����");			
		}
	}

}
