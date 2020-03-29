package collection03.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest03 {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();

		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		
		// List重载Collection的add方法，允许使用index
		// 有顺序，可重复
		arrayList.add(1, "D");
		arrayList.add(1, "D");		
		
		System.out.println(arrayList);
		
		arrayList.remove(1);
		arrayList.set(1, "E");
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(1));
		
		System.out.println(arrayList.indexOf("E"));
		
		System.out.println(arrayList.lastIndexOf("E"));
	}

}
