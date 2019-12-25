package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectionTest02 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException {
		
		String path = "reflection.User";  
		Class clazz = Class.forName(path);
		
		//返回类名+包名
		System.out.println(clazz.getName());
		
		//返回类名
		System.out.println(clazz.getSimpleName());
		
		//因为是private attribute，所以返回0
		Field[] fields = clazz.getFields();
		System.out.println(fields.length);
		
		//getDeclaredFields 可以获取所有attributes
		Field[] declaredFields = clazz.getDeclaredFields();
		System.out.println(declaredFields.length);		
		for (Field field:declaredFields) {
			System.out.println("属性：" + field);
		}
		//获取单个attribute
		Field feild = clazz.getDeclaredField("uname");
		System.out.println(feild.getType());		
		
		//获取方法
		Method[] declaredMethod = clazz.getDeclaredMethods();
		for (Method method:declaredMethod) {
			System.out.println("方法：" + method );
		}		
		//获取单个方法，为什么要加参数， 就是考虑重载
		Method method1 = clazz.getDeclaredMethod("setUname", String.class);
		Method method2 = clazz.getDeclaredMethod("getUname", null);
		
		Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		for (Constructor constructor:declaredConstructors) {
			System.out.println("构造器：" + constructor );
		}	
		
		Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class , int.class, String.class);
		System.out.println(declaredConstructor );
	}

}
