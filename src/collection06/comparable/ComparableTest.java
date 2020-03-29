package collection06.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
	
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(new Student("Jack", 10));
		arr.add(new Student("Bill", 23));
		arr.add(new Student("Rudy", 7));
		System.out.println(arr);
		Collections.sort(arr);
        System.out.println(arr);
	}
}

class Student implements Comparable {
	private String name;
	private int ranking;

	public Student(String name, int ranking) {
		this.name = name;
		this.ranking = ranking;
	}

	public String toString() {
		return this.name + ":" + this.ranking;
	}
	
	/*
	Comparable 接口内部只有1个要重写的关键的方法.就是
	**int compareTo(T o)**
	这个方法返回1个Int数�??,  
	例如 i = x.compareTo(y)
	如果i=0, 也表明对象x与y排位上是相等�?(并非意味x.equals(y) = true, 但是jdk api上强烈建议这样处�?)
	如果返回数�?�i>0 则意味�??, x > y啦，
	反之若i<0则�??意味x < y
	*/
	public int compareTo(Object o){
        Student s = (Student)(o);
        return this.ranking - s.ranking;
    }

}
