package comparable;

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
	 * Comparable �ӿ��ڲ�ֻ��1��Ҫ��д�Ĺؼ��ķ���.����
	 * int compareTo(T o)
	 * �����������1��Int��ֵ,
     * ���� i = x.compareTo(y)
     * ���i=0, Ҳ��������x��y��λ������ȵ�(������ζx.equals(y) = true, ����jdk api��ǿ�ҽ�����������)
     * ���������ֵi>0 ����ζ��, x > y������
     * ��֮��i<0����ζx < y
	 */	
	public int compareTo(Object o){
        Student s = (Student)(o);
        return this.ranking - s.ranking;
    }

}
