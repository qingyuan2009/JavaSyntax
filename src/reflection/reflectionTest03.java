package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectionTest03 {

	public static void main(String[] args) {
		
		String path = "reflection.User"; 
		
		try {
			//�������ձ���javabean��ʹ�õĶ�̬��������ķ�ʽ
			Class<User> clazz = (Class<User>)Class.forName(path);
			User user = clazz.newInstance(); // newInstance() �����޲εĹ�����
			System.out.println(user);
			
			//��ζ�̬���ô������Ĺ�����
			Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class , int.class, String.class);
			User user2 = (User) declaredConstructor.newInstance(1,18,"zhou");
			System.out.println(user2.getUname());
			
			//��ζ�̬���÷���
			User user3 = clazz.newInstance();
			Method method = clazz.getDeclaredMethod("setUname", String.class);
			method.invoke(user3, "rui");
			System.out.println(user3.getUname());
			
			
			Field feild = clazz.getDeclaredField("uname");
			User user4 = clazz.newInstance();
			//����Ҫִ�а�ȫ��飬���ʹ��Ĭ��false������Ӱ��ִ��Ч��
			feild.setAccessible(true);  //����ᱨ���޷�����private����
			feild.set(user4, "zhang"); 
			System.out.println(user4.getUname() + " " + feild.get(user4) );
			
			 
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | 
				NoSuchMethodException | SecurityException | IllegalArgumentException | 
				InvocationTargetException | NoSuchFieldException e) {			
			e.printStackTrace();
		}
		
		

	}

}
