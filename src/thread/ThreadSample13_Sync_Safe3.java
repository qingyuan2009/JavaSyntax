package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadSample13_Sync_Safe3 {

	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			new Thread(() -> {
				//Ëø list object -> Í¬²½¿é
				synchronized (list) {
					list.add(Thread.currentThread().getName());
				}
			}).start();
		}
		Thread.sleep(1000);
		System.out.println(list.size());
	}

}
