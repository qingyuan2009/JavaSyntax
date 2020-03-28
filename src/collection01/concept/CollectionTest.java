package collection01.concept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest {

	public static void main(String[] args) {		
		
		//如果不用泛型，则必须做类型转换
		MyCollection myCollection = new MyCollection();
		myCollection.set("ABC", 0);
		myCollection.set(888, 1);
		String a = (String)myCollection.get(0);  
		int b = (Integer)myCollection.get(1);
		System.out.println(a + " " + b);
		
		//使用泛型
		MyCollectionGeneric<String> myCollection2 = new MyCollectionGeneric<String>();
		myCollection2.set("ccc", 0);
		//myCollection2.set(123, 1);  //error
		myCollection2.set("rrr", 1);  //error
		String c  = myCollection2.get(0);  
		String d = myCollection2.get(1);
		System.out.println(c + " " + d);
		
		//List 容器 -- 是泛型的容器
		// List是接口, ArrayList是实现
		List<String> list = new ArrayList<String>(); //带泛型
		List list2 = new ArrayList();  //不带泛型
		
		//Map 容器 -- 是泛型的容器
		// Map是接口，HashMap是实现
		Map<Integer, String> map = new HashMap<Integer, String>();   //带泛型
		Map map2 = new HashMap(); //不带泛型

	}
}

//容器
class MyCollection {	
	Object[] objs = new Object[5];	
	public void set(Object obj, int index) {
		objs[index] = obj;		
	}	
	public Object get(int index) {
		return objs[index];
	}
}

//带泛型容器
class MyCollectionGeneric<T> {	
	Object[] objs = new Object[5];	
	public void set(T obj, int index) {
		objs[index] = obj;		
	}	
	public T get(int index) {
		return (T)objs[index];
	}
}
