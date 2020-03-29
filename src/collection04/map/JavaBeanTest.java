package collection04.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaBeanTest {

	public static void main(String[] args) {
		User user1 = new User(1001, "zhou", 2000);
		User user2 = new User(1002, "zhu", 4000);
		User user3 = new User(1003, "liu", 1000);
		List<User> table = new ArrayList<>();
		table.add(user1);
		table.add(user2);
		table.add(user3);

		for (User u : table) {
			System.out.println(u);
		}

		Map<Integer, User> map = new HashMap<>();
		map.put(1001, user1);
		map.put(1002, user2);
		map.put(1003, user3);

		Set<Integer> set = map.keySet();
		for (Integer i : set) {
			System.out.println(i + " " + map.get(i));
		}

	}

}

class User {

	private int id;
	private String ename;
	private double salary;

	public User() {
	}

	public User(int id, String ename, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return id + " " + ename + " " + salary;
	}

}