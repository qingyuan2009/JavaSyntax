package collection07.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InteratorTest {

	public static void main(String[] args) {
		listIterator();
		setIterator();
		mapIterator();
		mapIterator2();
	}

	// 典型迭代器遍历list
	public static void listIterator() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		for (Iterator<String> iter = arrayList.iterator(); iter.hasNext();) {
			System.out.println(iter.next());
		}
	}

	//遍历Set
	public static void setIterator() {
		Set<String> set1 = new HashSet<>();
		set1.add("AA");
		set1.add("BB");
		set1.add("AA"); // 重复会被忽略
		for (Iterator<String> iter = set1.iterator(); iter.hasNext();) {
			System.out.println(iter.next());
		}
	}

	
	public static void mapIterator() {
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "one");
		m1.put(2, "two");
		m1.put(3, "three");
		Set<Entry<Integer, String>> set2 = m1.entrySet();
		for (Iterator<Entry<Integer, String>> iter = set2.iterator(); iter.hasNext();) {
			Entry<Integer, String> entry = iter.next();
			System.out.println(entry.getKey() + entry.getValue());
		}
	}

	public static void mapIterator2() {
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "one");
		m1.put(2, "two");
		m1.put(3, "three");
		Set<Integer> set2 = m1.keySet();
		for (Iterator<Integer> iter = set2.iterator(); iter.hasNext();) {
			Integer key = iter.next();
			System.out.println(key + m1.get(key));
		}
	}

}
