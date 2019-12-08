package thread;

public class ThreadSample13_Sync_Safe2 {

	public static void main(String[] args) {
		Account account = new Account(100, "工资");
		Thread t1 = new Drawing(account, 80, "我");
		Thread t2 = new Drawing(account, 90, "老婆");
		t1.start();
		t2.start();

		// 线程不安全
		// 我--> 总共取了：80
		// 我--> 余额为：10
		// 老婆--> 总共取了：90
		// 老婆--> 余额为：10
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
			
		//synchronized块 -> Lock Account object
		synchronized (account) {	
			if (account.money - drawingMoney < 0) {
				System.out.println(this.getName() + "--> 余额不足");
				return;
			}	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.money -= drawingMoney;
			pocketTotal += drawingMoney;
			System.out.println(this.getName() + "--> 总共取了：" + pocketTotal);
			System.out.println(this.getName() + "--> 余额为：" + account.money);
		}
	}
}
