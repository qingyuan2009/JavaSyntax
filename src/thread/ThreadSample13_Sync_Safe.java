package thread;

public class ThreadSample13_Sync_Safe {

	public static void main(String[] args) {
		Web12306 web = new Web12306();

		// 三个线程，共享一个资源：ticketnumber
		// 并发： 这里有线程不安全问题：如下，并不是顺序递减的, 有重复数据
		// 代理票点2-->94
		// 代理票点3-->94
		// 代理票点3-->98
		// 代理票点1-->100
		// 代理票点1-->-1
		// 代理票点3-->-2
		new Thread(web, "代理票点1").start();
		new Thread(web, "代理票点2").start();
		new Thread(web, "代理票点3").start();

	}

}

class Web12306 implements Runnable {

	private int ticketnumber = 100;
	private boolean flag = true;

	@Override
	public void run() {
		while(this.flag) {
			test();
		}		
	}
	
	//使用synchronized方法, 锁定的是this对象的资源
	public synchronized void test() {
		if (ticketnumber < 0) {				
			this.flag = false;
			return;
		}
		try {
			//模拟延时
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
		
	}
}
