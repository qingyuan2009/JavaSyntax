package annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)  //通过反射来读取annotation，所以这里必须是runtime
@Target(FIELD)
public @interface SxtAnnotationField {
	String columnName();
	String type();
	int length();

}
