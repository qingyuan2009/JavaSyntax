# ���ͷ���
public static < T1, T2 > void printArray( T1[] inputArray, T2[] inputArray )

# ������
public class Box<T>{}

# ����ͨ���
public static void getData(List<?> data) {}
List<?> ���߼�����List<String>,List<Integer> ������List<��������ʵ��>�ĸ���

# ����ͨ�������
public static void getUperNumber(List<? extends Number> data){}
����Number�����²���������

# ����ͨ�������
List<? super Number>����ʾ����ֻ�ܽ���Number�������㸸�����ͣ��� Object ���͵�ʵ����