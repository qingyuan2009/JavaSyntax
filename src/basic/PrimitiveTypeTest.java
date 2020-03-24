package basic;

public class PrimitiveTypeTest {

	public static void main(String[] args) {
		// byte
		System.out.println("�������ͣ�byte ������λ����" + Byte.SIZE);
		System.out.println("��װ�ࣺjava.lang.Byte");
		System.out.println("��Сֵ��Byte.MIN_VALUE=" + Byte.MIN_VALUE);
		System.out.println("���ֵ��Byte.MAX_VALUE=" + Byte.MAX_VALUE);
		System.out.println();
		
		// short
		System.out.println("�������ͣ�short ������λ����" + Short.SIZE);
		System.out.println("��װ�ࣺjava.lang.Short");
		System.out.println("��Сֵ��Short.MIN_VALUE=" + Short.MIN_VALUE);
		System.out.println("���ֵ��Short.MAX_VALUE=" + Short.MAX_VALUE);
		System.out.println();

		// int
		System.out.println("�������ͣ�int ������λ����" + Integer.SIZE);
		System.out.println("��װ�ࣺjava.lang.Integer");
		System.out.println("��Сֵ��Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("���ֵ��Integer.MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println();

		// long
		System.out.println("�������ͣ�long ������λ����" + Long.SIZE);
		System.out.println("��װ�ࣺjava.lang.Long");
		System.out.println("��Сֵ��Long.MIN_VALUE=" + Long.MIN_VALUE);
		System.out.println("���ֵ��Long.MAX_VALUE=" + Long.MAX_VALUE);
		System.out.println();

		// float
		System.out.println("�������ͣ�float ������λ����" + Float.SIZE);
		System.out.println("��װ�ࣺjava.lang.Float");
		System.out.println("��Сֵ��Float.MIN_VALUE=" + Float.MIN_VALUE);
		System.out.println("���ֵ��Float.MAX_VALUE=" + Float.MAX_VALUE);
		System.out.println();

		// double
		System.out.println("�������ͣ�double ������λ����" + Double.SIZE);
		System.out.println("��װ�ࣺjava.lang.Double");
		System.out.println("��Сֵ��Double.MIN_VALUE=" + Double.MIN_VALUE);
		System.out.println("���ֵ��Double.MAX_VALUE=" + Double.MAX_VALUE);
		System.out.println();

		// char
		System.out.println("�������ͣ�char ������λ����" + Character.SIZE);
		System.out.println("��װ�ࣺjava.lang.Character");
		// ����ֵ��ʽ�������ַ���ʽ��Character.MIN_VALUE���������̨
		System.out.println("��Сֵ��Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
		// ����ֵ��ʽ�������ַ���ʽ��Character.MAX_VALUE���������̨
		System.out.println("���ֵ��Character.MAX_VALUE=" + (int) Character.MAX_VALUE);
		System.out.println();
		
		//Java����
		final double PI = 3.1415927;
		System.out.println("������" + PI);
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
