package thread;

//�b���ģʽ
public class ThreadSample05_StaticProxy {

	public static void main(String[] args) {
		
		new WeddingCompnay(new You()).happyMarry();
		//new Thread(new Racer(), "����").start();
		
		//��ҊThread �ǲ����b���ģʽ
	}
}

//�ӿ�
interface Marry{
	void happyMarry();	
}

//�挍��ɫ
class You implements Marry {
	
	@Override
	public void happyMarry() {
		System.out.println("��Y����");		
	}	
}

//�����ɫ
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
		System.out.println("��c��˾�ʂ�");
		
	}

	private void ready() {		
		System.out.println("��c��˾�Y��");
	}
	
}






