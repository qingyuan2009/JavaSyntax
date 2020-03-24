package basic;

public class PrimitiveTypeTest {

	public static void main(String[] args) {
		// byte
		System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
		System.out.println("包装类：java.lang.Byte");
		System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
		System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
		System.out.println();
		
		// short
		System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
		System.out.println("包装类：java.lang.Short");
		System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
		System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
		System.out.println();

		// int
		System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
		System.out.println("包装类：java.lang.Integer");
		System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println();

		// long
		System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
		System.out.println("包装类：java.lang.Long");
		System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
		System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
		System.out.println();

		// float
		System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
		System.out.println("包装类：java.lang.Float");
		System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
		System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
		System.out.println();

		// double
		System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
		System.out.println("包装类：java.lang.Double");
		System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
		System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
		System.out.println();

		// char
		System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
		System.out.println("包装类：java.lang.Character");
		// 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
		System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
		// 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
		System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE);
		System.out.println();
		
		//Java常量
		final double PI = 3.1415927;
		System.out.println("常量：" + PI);
		System.out.println();
		
		// byte and char
		byte a = 65;
		char b = 'B';
		System.out.println("byte to char: " + (char)a);
		System.out.println("char to byte: " + (byte)b);
		System.out.println();
		
		// decimal, octal and hexa
		int decimal = 100;
		int octal = 0144;
		int hexa =  0x64;
		System.out.println("decimal: " + decimal);
		System.out.println("otcal: " + octal);
		System.out.println("hexa: " + hexa);
		System.out.println();
		
		//String
		String str1 = "Hello World";
		String str2 = "two\nlines";
		String str3 ="\"This is in quotes\"";
		System.out.println("normal string: " + str1);
		System.out.println("string with new line: " + str2);
		System.out.println("string with \": " + str3);
		System.out.println();
		
		//Unicode
		char unicode1 = '\u0001';
		String unicode2 = "\u0001\u0002";
		System.out.println("unicode char: " + unicode1);
		System.out.println("unicode string: " + unicode2);
		System.out.println();
		
		
	}

}
