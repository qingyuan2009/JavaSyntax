package thread;

//ʵ��Runnable�ӿ� -- �Ƽ�ʹ��
public class ThreadSample02_Adv3 {	

	public static void main(String[] args) {		
		
		//�����ڲ��࣬ ��������ӿ� + ʵ����
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 500; i++) {
					System.out.println("һ������");
				}
			}			
		}).start();		
	
		for (int i = 0; i < 500; i++) {
			System.out.println("һ��д����");
		}
	}

}
