package thread;

//裝飾著模式
public class ThreadSample05_StaticProxy {

	public static void main(String[] args) {
		
		new WeddingCompnay(new You()).happyMarry();
		//new Thread(new Racer(), "兔子").start();
		
		//可見Thread 是采用裝飾著模式
	}
}

//接口
interface Marry{
	void happyMarry();	
}

//真實角色
class You implements Marry {
	
	@Override
	public void happyMarry() {
		System.out.println("周睿結婚了");		
	}	
}

//代理角色
class WeddingCompnay implements Marry{
	
	private Marry target;
	
	public WeddingCompnay(Marry target) {
		this.target = target;
	}

	@Override
	public void happyMarry() {
		// TODO Auto-generated method stub
		ready();
		this.target.happyMarry();
		after();
	}

	private void after() {
		System.out.println("婚慶公司準備");
		
	}

	private void ready() {		
		System.out.println("婚慶公司結束");
	}
	
}






