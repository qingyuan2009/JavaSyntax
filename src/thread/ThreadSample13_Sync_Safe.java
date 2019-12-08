package thread;

public class ThreadSample13_Sync_Safe {

	public static void main(String[] args) {
		Web12306 web = new Web12306();

		// �����̣߳�����һ����Դ��ticketnumber
		// ������ �������̲߳���ȫ���⣺���£�������˳��ݼ���, ���ظ�����
		// ����Ʊ��2-->94
		// ����Ʊ��3-->94
		// ����Ʊ��3-->98
		// ����Ʊ��1-->100
		// ����Ʊ��1-->-1
		// ����Ʊ��3-->-2
		new Thread(web, "����Ʊ��1").start();
		new Thread(web, "����Ʊ��2").start();
		new Thread(web, "����Ʊ��3").start();

	}

}

class Web12306 implements Runnable {

	private int ticketnumber = 100;
	private boolean flag = true;

	@Override
	public void run() {
		while (this.flag) {
			//test();    //ʹ��synchronized������
			//test1();   //ʹ��synchronized����
			//test2();   //����ĳһ����, ����û����
			test3(); //��������������ķ�Χ�� Ч�����
		}
	}

	// ʹ��synchronized������, ��������this�������Դ
	public synchronized void test() {
		if (ticketnumber <= 0) {
			this.flag = false;
			return;
		}
		try {
			// ģ����ʱ
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
	}

	// ʹ��synchronized����, ������Ҳ��this�������Դ
	public void test1() {
		synchronized (this) {
			if (ticketnumber <= 0) {
				this.flag = false;
				return;
			}
			try {
				// ģ����ʱ
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
		}
	}

	// ʹ��synchronized����, ������ĳһ�����ԣ��̲߳���ȫ
	public void test2() {
		synchronized ((Integer) ticketnumber) {
			if (ticketnumber <= 0) {
				this.flag = false;
				return;
			}
			try {
				// ģ����ʱ
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
		}
	}
	
	//��������������ķ�Χ
	//double checking
	public void test3() {
		//����û��Ʊ������� �Ͳ�Ҫ�����߳�����
		if (ticketnumber <= 0) {
			this.flag = false;
			return;
		}
		synchronized ((Integer) ticketnumber) {
			//�������һ��Ʊ������� �ٽ�ֵ
			if (ticketnumber <= 0) {
				this.flag = false;
				return;
			}
			try {
				// ģ����ʱ
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
		}
	}
}
