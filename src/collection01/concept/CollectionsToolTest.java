package collection01.concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsToolTest {

	public static void main(String[] args) {
		// Collections ������
		
		List<String> arrayList = new ArrayList<String>();	
		for(int i=0; i<10; i++) {
			arrayList.add("zhou" + i);			
		}	
		System.out.println(arrayList);
		
		//�������
		Collections.shuffle(arrayList);
		System.out.println(arrayList);
		
		//����
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		
		//sort
		Collections.sort(arrayList); //�Զ���Ļ���ʹ��Comparable�ӿ�
		System.out.println(arrayList);
		
		//Binary search
		System.out.println(Collections.binarySearch(arrayList, "zhou8"));
		

	}

}
