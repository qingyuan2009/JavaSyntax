package thread;

public class ThreadSample06_lambda2 {	
	
	public static void main(String[] args) {		
		
		//lambda调用，带参数
		ILove love = (int a)->{
			System.out.println("I like lambda -->" + a);
		};
		love.lambda(5);
		
		//lambda调用，可省略参数类型
		ILove love2 = (a)->{
			System.out.println("I like lambda -->" + a);
		};
		love2.lambda(10);
		
		//lambda调用，只有一个参数，可省略()
		ILove love3 = a->{
			System.out.println("I like lambda -->" + a);
		};
		love3.lambda(15);
		
		//lambda调用，如果只有一行代码，可省略{}
		ILove love4 = a->System.out.println("I like lambda -->" + a);
		love4.lambda(20);
		
	}

}

interface ILove{
	void lambda(int a);
}

