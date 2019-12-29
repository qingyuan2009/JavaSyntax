package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class reflectionTest04 {
	
	public void test01(Map<String, User> map, List<User> list) {
		System.out.println("test01");		
	}
	
	public Map<String, User> test02() {
		System.out.println("test02");
		return null;		
	}

	public static void main(String[] args) {		
		
		try {
			
			Method m1 = reflectionTest04.class.getDeclaredMethod("test01", Map.class, List.class);
			Type[] t =  m1.getGenericParameterTypes();
			for (Type paramType : t) {
				System.out.println("#" + paramType);
				if(paramType instanceof ParameterizedType) {
					Type[] genericTypes = ((ParameterizedType)paramType).getActualTypeArguments();
					for (Type genericType : genericTypes) {
						System.out.println("参数-泛型类型" + genericType);
					}					
				}				
			}	
			
			Method m2 = reflectionTest04.class.getDeclaredMethod("test02", null);
			Type returnType = m2.getGenericReturnType();
			if(returnType instanceof ParameterizedType) {
				Type[] genericTypes = ((ParameterizedType)returnType).getActualTypeArguments();
				for (Type genericType : genericTypes) {
					System.out.println("返回值-泛型类型" + genericType);
				}					
			}				
			
		} catch (NoSuchMethodException e) {			
			e.printStackTrace();
		} catch (SecurityException e) {			
			e.printStackTrace();
		}		

	}

}
