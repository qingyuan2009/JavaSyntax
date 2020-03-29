package collection04.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new TreeMap<>();
		map1.put(10, "ABC");
		map1.put(3, "BBC");
		map1.put(16, "KBC");

		System.out.println(map1); // 自动排序
		for (Integer key : map1.keySet()) {
			System.out.println(key + " " + map1.get(key)); // 自动排序
		}
		
		
		// 用Obejct作为Key，先比较salary, 再比较id
		MyEmployee e1 = new MyEmployee(1001, "AA", 5000);
		MyEmployee e2 = new MyEmployee(1002, "BB", 2000);
		MyEmployee e3 = new MyEmployee(1003, "CC", 2000);
		MyEmployee e4 = new MyEmployee(1004, "DD", 8000);
		
		Map<MyEmployee, String> mapEmp = new TreeMap<>();
		mapEmp.put(e1, "This is AA");
		mapEmp.put(e2, "This is BB");
		mapEmp.put(e3, "This is CC");
		mapEmp.put(e4, "This is DD");
		for( MyEmployee emp:mapEmp.keySet() ) {
			System.out.println(emp + " " + mapEmp.get(emp)); // 自动排序
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
