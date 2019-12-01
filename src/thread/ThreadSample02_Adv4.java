package thread;

//实现Runnable接口 -- 推荐使用
public class ThreadSample02_Adv4 {

	public static void main(String[] args) {

		// jdk8 简化 lambda表达式
		// 取消接口和函数，只关注入参和线程体
		new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				System.out.println("一边听歌");
			}
		}).start();

		for (int i = 0; i < 500; i++) {
			System.out.println("一边写代码");
		}
	}

}
