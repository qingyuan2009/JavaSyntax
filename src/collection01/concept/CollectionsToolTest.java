package collection01.concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsToolTest {

	public static void main(String[] args) {
		// Collections 工具类
		
		List<String> arrayList = new ArrayList<String>();	
		for(int i=0; i<10; i++) {
			arrayList.add("zhou" + i);			
		}	
		System.out.println(arrayList);
		
		//随机排列
		Collections.shuffle(arrayList);
		System.out.println(arrayList);
		
		//倒序
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		
		//sort
		Collections.sort(arrayList); //自定义的话则使用Comparable接口
		System.out.println(arrayList);
		
		//Binary search
		System.out.println(Collections.binarySearch(arrayList, "zhou8"));
		

	}

}
