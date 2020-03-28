package collection02.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCard {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		List<Integer> age = new ArrayList<Integer>();
		List<Number> number = new ArrayList<Number>();

		name.add("icon");
		age.add(18);
		number.add(314);

		getData(name);
		getData(age);
		getData(number);

		// getUperNumber(name);//1
		getUperNumber(age);// 2
		getUperNumber(number);// 3
	}

	//类型通配符List<?>
	public static void getData(List<?> data) {
		System.out.println("data :" + data.get(0));
	}

	//类型通配符上限  List<? extends Number>
	//类型通配符下限  List<? super Number>
	public static void getUperNumber(List<? extends Number> data) {
		System.out.println("data :" + data.get(0));
	}

}
