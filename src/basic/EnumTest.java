package basic;

public class EnumTest {

	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		Season a = Season.SPRING;

		switch (a) {
		case SPRING:
			System.out.println("spring");
			break;
		case SUMMER:
			System.out.println("summer");
			break;
		default:
			break;
		}

	}

	enum Season {
		SPRING, SUMMER, AUTUMN, WINTER
	}

	enum week {
		星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期日
	}

}
