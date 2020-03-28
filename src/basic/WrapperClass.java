package basic;

public class WrapperClass {

	public static void main(String[] args) {
		//包装类
		Integer a = new Integer(3);
		Integer b = Integer.valueOf(30);
		
		int c = b.intValue();
		double d = b.doubleValue();
		
		
		Integer f = new Integer("999");
		Integer g = Integer.parseInt("888");
		
		String h = b.toString();
		
		//包装类的常量
		System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
		
		Integer i = 123;  // = Integer.valueOf(123) 自动装箱
		int j = i;        // = i.intValue()  自动拆箱
		
		
		Integer int1 = 127;
		Integer int2 = 127;
		//理论上应该是不同的object， 但JAVA对-128 到127做了cache 
		System.out.println("对象 int 1 和 int2 是否相等： " + (int1 == int2) ); //相等
		System.out.println("int 1 和 int2 值是否相等： " + (int1.equals(int2)) );		
		
		Integer int3 = 128;
		Integer int4 = 128;
		//超过 -128 ... 127 则不会cache
		System.out.println("对象 int 3 和 int4 是否相等： " + (int3 == int4) ); // 不等
		System.out.println("int 3 和 int4 值是否相等： " + (int1.equals(int2)) );
		
	}

}
