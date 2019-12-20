package annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ TYPE, METHOD })
public @interface MyAnnotation_01 {
	
	String studentName() default "";
	int age() default 0;
	int id() default -1; // -1 表示不存在
	String[] schools() default {"清华", "北大"};

}
