package array;

import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		int[] value = { 3, 2, 5, 1, 7, 23, 4, 9, 8, 12,88 };		
		//search(value, 122);		
		search(value,12);
	}
	
	private static int search(int[] value, int num) {
		
		Arrays.sort(value);
		// 1,2,3,4,5,7,8,9,12,23,88
		int low = 0;
		int high = value.length-1;
		int result = 0;
		int count = 0;				
		
		while(low<=high) {
			int mid = (high + low)/2;
			count++;
			if (num == value[mid]) {
				System.out.println("在第"+ count +"次找到了");
				System.out.println("index is " + mid);
				result = mid;
				break;				
			}
			else if (low == high) {
				System.out.println("靠， 没找到");
				result = -1;
				break;
			}else if (num > value[mid]) {
				low = mid + 1;
				System.out.println("第"+ count +"次半分寻找");
				System.out.println("low number is " + value[low] );
				System.out.println("high number is " + value[high] );
				System.out.println("--------------");
			}else if (num < value[mid]) {
				high = mid - 1;
				System.out.println("第"+ count +"次半分寻找");
				System.out.println("low number is " + value[low] );
				System.out.println("high number is " + value[high] );
				System.out.println("--------------");
			}			
		}
		
		return result;
	}
}
