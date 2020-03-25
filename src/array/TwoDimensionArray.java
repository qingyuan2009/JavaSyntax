package array;

import java.util.Arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		String s[][] = new String[2][];
		s[0] = new String[2];
		s[1] = new String[3];
		s[0][0] = new String("Good");
		s[0][1] = new String("Luck");
		s[1][0] = new String("to");
		s[1][1] = new String("you");
		s[1][2] = new String("!");
		
		System.out.println("获取2D Array： " + s[0][1]);
		
		//静态初始化
		int[][] b = {
				{10,20,30},
				{30,40,50}			
		};
		System.out.println("获取2D Array： " + Arrays.toString(b[0]));
		
	}

}
