package thread;

//ʵ��Runnable�ӿ� -- �Ƽ�ʹ��
public class ThreadSample02_Adv4 {

	public static void main(String[] args) {

		// jdk8 �� lambda���ʽ
		// ȡ���ӿںͺ�����ֻ��ע��κ��߳���
		new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				System.out.println("һ������");
			}
		}).start();

		for (int i = 0; i < 500; i++) {
			System.out.println("һ��д����");
		}
	}

}
