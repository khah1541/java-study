package parameter;

public class App {

	public static void main(String[] args) {

		Calulator calc = new Calulator();

		int number = 7;
		int result = calc.square(number);

		System.out.printf("%d �� �������� %d �̴�\n", number, result);
		
		result = calc.plus(10,10);
		System.out.printf("�� ���� ���� %d �̴�.\n", result);
	
		result = calc.minus(10,10);
		System.out.printf("�� ���� ���� %d �̴�.\n", result);
		
		
	}
	

}