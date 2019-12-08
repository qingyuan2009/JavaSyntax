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
		
		//״̬�� NEW
		State state = t.getState();
		System.out.println("״̬�� " + state.toString());
		
		//״̬�� RUNNABLE
		t.start();
		state = t.getState();
		System.out.println("״̬�� " + state.toString());
		
		while(true) {
			int num = Thread.activeCount(); //����߳���
			if (num == 1) {  //���ֻʣ�����߳�
				//״̬�� TERMINATED  �Զ�����
				state = t.getState();
				System.out.println("״̬�� " + state.toString());	
				break;
			}
			Thread.sleep(1000);
			//״̬�� TIMED_WAITING
			state = t.getState();
			System.out.println("״̬�� " + state.toString());		
		}
	}
}
