package thread;

//实现Runnable接口 -- 推荐使用
public class ThreadSample02 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {			
			System.out.println("一边听歌");			
		}
	}	

	public static void main(String[] args) {
		new Thread(new ThreadSample02()).start();		
		for (int i = 0; i < 500; i++) {			
			System.out.println("一边写代码");			
		}
	}

}
