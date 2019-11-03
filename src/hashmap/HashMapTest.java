package hashmap;

import java.util.Map;
import java.util.Random;
import java.util.Iterator;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		testHashMapAPIs();
	}

	private static void testHashMapAPIs() {
		// ��ʼ���������
		Random r = new Random();
		// �½�HashMap
		HashMap map = new HashMap();
		// ��Ӳ���
		map.put("one", r.nextInt(10));
		map.put("two", r.nextInt(10));
		map.put("three", r.nextInt(10));

		// ��ӡ��map
		System.out.println("map:" + map);

		// ͨ��Iterator����key-value
		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println("next : " + entry.getKey() + " - " + entry.getValue());
		}

		// HashMap�ļ�ֵ�Ը���
		System.out.println("size:" + map.size());

		// containsKey(Object key) :�Ƿ������key
		System.out.println("contains key two : " + map.containsKey("two"));
		System.out.println("contains key five : " + map.containsKey("five"));

		// containsValue(Object value) :�Ƿ����ֵvalue
		System.out.println("contains value 0 : " + map.containsValue(new Integer(0)));

		// remove(Object key) �� ɾ����key��Ӧ�ļ�ֵ��
		map.remove("three");

		System.out.println("map:" + map);

		// clear() �� ���HashMap
		map.clear();

		// isEmpty() : HashMap�Ƿ�Ϊ��
		System.out.println((map.isEmpty() ? "map is empty" : "map is not empty"));
	}
}