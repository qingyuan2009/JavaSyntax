package reflection;

/*
 * 
 */
public class reflectionTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		String path = "reflection.User";  //
		
		Class clazz = Class.forName(path);
		System.out.println(clazz);
		System.out.println(clazz.hashCode());
		
		Class clazz2 = Class.forName(path);
		System.out.println(clazz2);
		System.out.println(clazz2.hashCode());
		
		Class<String> strClass = String.class;
		Class<?> strClass2 = path.getClass();
		System.out.println(strClass==strClass2);
		
		
		Class intClass = int.class;
		System.out.println(intClass);
		
		// same
		int[] a = new int[10];
		int[] b = new int[20];		
		System.out.println(a.getClass().hashCode());
		System.out.println(b.getClass().hashCode());
		
		// not same, ¸údimensionÓÐ¹Ø
		int[] c = new int[10];
		int[][] d = new int[20][10];
		double[] e = new double[20];
		System.out.println(c.getClass().hashCode());
		System.out.println(d.getClass().hashCode());
		System.out.println(e.getClass().hashCode());
	}
}
