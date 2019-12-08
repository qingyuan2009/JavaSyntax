package thread;

import java.lang.Thread.State;

public class ThreadSample12_State {

	public static void main(String[] args) throws InterruptedException {		
		
		Thread t = new Thread(()-> {
			for (int i = 0; i < 5; i++) {				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {						
					e.printStackTrace();
				}				
			System.out.println("...");
			}			
		});	
		
		//状态： NEW
		State state = t.getState();
		System.out.println("状态： " + state.toString());
		
		//状态： RUNNABLE
		t.start();
		state = t.getState();
		System.out.println("状态： " + state.toString());
		
		while(true) {
			int num = Thread.activeCount(); //活动的线程数
			if (num == 1) {  //如果只剩下主线程
				//状态： TERMINATED  自动死亡
				state = t.getState();
				System.out.println("状态： " + state.toString());	
				break;
			}
			Thread.sleep(1000);
			//状态： TIMED_WAITING
			state = t.getState();
			System.out.println("状态： " + state.toString());		
		}
	}
}
