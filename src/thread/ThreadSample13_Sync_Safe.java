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
		while (this.flag) {
			//test();    //使用synchronized方法锁
			//test1();   //使用synchronized块锁
			//test2();   //锁定某一变量, 但是没锁对
			test3(); //尽可能锁定合理的范围， 效率最高
		}
	}

	// 使用synchronized方法锁, 锁定的是this对象的资源
	public synchronized void test() {
		if (ticketnumber <= 0) {
			this.flag = false;
			return;
		}
		try {
			// 模拟延时
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
	}

	// 使用synchronized块锁, 锁定的也是this对象的资源
	public void test1() {
		synchronized (this) {
			if (ticketnumber <= 0) {
				this.flag = false;
				return;
			}
			try {
				// 模拟延时
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
		}
	}

	// 使用synchronized块锁, 锁定的某一个属性，线程不安全
	public void test2() {
		synchronized ((Integer) ticketnumber) {
			if (ticketnumber <= 0) {
				this.flag = false;
				return;
			}
			try {
				// 模拟延时
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
		}
	}
	
	//尽可能锁定合理的范围
	//double checking
	public void test3() {
		//考虑没有票的情况， 就不要进入线程体了
		if (ticketnumber <= 0) {
			this.flag = false;
			return;
		}
		synchronized ((Integer) ticketnumber) {
			//考虑最后一张票的情况， 临界值
			if (ticketnumber <= 0) {
				this.flag = false;
				return;
			}
			try {
				// 模拟延时
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketnumber--);
		}
	}
}
