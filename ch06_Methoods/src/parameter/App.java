package parameter;

public class App {

	public static void main(String[] args) {

		Calulator calc = new Calulator();

		int number = 7;
		int result = calc.square(number);

		System.out.printf("%d 의 제곱근은 %d 이다\n", number, result);
		
		result = calc.plus(10,10);
		System.out.printf("두 수의 합은 %d 이다.\n", result);
	
		result = calc.minus(10,10);
		System.out.printf("두 수의 차는 %d 이다.\n", result);
		
		
	}
	

}
