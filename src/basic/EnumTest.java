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
		����һ, ���ڶ�, ������, ������, ������, ������, ������
	}

}
