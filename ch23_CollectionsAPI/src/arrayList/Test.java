package arrayList;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 스캐너 사용해 리스트에 실수를 입력해 출력

		Scanner scanner = new Scanner(System.in);

		LinkedList<Double> numbers = new LinkedList<>();

		double total = 0;
		
		while (true) {
			
			System.out.println("숫자 또는 'q' 입력 > ");
			String input = scanner.nextLine(); // 엔터 전까지 입력한 문자열을 저장
			input = input.trim(); // 만약 공백이 앞 뒤에 있으면 제거

			if(input.equals("q")) {
				break;	//만약 입력된 문자열이 "q"와 같으면 반복문 종료
			}
			try {
			double value = Double.parseDouble(input); // 문자열숫자를 => 실수로 변경
			numbers.add(value); // 입력한 실수를 리스트에 저장
			total = total + value;
			}catch (NumberFormatException e) {
			 //실수를 변환할때 발생한 예외
				System.out.println("숫자가 아닙니다.");
				
			}
			
		}
		scanner.close();

		Collections.sort(numbers);
		System.out.println();
		
		if (numbers.size() > 0) {//입력된 실수가 있다
		System.out.println("입력된 숫자 :");
		
		for (Double number : numbers) {
			System.out.printf("%.2f\n", number); // 실수를 소수점 2번째까지 출력
			
		}
		}else {
			System.out.println("실수가 입력되지 않았습니다.");
		} System.out.printf("평균값 : %.2f",total/numbers.size());
	} 

}
