package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


//����ע���ʾ��
public class SxtDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException {
		
		    //ͨ������reflection����ȡע��
			Class<?> clazz = Class.forName("annotation.SxtStudent");
			
			//����������ע��
			Annotation[] annotations = clazz.getAnnotations();
			for (Annotation a: annotations) {
				System.out.println(a);
			}
			
			//��һ�ֻ�ȡ�������ע��
			SxtAnnotationTable st = (SxtAnnotationTable) clazz.getAnnotation(SxtAnnotationTable.class);
			System.out.println(st.value());
			
			//���������Ե�ע��			
			Field f = clazz.getDeclaredField("studentName");
			SxtAnnotationField sxtField = f.getAnnotation(SxtAnnotationField.class);
			System.out.println(sxtField.columnName() + " " + sxtField.type() + " " + sxtField.length() );
			
	}

}
