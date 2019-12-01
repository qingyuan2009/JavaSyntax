package thread;

public class ThreadSample03_12306 implements Runnable {
	
	private int ticketnumber = 100;
	
	@Override
	public void run() {
		while(true) {
			if (ticketnumber < 0) {				
				break;
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
		}		
	}
	
	public static void main(String[] args) {
		ThreadSample03_12306 web = new ThreadSample03_12306();
		
		//�����̣߳�����һ����Դ��ticketnumber
		//������ �������̲߳���ȫ���⣺���£�������˳��ݼ���
		//����Ʊ��2-->94
		//����Ʊ��3-->98
		//����Ʊ��1-->100
		new Thread(web, "����Ʊ��1").start();
		new Thread(web, "����Ʊ��2").start();
		new Thread(web, "����Ʊ��3").start();

	}


}
