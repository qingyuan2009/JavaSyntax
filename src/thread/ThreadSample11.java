package thread;

public class ThreadSample11 {

	public static void main(String[] args) {		
		System.out.println("�ְֺͶ������̵Ĺ���");
		new Thread(new Farther()).start();

	}

}

class Farther extends Thread{	
	public void run() {
		System.out.println("�ְ�����̣��ö���ȥ��");
		Thread son = new Thread(new Son());
		son.start();
		try {
			son.join();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("�ְֽӹ�������������");
	}
}

class Son extends Thread{	
	public void run() {
		System.out.println("����ȥ����");
		System.out.println("��������Ϸ������ʮ��");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println(i + " ���ȥ��...");
		}
		System.out.println("���������Ϸ����ȥ���̣������̣��ؼ�");
	}
}
