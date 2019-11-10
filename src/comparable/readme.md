# 为何需要实现Comparable接口
我们知道Collections类中包含很多对实现Collection接口的容器各种操作的静态方法.
当然, 其中最长用的莫过于排序了(Collections.sort(List l).

下面是1个简单例子:

	public class Compare1{
    	public static void f(){
        	ArrayList arr = new ArrayList();
        	arr.add(10);
        	arr.add(23);
        	arr.add(7);
 
        	System.out.println(arr);
 
        	Collections.sort(arr);
        
        	System.out.println(arr);
    	} 
	}

逻辑很简单, 就是在1个list容器中添加3个int数值(注意实际被自动装箱成Integer对象).
正常输出容器元素一次, 利用Collections.sort()方法排序后, 再输出1次.

输出:
 10,23,7
 7,10,23
 
 但是当List容器添加的元素对象是属于自己写的类时, 就可能出问题了.例子:

	import java.util.ArrayList;
	import java.util.Collections; 
	class Student{
    	private String name;
    	private int ranking; 
    	public Student(String name, int ranking){
        	this.name = name;
        	this.ranking = ranking;
    	} 
 
    	public String toString(){
        	return this.name + ":" + this.ranking;
    	}
	}
 
	public class Compare2{
    	public static void f(){
        	ArrayList arr = new ArrayList();
        	arr.add(new Student("Jack",10));
        	arr.add(new Student("Bill",23));
        	arr.add(new Student("Rudy",7)); 
        	System.out.println(arr);
    	} 
	}

上面定义了1个Student类, 它只有两个成员, 名字和排名.
在f()方法内, 添加3个Student的对象到1个list容器中, 然后输出(必须重写String方法, 这里不解释了):

Jack:10, Bill:23, Rudy:7

到此为止, 是没有问题的.  但是当我对这个容器进行排序时就有问题了.
例如将上面的f()方法改成:

	public class Compare2{
    	public static void f(){
        	ArrayList arr = new ArrayList();
        	arr.add(new Student("Jack",10));
        	arr.add(new Student("Bill",23));
        	arr.add(new Student("Rudy",7)); 
        	System.out.println(arr);
        	Collections.sort(arr);
        	System.out.println(arr);
    	} 
	}

编译时就会出错:
 [java] Caused by: java.lang.ClassCastException: Collection_kng.Comparable_kng.Student cannot be cast to java.lang.Comparable

提示这个类Student没有实现Comparable接口.
原因也很简单, 因为Java不知道应该怎样为Student对象排序, 是应该按名字排序? 还是按ranking来排序?

为什么本文第1个例子就排序成功? 是因为Java本身提供的类Integer已经实现了Comparable接口. 也表明Integer这个类的对象是可以比较的.

而Student类的对象默认是不可以比较的.  除非它实现了Comparable接口.

总而言之,  如果你想1个类的对象支持比较(排序), 就必须实现Comparable接口.

# Comparable接口简介.

Comparable 接口内部只有1个要重写的关键的方法.就是

**int compareTo(T o)**

这个方法返回1个Int数值,  

例如 i = x.compareTo(y)

如果i=0, 也表明对象x与y排位上是相等的(并非意味x.equals(y) = true, 但是jdk api上强烈建议这样处理)

如果返回数值i>0 则意味者, x > y啦，　

反之若i<0则　意味x < y

# Comparable接口的实现及用法.
用回上面的例子，　我们修改Student类, 令其实现Comparable接口并重写compareTo方法.

	import java.util.ArrayList;
	import java.util.Collections;
 
	class Student implements Comparable{
    	private String name;
    	private int ranking; 
    	public Student(String name, int ranking){
        	this.name = name;
        	this.ranking = ranking;
    	} 
 
    	public String toString(){
        	return this.name + ":" + this.ranking;
    	}
 
    	public int compareTo(Object o){
        	Student s = (Student)(o);
        	return this.ranking - s.ranking;
    	}
	}
 
	public class Compare2{
    	public static void f(){
        	ArrayList arr = new ArrayList();
        	arr.add(new Student("Jack",10));
        	arr.add(new Student("Bill",23));
        	arr.add(new Student("Rudy",7));
         	System.out.println(arr);
        	Collections.sort(arr);
        	System.out.println(arr);
    	} 
	}

注意重写的compareTo(Object o)方法内.  根据Student的ranking成员来比较的, 也就是说跟姓名无关了.

这时再编译执行, 就能见到List容器内的Student对象已经根据ranking来排序了. 

输出:
Jack:10, Bill:23, Rudy:7
Rudy:7, Jack:10, Bill:23
