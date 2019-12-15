package thread;

public class ThreadSample15_Daemon {

	public static void main(String[] args) {
		YourLife yourlife = new YourLife();
		God god = new God();
		Thread t1 = new Thread(yourlife);
		Thread t2 = new Thread(god);
		t2.setDaemon(true); //非用户线程，而是守护线程
		
		//当用户线程结束，守护线程也结束
		t1.start();
		t2.start();
	}

}

class YourLife implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 365*100; i++) {
			System.out.println("Happy life day...");			
		}
		System.out.println("ooo...");
	}	
}

class God implements Runnable{
	@Override
	public void run() {
		while (true) {
			System.out.println("God bless you...");			
		}		
	}	
	
}
