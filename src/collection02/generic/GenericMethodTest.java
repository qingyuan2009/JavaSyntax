package collection02.generic;

public class GenericMethodTest {

	// 泛型方法 printArray
	// <T> 放在返回参数之前，说明此方法是泛型方法
	public static <E1, E2> void printArray(E1[] inputArray1, E2[] inputArray2) {
		// 输出数组元素
		for (E1 element : inputArray1) {
			System.out.printf("%s ", element);
		}
		System.out.println();
		for (E2 element : inputArray2) {
			System.out.printf("%s ", element);
		}
	}

	public static void main(String[] args) {
		// 创建不同类型数组： Integer, Double 和 Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("整型+双精度型数组元素为:");
		printArray(intArray, doubleArray); // 传递一个整型数组 + 一个双精度型数组

		System.out.println("\n双精度型_字符型数组元素为:");
		printArray(doubleArray, charArray); // 传递一个双精度型数组 + 一个字符型数组

	}
}
