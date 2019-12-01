package thread;

public class ThreadSample06_lambda2 {	
	
	public static void main(String[] args) {		
		
		//lambda���ã�������
		ILove love = (int a)->{
			System.out.println("I like lambda -->" + a);
		};
		love.lambda(5);
		
		//lambda���ã���ʡ�Բ�������
		ILove love2 = (a)->{
			System.out.println("I like lambda -->" + a);
		};
		love2.lambda(10);
		
		//lambda���ã�ֻ��һ����������ʡ��()
		ILove love3 = a->{
			System.out.println("I like lambda -->" + a);
		};
		love3.lambda(15);
		
		//lambda���ã����ֻ��һ�д��룬��ʡ��{}
		ILove love4 = a->System.out.println("I like lambda -->" + a);
		love4.lambda(20);
		
	}

}

interface ILove{
	void lambda(int a);
}

