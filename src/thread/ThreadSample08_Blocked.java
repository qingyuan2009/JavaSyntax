package thread;

public class ThreadSample08_Blocked {
	
	public static void main(String[] args) {
		Ticket12306 web = new Ticket12306();
		
		//�����̣߳�����һ����Դ��ticketnumber
		//������ �������̲߳���ȫ����
		//����Ʊ��1-->-1
		//����Ʊ��3-->-2
		new Thread(web, "����Ʊ��1").start();
		new Thread(web, "����Ʊ��2").start();
		new Thread(web, "����Ʊ��3").start();

	}
}

class Ticket12306 implements Runnable {
	
	private int ticketnumber = 100;
	
	@Override
	public void run() {
		while(true) {
			if (ticketnumber < 0) {				
				break;
			}
			try {
				//ģ����ʱ
				Thread.sleep(200);  //�߳���ľ�̬����
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
		}		
	}
}
