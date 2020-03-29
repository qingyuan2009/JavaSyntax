package collection05.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("AA");
		set1.add("BB");
		set1.add("AA");  //ÖØ¸´»á±»ºöÂÔ
		System.out.println(set1);
		set1.remove("BB");
		
		Set<String> set2 = new HashSet<>();
		set2.add("CC");
		set2.add("DD");
		
		set1.addAll(set2);
		System.out.println(set1);

	}

}
