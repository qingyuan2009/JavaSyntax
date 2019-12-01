package thread;

public class ThreadSample06_lambda {
	
	static class Like2 implements ILike {		
		@Override
		public void lambda() {
			System.out.println("I like lambda 2");			
		}
	}

	public static void main(String[] args) {
		
		class Like3 implements ILike {		
			@Override
			public void lambda() {
				System.out.println("I like lambda 3");			
			}
		}
		
		//�ⲿ��
		ILike like = new Like();
		like.lambda();
		
		//��̬�ڲ���
		ILike like2 = new Like2();
		like2.lambda();
		
		//�����ڲ���
		ILike like3 = new Like3();
		like3.lambda();	
		
		//�ڲ�������
		ILike like4 = new ILike() {			
			public void lambda() {
				System.out.println("I like lambda 4");			
			}			
		};
		like4.lambda();
		
		//lambda���ã�ֻ����һ���ӿڣ��ӿ���һ������
		ILike like5 = ()->{
			System.out.println("I like lambda 5");
		};
		like5.lambda();
	}

}

interface ILike{
	void lambda();
}

class Like implements ILike{
	@Override
	public void lambda() {
		System.out.println("I like lambda 1");
		
	}	
}