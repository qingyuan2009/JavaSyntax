package collection04.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListMapTest {

	public static void main(String[] args) {

		// 用MAP表示行， List表示表

		List<Map<String, Object>> table = new ArrayList<>(); // 带泛型
		Map<String, Object> row1 = new HashMap<>();
		Map<String, Object> row2 = new HashMap<>();
		Map<String, Object> row3 = new HashMap<>();

		row1.put("id", 1001);
		row1.put("name", "zhou");
		row1.put("salary", 2000);

		row2.put("id", 1002);
		row2.put("name", "zhang");
		row2.put("salary", 3000);

		row3.put("id", 1003);
		row3.put("name", "liu");
		row3.put("salary", 1000);

		table.add(row1);
		table.add(row2);
		table.add(row3);

		for (Map<String, Object> map : table) {
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				System.out.print(key + " " + map.get(key) + '\t');
			}
			System.out.println();
		}

	}

}
