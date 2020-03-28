package basic;

public class WrapperClass {

	public static void main(String[] args) {
		//��װ��
		Integer a = new Integer(3);
		Integer b = Integer.valueOf(30);
		
		int c = b.intValue();
		double d = b.doubleValue();
		
		
		Integer f = new Integer("999");
		Integer g = Integer.parseInt("888");
		
		String h = b.toString();
		
		//��װ��ĳ���
		System.out.println("��Сֵ��Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("���ֵ��Integer.MAX_VALUE=" + Integer.MAX_VALUE);
		
		Integer i = 123;  // = Integer.valueOf(123) �Զ�װ��
		int j = i;        // = i.intValue()  �Զ�����
		
		
		Integer int1 = 127;
		Integer int2 = 127;
		//������Ӧ���ǲ�ͬ��object�� ��JAVA��-128 ��127����cache 
		System.out.println("���� int 1 �� int2 �Ƿ���ȣ� " + (int1 == int2) ); //���
		System.out.println("int 1 �� int2 ֵ�Ƿ���ȣ� " + (int1.equals(int2)) );		
		
		Integer int3 = 128;
		Integer int4 = 128;
		//���� -128 ... 127 �򲻻�cache
		System.out.println("���� int 3 �� int4 �Ƿ���ȣ� " + (int3 == int4) ); // ����
		System.out.println("int 3 �� int4 ֵ�Ƿ���ȣ� " + (int1.equals(int2)) );
		
	}

}
