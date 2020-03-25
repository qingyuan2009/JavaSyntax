package array;

import java.util.Arrays;

public class ArrayLib {

	public static void main(String[] args) {
		int[] a = {1,2,4,3,5,6};
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Binary search index: " + Arrays.binarySearch(a, 3));
	}

}
