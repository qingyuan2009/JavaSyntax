package thread;

public class ThreadSample03_12306 implements Runnable {
	
	private int ticketnumber = 100;
	
	@Override
	public void run() {
		while(true) {
			if (ticketnumber < 0) {				
				break;
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
		}		
	}
	
	public static void main(String[] args) {
		ThreadSample03_12306 web = new ThreadSample03_12306();
		
		//三个线程，共享一个资源：ticketnumber
		//并发： 这里有线程不安全问题：如下，并不是顺序递减的
		//代理票点2-->94
		//代理票点3-->98
		//代理票点1-->100
		new Thread(web, "代理票点1").start();
		new Thread(web, "代理票点2").start();
		new Thread(web, "代理票点3").start();

	}


}
