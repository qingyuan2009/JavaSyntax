# �����������
* dataType[] arrayRefVar;   // ��ѡ�ķ���
* dataType arrayRefVar[];   // Ч����ͬ����������ѡ����

ʵ��
* double[] myList;         // ��ѡ�ķ���
* double myList[];         //  Ч����ͬ����������ѡ����

# ��������
dataType[] arrayRefVar;

arrayRefVar = new dataType[arraySize];

����
* dataType[] arrayRefVar = new dataType[arraySize];
* dataType[] arrayRefVar = {value0, value1, ..., valuek};

# ��ά����
	type[][] typeName = new type[typeLength1][typeLength2];

Sample1:

	int a[][] = new int[2][3];

Sample2:

	String s[][] = new String[2][];
	s[0] = new String[2];
	s[1] = new String[3];
	s[0][0] = new String("Good");
	s[0][1] = new String("Luck");
	s[1][0] = new String("to");
	s[1][1] = new String("you");
	s[1][2] = new String("!");


# For Each

	for(type element: array)
	{
    	System.out.println(element);
	}

	double[] myList = {1.9, 2.9, 3.4, 3.5}; 
	// ��ӡ��������Ԫ��
	for (double element: myList) {
		System.out.println(element);
	}

# ������Ϊ�����Ĳ���

	public static void printArray(int[] array) {
  	for (int i = 0; i < array.length; i++) {
    	System.out.print(array[i] + " ");
  	}
	}
	printArray(new int[]{3, 1, 2, 6, 4, 2});

# ������Ϊ�����ķ���ֵ
	public static int[] reverse(int[] list) {
  		int[] result = new int[list.length]; 
  		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
    		result[j] = list[i];
  		}
  		return result;
	}