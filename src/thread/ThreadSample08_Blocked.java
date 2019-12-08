package thread;

public class ThreadSample08_Blocked {
	
	public static void main(String[] args) {
		Ticket12306 web = new Ticket12306();
		
		//三个线程，共享一个资源：ticketnumber
		//并发： 这里有线程不安全问题
		//代理票点1-->-1
		//代理票点3-->-2
		new Thread(web, "代理票点1").start();
		new Thread(web, "代理票点2").start();
		new Thread(web, "代理票点3").start();

	}
}

class Ticket12306 implements Runnable {
	
	private int ticketnumber = 100;
	
	@Override
	public void run() {
		while(true) {
			if (ticketnumber < 0) {				
				break;
			}
			try {
				//模拟延时
				Thread.sleep(200);  //线程体的静态方法
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
		}		
	}
}
