package thread;

//ʵ��Runnable�ӿ� -- �Ƽ�ʹ��
public class ThreadSample02_Runnable implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {			
			System.out.println("һ������");			
		}
	}	

	public static void main(String[] args) {
		new Thread(new ThreadSample02_Runnable()).start();		
		for (int i = 0; i < 500; i++) {			
			System.out.println("һ��д����");			
		}
	}

}