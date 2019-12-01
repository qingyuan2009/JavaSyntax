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
		
		//外部类
		ILike like = new Like();
		like.lambda();
		
		//静态内部类
		ILike like2 = new Like2();
		like2.lambda();
		
		//方法内部类
		ILike like3 = new Like3();
		like3.lambda();	
		
		//内部匿名类
		ILike like4 = new ILike() {			
			public void lambda() {
				System.out.println("I like lambda 4");			
			}			
		};
		like4.lambda();
		
		//lambda调用，只能是一个接口，接口里一个方法
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