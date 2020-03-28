package collection02.generic;

public class GenericMethodTest {

	// ���ͷ��� printArray
	// <T> ���ڷ��ز���֮ǰ��˵���˷����Ƿ��ͷ���
	public static <E1, E2> void printArray(E1[] inputArray1, E2[] inputArray2) {
		// �������Ԫ��
		for (E1 element : inputArray1) {
			System.out.printf("%s ", element);
		}
		System.out.println();
		for (E2 element : inputArray2) {
			System.out.printf("%s ", element);
		}
	}

	public static void main(String[] args) {
		// ������ͬ�������飺 Integer, Double �� Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("����+˫����������Ԫ��Ϊ:");
		printArray(intArray, doubleArray); // ����һ���������� + һ��˫����������

		System.out.println("\n˫������_�ַ�������Ԫ��Ϊ:");
		printArray(doubleArray, charArray); // ����һ��˫���������� + һ���ַ�������

	}
}
