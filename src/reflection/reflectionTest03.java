package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectionTest03 {

	public static void main(String[] args) {
		
		String path = "reflection.User"; 
		
		try {
			//这是种普遍在javabean中使用的动态创建对象的方式
			Class<User> clazz = (Class<User>)Class.forName(path);
			User user = clazz.newInstance(); // newInstance() 调用无参的构造器
			System.out.println(user);
			
			//如何动态调用带参数的构造器
			Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class , int.class, String.class);
			User user2 = (User) declaredConstructor.newInstance(1,18,"zhou");
			System.out.println(user2.getUname());
			
			//如何动态调用方法
			User user3 = clazz.newInstance();
			Method method = clazz.getDeclaredMethod("setUname", String.class);
			method.invoke(user3, "rui");
			System.out.println(user3.getUname());
			
			
			Field feild = clazz.getDeclaredField("uname");
			User user4 = clazz.newInstance();
			//不需要执行安全检查，如果使用默认false，会大大影响执行效率
			feild.setAccessible(true);  //否则会报错，无法操作private属性
			feild.set(user4, "zhang"); 
			System.out.println(user4.getUname() + " " + feild.get(user4) );
			
			 
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | 
				NoSuchMethodException | SecurityException | IllegalArgumentException | 
				InvocationTargetException | NoSuchFieldException e) {			
			e.printStackTrace();
		}
		
		

	}

}
