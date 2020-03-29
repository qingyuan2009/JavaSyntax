package basic;

import java.util.Map;
import java.util.TreeMap;

public class LoopTest {

	public static void main(String[] args) {

		forTest();
		System.out.println("************");		
		AdvancedForTest();
		System.out.println("************");
		whileTest();
		System.out.println("************");
		doWhileTest();

	}

	public static void forTest() {
		/**********************************
		 * for(初始化; 布尔表达式; 更新) { //代码语句 }
		 ***********************************/
		for (int x = 16; x < 20; x = x + 1) {
			System.out.print("value of x : " + x);
			System.out.print("\n");
		}
	}

	public static void AdvancedForTest() {
		/**********************************
		 * for(声明语句 : 表达式) { //代码句子 }
		 ***********************************/
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int x : numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.print("\n");		
		
		Map<Integer, String> map1 = new TreeMap<>();
		map1.put(10, "ABC");
		map1.put(3, "BBC");
		map1.put(16, "KBC");
		
		System.out.println(map1);  //自动排序
		for(Integer key : map1.keySet()) {
			System.out.println(key + " "  + map1.get(key));  //自动排序
		}
	}

	public static void whileTest() {
		/**********************************
		 * while( 布尔表达式 ) { //循环内容 }
		 ***********************************/
		int x = 17;
		while (x < 20) {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		}
	}

	public static void doWhileTest() {
		/**********************************
		 * do { //代码语句 }while(布尔表达式);
		 ***********************************/
		int x = 16;
		do {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		} while (x < 20);
	}

}
