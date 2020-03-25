package array;

import java.util.Arrays;

public class objectArray {

	public static void main(String[] args) {
		//Object array
		Object[] a1 = {1001, "AA", 18, "teacher", "2010-01-01"};
		Object[] a2 = {1002, "BB", 28, "worker", "2003-11-21"};
		Object[] a3 = {1003, "CC", 88, "student", "1977-03-01"};
		
		//用来表示一张表
		Object[][] employee = new Object[3][];
		employee[0] = a1;
		employee[1] = a2;
		employee[2] = a3;
		
		System.out.println("第二个员工的职业：" + employee[1][3]);
		
		for (Object[] element:employee) {
			System.out.println(Arrays.toString(element));
		}

	}

}
