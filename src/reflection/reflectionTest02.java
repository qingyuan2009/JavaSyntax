package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectionTest02 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException {
		
		String path = "reflection.User";  
		Class clazz = Class.forName(path);
		
		//��������+����
		System.out.println(clazz.getName());
		
		//��������
		System.out.println(clazz.getSimpleName());
		
		//��Ϊ��private attribute�����Է���0
		Field[] fields = clazz.getFields();
		System.out.println(fields.length);
		
		//getDeclaredFields ���Ի�ȡ����attributes
		Field[] declaredFields = clazz.getDeclaredFields();
		System.out.println(declaredFields.length);		
		for (Field field:declaredFields) {
			System.out.println("���ԣ�" + field);
		}
		//��ȡ����attribute
		Field feild = clazz.getDeclaredField("uname");
		System.out.println(feild.getType());		
		
		//��ȡ����
		Method[] declaredMethod = clazz.getDeclaredMethods();
		for (Method method:declaredMethod) {
			System.out.println("������" + method );
		}		
		//��ȡ����������ΪʲôҪ�Ӳ����� ���ǿ�������
		Method method1 = clazz.getDeclaredMethod("setUname", String.class);
		Method method2 = clazz.getDeclaredMethod("getUname", null);
		
		Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		for (Constructor constructor:declaredConstructors) {
			System.out.println("��������" + constructor );
		}	
		
		Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class , int.class, String.class);
		System.out.println(declaredConstructor );
	}

}
