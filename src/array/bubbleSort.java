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
				System.out.println("没有发生交换，可以终结");
				break;
			}
			System.out.println("第" + (i+1) + "次交换找出了最大值：" + value[value.length - 1 - i] );
			System.out.println("--------------");
		}
	}
}
