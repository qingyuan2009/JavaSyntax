package exception;

public class ExceptionTest {	
	public static void main(String[] args) {		
		Person person = new Person();
		//Runtime �쳣
		//person.setAge(-1);
		person.setAge(1);
		
		//�������쳣
		try {
			person.setAge2(-1);
		} catch (IllegalAgeException2 e) {			
			e.printStackTrace();
		}
	}	
}

class Person {
	
	private int age;

	public int getAge() {
		return age;
	}

	//Runtime �쳣
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalAgeException("���䲻��С����");			
		}
		this.age = age;
	}	
	
	//�������쳣����Ҫд����ʱ�����쳣
	public void setAge2(int age) throws IllegalAgeException2 {
		if (age < 0) {
			throw new IllegalAgeException2();			
		}
		this.age = age;
	}	
}

//Runtime �쳣
class IllegalAgeException extends RuntimeException{
	
	public IllegalAgeException() {
				
	}
	
	public IllegalAgeException(String msg) {
		super(msg);		
	}
}

//�������쳣
class IllegalAgeException2 extends Exception{
	
	public IllegalAgeException2() {
				
	}
	
	public IllegalAgeException2(String msg) {
		super(msg);		
	}
}
