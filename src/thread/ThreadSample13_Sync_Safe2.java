package thread;

public class ThreadSample13_Sync_Safe2 {

	public static void main(String[] args) {
		Account account = new Account(100, "����");
		Thread t1 = new Drawing(account, 80, "��");
		Thread t2 = new Drawing(account, 90, "����");
		t1.start();
		t2.start();

		// �̲߳���ȫ
		// ��--> �ܹ�ȡ�ˣ�80
		// ��--> ���Ϊ��10
		// ����--> �ܹ�ȡ�ˣ�90
		// ����--> ���Ϊ��10
	}

}

class Account {
	int money;
	String name;

	public Account(int money, String name) {
		super();
		this.money = money;
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Drawing extends Thread {

	Account account;
	int drawingMoney;
	int drawingTotal;
	int pocketTotal;

	public Drawing(Account account, int drawingMoney, String name) {
		super(name);
		this.account = account;
		this.drawingMoney = drawingMoney;
	}

	@Override
	public void run() {
		test();
	}

	public void test() {
			
		//synchronized�� -> Lock Account object
		synchronized (account) {	
			if (account.money - drawingMoney < 0) {
				System.out.println(this.getName() + "--> ����");
				return;
			}	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.money -= drawingMoney;
			pocketTotal += drawingMoney;
			System.out.println(this.getName() + "--> �ܹ�ȡ�ˣ�" + pocketTotal);
			System.out.println(this.getName() + "--> ���Ϊ��" + account.money);
		}
	}
}
