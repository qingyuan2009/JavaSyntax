package collection07.Iterator;

import java.util.Map;
import java.util.Random;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Collection;

/*
* ����HashMap�Ĳ��Գ���
*   (01) ͨ��entrySet()ȥ����key��value���ο�ʵ�ֺ�����
*        iteratorHashMapByEntryset()
*   (02) ͨ��keySet()ȥ����key��value���ο�ʵ�ֺ�����
*        iteratorHashMapByKeyset()
*   (03) ͨ��values()ȥ����value���ο�ʵ�ֺ�����
*        iteratorHashMapJustValues()
*/
public class HashMapIteratorTest {

	public static void main(String[] args) {
		int val = 0;
		String key = null;
		Integer value = null;
		Random r = new Random();
		HashMap map = new HashMap();

		for (int i = 0; i < 12; i++) {
			// �����ȡһ��[0,100)֮�������
			val = r.nextInt(100);
			key = String.valueOf(val);
			value = r.nextInt(5);
			// ��ӵ�HashMap��
			map.put(key, value);
			System.out.println(" key:" + key + " value:" + value);
		}
		// ͨ��entrySet()����HashMap��key-value
		iteratorHashMapByEntryset(map);

		// ͨ��keySet()����HashMap��key-value
		iteratorHashMapByKeyset(map);

		// ��������HashMap��value
		iteratorHashMapJustValues(map);
	}

	/*
	 * ͨ��entry set����HashMap Ч�ʸ�!
	 */
	private static void iteratorHashMapByEntryset(HashMap map) {
		if (map == null)
			return;

		System.out.println("\niterator HashMap By entryset");
		String key = null;
		Integer integ = null;
		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			key = (String) entry.getKey();
			integ = (Integer) entry.getValue();
			System.out.println(key + " -- " + integ.intValue());
		}
	}

	/*
	 * ͨ��keyset������HashMap Ч�ʵ�!
	 */
	private static void iteratorHashMapByKeyset(HashMap map) {
		if (map == null)
			return;

		System.out.println("\niterator HashMap By keyset");
		String key = null;
		Integer integ = null;
		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			key = (String) iter.next();
			integ = (Integer) map.get(key);
			System.out.println(key + " -- " + integ.intValue());
		}
	}

	/*
	 * ����HashMap��values
	 */
	private static void iteratorHashMapJustValues(HashMap map) {
		if (map == null)
			return;

		Collection c = map.values();
		Iterator iter = c.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}