package enum_switch;

public class App {

	public static void main(String[] args) {
		Fruit f1 = Fruit.APPLE;
	
		switch(f1) {
		case ORANGE:
			System.out.println("������");
			break;
		case BANANA:
			System.out.println("�ٳ���");
			break;
		case APPLE:
			System.out.println("���");
			break;
		default:
			System.out.println("���� �����Դϴ�.");
			break;
			
		}

	}

}
