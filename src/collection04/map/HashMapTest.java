package collection04.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		// key + value 键值对， 可以是任意类型
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "one");
		m1.put(2, "two");
		m1.put(3, "three");
		
		System.out.println(m1.get(1));
		System.out.println(m1.size());
		System.out.println(m1.isEmpty());
		System.out.println(m1.containsKey(2));
		System.out.println(m1.containsValue("three"));
		
		Map<Integer, String> m2 = new HashMap<>();
		m2.put(4, "四");
		m2.put(5, "五");
		
		m1.putAll(m2);
		System.out.println(m1); //{1=one, 2=two, 3=three, 4=四, 5=五}
		
		m1.put(3, "三");
		System.out.println(m1); //键值重复则覆盖

	}

}
