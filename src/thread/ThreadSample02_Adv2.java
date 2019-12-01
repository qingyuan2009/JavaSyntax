package thread;

//实现Runnable接口 -- 推荐使用
public class ThreadSample02_Adv2 {	

	public static void main(String[] args) {
		
		//局部内部類
		class Test implements Runnable {
			@Override
			public void run() {
				for (int i = 0; i < 500; i++) {
					System.out.println("一边听歌");
				}
			}
		}		
		
		new Thread(new Test()).start();
		for (int i = 0; i < 500; i++) {
			System.out.println("一边写代码");
		}
	}

}
