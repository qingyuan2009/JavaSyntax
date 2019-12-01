package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadSample04_Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CRacer rabbit = new CRacer();
		CRacer tortoise = new CRacer();	
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Integer> resutl1 = service.submit(rabbit);
		Future<Integer> resutl2 = service.submit(tortoise);
		
		Integer r1 = resutl1.get();
		Integer r2 = resutl2.get();
		
		System.out.println(r1 + " " + r2);	
		
		service.shutdown();
	}

}

class CRacer implements Callable<Integer> {
	private static String winner;

	private boolean gameOver(int steps) {
		if (winner != null) {
			return true;
		} else {
			if (steps == 100) {
				if (Thread.currentThread().getName().equals("pool-1-thread-1")) {
					winner = "ÍÃ×Ó";
				} else winner = "ÎÚ¹ê";
				System.out.println("The winner is " + winner);				
				return true;
			} 
		}
		return false;		
	}

	@Override
	public Integer call() throws Exception {
		if (Thread.currentThread().getName().equals("pool-1-thread-1")) {			
				Thread.sleep(10);		
		}
		for (int steps = 1; steps <= 100; steps++) {			 
			System.out.println(Thread.currentThread().getName() + "-->" + steps);
			if ( gameOver(steps)) {
				return steps;
			}
		}
		return null;
	}	
}
