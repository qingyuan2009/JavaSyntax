package thread;

public class ThreadSample06_lambda3 {	
	
	public static void main(String[] args) {		
		
		//lambda���ã����ز�
		IInterest interest = (int a, int b)->{
			return a + b;			
		};
		
		System.out.println( interest.lambda(10, 13));
		
		//lambda���ã�ֻ��һ�д���
		IInterest interest2 = (a, b)-> a + b;
		System.out.println( interest2.lambda(15, 13));	
		
	}

}

interface IInterest{
	int lambda(int a, int b);
}

