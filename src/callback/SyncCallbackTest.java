package callback;

public class SyncCallbackTest {

	public static void main(String[] args) {
		int a = 56;
		int b = 31;
		int c = 26497;
		int d = 11256;
		Student s1 = new Student("С��");
		Seller s2 = new Seller("������");
		s1.callHelp(a, b);
		s2.callHelp(c, d);
	}

}

interface doJob {
	public void fillBlank(int a, int b, int result);
}

class SuperCalculator {
	public void add(int a, int b, doJob customer) {
		int result = a + b;
		customer.fillBlank(a, b, result);
	}
}

class Student {
	private String name = null;

	public Student(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class doHomeWork implements doJob {
		@Override
		public void fillBlank(int a, int b, int result) {
			// TODO Auto-generated method stub
			System.out.println(name + "����С�����:" + a + " + " + b + " = " + result);
		}
	}

	public void callHelp(int a, int b) {
		new SuperCalculator().add(a, b, new doHomeWork());
	}
}

class Seller {
	private String name = null;

	public Seller(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class doHomeWork implements doJob {
		@Override
		public void fillBlank(int a, int b, int result) {
			// TODO Auto-generated method stub
			System.out.println(name + "����С������:" + a + " + " + b + " = " + result + "Ԫ");
		}
	}

	public void callHelp(int a, int b) {
		new SuperCalculator().add(a, b, new doHomeWork());
	}
}
