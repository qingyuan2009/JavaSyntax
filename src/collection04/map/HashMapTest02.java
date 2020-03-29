package collection04.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest02 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "zhou", 60000);
		Employee e2 = new Employee(2, "wang", 30000);
		Employee e3 = new Employee(3, "zhu", 10000);
		Employee e4 = new Employee(3, "liu", 20000);
		
		//所有的object都有hashcode
		System.out.println(e3.hashCode());
		
		Map<Integer, Employee> map = new HashMap<>();
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		map.put(3, e4);  //键重复则覆盖
		
		System.out.println(map.get(2).getEname());
		System.out.println(map.get(3).toString());		

	}

}

class Employee{
	private int id;
	private String ename;
	private double salary;
	
	public Employee(int id, String ename, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "id:" + id + " name:" + ename + " salary:" + salary;
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
	
	
}