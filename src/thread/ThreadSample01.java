package thread;

//继承Tread
public class ThreadSample01 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 80; i++) {			
			System.out.println("一边听歌");			
		}
	}	

	public static void main(String[] args) {
		ThreadSample01 thread = new ThreadSample01();
		//必须要用start 触发多线程
		thread.start();
		for (int i = 0; i < 80; i++) {			
			System.out.println("一边写代码");			
		}
	}

}
