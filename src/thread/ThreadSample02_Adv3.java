package thread;

//实现Runnable接口 -- 推荐使用
public class ThreadSample02_Adv3 {	

	public static void main(String[] args) {		
		
		//匿名内部类， 必须借助接口 + 实现体
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 500; i++) {
					System.out.println("一边听歌");
				}
			}			
		}).start();		
	
		for (int i = 0; i < 500; i++) {
			System.out.println("一边写代码");
		}
	}

}
