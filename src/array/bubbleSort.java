package array;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		int temp;
		boolean flag;
		int[] value = { 3, 2, 5, 1, 7, 4, 9, 8 };
		System.out.println(Arrays.toString(value));
		for (int i = 0; i < value.length - 1; i++) {
			flag = true;
			for (int j = 0; j < value.length - 1 - i; j++) {
				if (value[j] > value[j + 1]) {
					temp = value[j];
					value[j] = value[j + 1];
					value[j + 1] = temp;
					flag = false;
				}
				System.out.println(Arrays.toString(value));
			}
			if (flag) {
				System.out.println("û�з��������������ս�");
				break;
			}
			System.out.println("��" + (i+1) + "�ν����ҳ������ֵ��" + value[value.length - 1 - i] );
			System.out.println("--------------");
		}
	}
}
