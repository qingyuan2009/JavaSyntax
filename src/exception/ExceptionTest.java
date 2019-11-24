package exception;

public class ExceptionTest {	
	public static void main(String[] args) {		
		Person person = new Person();
		//Runtime 异常
		//person.setAge(-1);
		person.setAge(1);
		
		//编译器异常
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

	//Runtime 异常
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalAgeException("年龄不能小于零");			
		}
		this.age = age;
	}	
	
	//编译器异常，需要写代码时处理异常
	public void setAge2(int age) throws IllegalAgeException2 {
		if (age < 0) {
			throw new IllegalAgeException2();			
		}
		this.age = age;
	}	
}

//Runtime 异常
class IllegalAgeException extends RuntimeException{
	
	public IllegalAgeException() {
				
	}
	
	public IllegalAgeException(String msg) {
		super(msg);		
	}
}

//编译器异常
class IllegalAgeException2 extends Exception{
	
	public IllegalAgeException2() {
				
	}
	
	public IllegalAgeException2(String msg) {
		super(msg);		
	}
}
