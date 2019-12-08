package thread;

public class ThreadSample11 {

	public static void main(String[] args) {		
		System.out.println("爸爸和儿子买烟的故事");
		new Thread(new Farther()).start();

	}

}

class Farther extends Thread{	
	public void run() {
		System.out.println("爸爸想抽烟，让儿子去买");
		Thread son = new Thread(new Son());
		son.start();
		try {
			son.join();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("爸爸接过儿子买来的烟");
	}
}

class Son extends Thread{	
	public void run() {
		System.out.println("儿子去买烟");
		System.out.println("儿子在游戏厅玩了十秒");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println(i + " 秒过去了...");
		}
		System.out.println("儿子玩好游戏继续去买烟，买完烟，回家");
	}
}
