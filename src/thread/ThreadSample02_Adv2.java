package thread;

//ʵ��Runnable�ӿ� -- �Ƽ�ʹ��
public class ThreadSample02_Adv2 {	

	public static void main(String[] args) {
		
		//�ֲ��ڲ��
		class Test implements Runnable {
			@Override
			public void run() {
				for (int i = 0; i < 500; i++) {
					System.out.println("һ������");
				}
			}
		}		
		
		new Thread(new Test()).start();
		for (int i = 0; i < 500; i++) {
			System.out.println("һ��д����");
		}
	}

}
