package collection05.set;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<>();
		set1.add(10);
		set1.add(3);
		set1.add(16);

		System.out.println(set1); // 自动排序

		MyEmployee e1 = new MyEmployee(1001, "AA", 5000);
		MyEmployee e2 = new MyEmployee(1002, "BB", 2000);
		MyEmployee e3 = new MyEmployee(1003, "CC", 2000);
		MyEmployee e4 = new MyEmployee(1004, "DD", 8000);

		Set<MyEmployee> setEmp = new TreeSet<>();
		setEmp.add(e1);
		setEmp.add(e2);
		setEmp.add(e3);
		setEmp.add(e4);
		for (MyEmployee emp : setEmp) {
			System.out.println(emp); // 自动排序
		}

	}

}

class MyEmployee implements Comparable<MyEmployee> {
	private int id;
	private String ename;
	private double salary;

	public MyEmployee(int id, String ename, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + " " + ename + " " + salary;
	}

	@Override
	public int compareTo(MyEmployee o) {
		// 0: 等于
		// 负数：小于
		// 正数： 大于
		if (this.salary > o.salary) {
			return 1;
		} else if (this.salary < o.salary) {
			return -1;
		} else {
			if (this.id > o.id) {
				return 1;
			} else if (this.id < o.id) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
