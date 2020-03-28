# 泛型方法
public static < T1, T2 > void printArray( T1[] inputArray, T2[] inputArray )

# 泛型类
public class Box<T>{}

# 类型通配符
public static void getData(List<?> data) {}
List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类

# 类型通配符上限
public static void getUperNumber(List<? extends Number> data){}
接受Number及其下层子类类型

# 类型通配符下限
List<? super Number>：表示类型只能接受Number及其三层父类类型，如 Object 类型的实例。