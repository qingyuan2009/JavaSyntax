package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


//解析注解的示范
public class SxtDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException {
		
		    //通过反射reflection来读取注解
			Class<?> clazz = Class.forName("annotation.SxtStudent");
			
			//获得类的所有注解
			Annotation[] annotations = clazz.getAnnotations();
			for (Annotation a: annotations) {
				System.out.println(a);
			}
			
			//另一种获取类的所有注解
			SxtAnnotationTable st = (SxtAnnotationTable) clazz.getAnnotation(SxtAnnotationTable.class);
			System.out.println(st.value());
			
			//获得类的属性的注释			
			Field f = clazz.getDeclaredField("studentName");
			SxtAnnotationField sxtField = f.getAnnotation(SxtAnnotationField.class);
			System.out.println(sxtField.columnName() + " " + sxtField.type() + " " + sxtField.length() );
			
	}

}
