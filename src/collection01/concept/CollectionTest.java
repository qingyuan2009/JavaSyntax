package collection01.concept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest {

	public static void main(String[] args) {		
		
		//������÷��ͣ������������ת��
		MyCollection myCollection = new MyCollection();
		myCollection.set("ABC", 0);
		myCollection.set(888, 1);
		String a = (String)myCollection.get(0);  
		int b = (Integer)myCollection.get(1);
		System.out.println(a + " " + b);
		
		//ʹ�÷���
		MyCollectionGeneric<String> myCollection2 = new MyCollectionGeneric<String>();
		myCollection2.set("ccc", 0);
		//myCollection2.set(123, 1);  //error
		myCollection2.set("rrr", 1);  //error
		String c  = myCollection2.get(0);  
		String d = myCollection2.get(1);
		System.out.println(c + " " + d);
		
		//List ���� -- �Ƿ��͵�����
		// List�ǽӿ�, ArrayList��ʵ��
		List<String> list = new ArrayList<String>(); //������
		List list2 = new ArrayList();  //��������
		
		//Map ���� -- �Ƿ��͵�����
		// Map�ǽӿڣ�HashMap��ʵ��
		Map<Integer, String> map = new HashMap<Integer, String>();   //������
		Map map2 = new HashMap(); //��������

	}
}

//����
class MyCollection {	
	Object[] objs = new Object[5];	
	public void set(Object obj, int index) {
		objs[index] = obj;		
	}	
	public Object get(int index) {
		return objs[index];
	}
}

//����������
class MyCollectionGeneric<T> {	
	Object[] objs = new Object[5];	
	public void set(T obj, int index) {
		objs[index] = obj;		
	}	
	public T get(int index) {
		return (T)objs[index];
	}
}
