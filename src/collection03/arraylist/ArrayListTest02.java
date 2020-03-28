package collection03.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListTest02 {

	public static void main(String[] args) {

		basic();
		System.out.println("-------------");
		collectionTest();
	}

	private static void basic() {

		// ArrayList 实现Collection接口
		Collection<String> c = new ArrayList<String>();
		System.out.println(c.size());
		System.out.println(c.isEmpty());

		// add
		c.add("aaa");
		c.add("bbb");

		// 打印collection
		System.out.println(c);
		System.out.println(c.size());

		// 把ArrayList转换为object数组
		Object[] objs = c.toArray();
		System.out.println(objs[0]);

		// contains
		System.out.println(c.contains("aaa"));

		// remove
		c.remove("aaa");
		System.out.println(c.size());

		// clear
		c.clear();
		System.out.println(c.size());
	}

	private static void collectionTest() {

		List<String> list01 = new ArrayList<String>();
		list01.add("aaa");
		list01.add("bbb");
		list01.add("ccc");

		List<String> list02 = new ArrayList<String>();
		list02.add("aaa");
		list02.add("ddd");
		list02.add("eee");

		// retain all --取交集
		list01.retainAll(list02);
		
		// add all
		list01.addAll(list02);
		
		// remove all
		list01.removeAll(list02);
		
		// contains all
		list01.containsAll(list02);
		
		System.out.println(list01);

	}

}
