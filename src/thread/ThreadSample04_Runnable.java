package thread;

public class ThreadSample04_Runnable {

	public static void main(String[] args) {
		
		Racer rabbit = new Racer();
		Racer tortoise = new Racer();		
		
		new Thread(rabbit, "ÍÃ×Ó").start();
		new Thread(tortoise, "ÎÚ¹ê").start();	
	}

}

class Racer implements Runnable {
	private static String winner;

	private boolean gameOver(int steps) {
		if (winner != null) {
			return true;
		} else {
			if (steps == 100) {
				winner = Thread.currentThread().getName();
				System.out.println("winder is " + Thread.currentThread().getName());
				return true;
			} 
		}
		return false;		
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("ÍÃ×Ó")) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		for (int steps = 1; steps <= 100; steps++) {			 
			System.out.println(Thread.currentThread().getName() + "-->" + steps);
			if ( gameOver(steps)) {
				break;
			}
		}

	}

	
}
