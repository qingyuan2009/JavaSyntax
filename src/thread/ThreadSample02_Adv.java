package thread;

//ʵ��Runnable�ӿ� -- �Ƽ�ʹ��
public class ThreadSample02_Adv {

	//��̬�ڲ���
	static class Test implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				System.out.println("һ������");
			}
		}
	}

	public static void main(String[] args) {
		new Thread(new Test()).start();
		for (int i = 0; i < 500; i++) {
			System.out.println("һ��д����");
		}
	}

}
