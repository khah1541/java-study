package arrayList;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// ��ĳ�� ����� ����Ʈ�� �Ǽ��� �Է��� ���

		Scanner scanner = new Scanner(System.in);

		LinkedList<Double> numbers = new LinkedList<>();

		double total = 0;
		
		while (true) {
			
			System.out.println("���� �Ǵ� 'q' �Է� > ");
			String input = scanner.nextLine(); // ���� ������ �Է��� ���ڿ��� ����
			input = input.trim(); // ���� ������ �� �ڿ� ������ ����

			if(input.equals("q")) {
				break;	//���� �Էµ� ���ڿ��� "q"�� ������ �ݺ��� ����
			}
			try {
			double value = Double.parseDouble(input); // ���ڿ����ڸ� => �Ǽ��� ����
			numbers.add(value); // �Է��� �Ǽ��� ����Ʈ�� ����
			total = total + value;
			}catch (NumberFormatException e) {
			 //�Ǽ��� ��ȯ�Ҷ� �߻��� ����
				System.out.println("���ڰ� �ƴմϴ�.");
				
			}
			
		}
		scanner.close();

		Collections.sort(numbers);
		System.out.println();
		
		if (numbers.size() > 0) {//�Էµ� �Ǽ��� �ִ�
		System.out.println("�Էµ� ���� :");
		
		for (Double number : numbers) {
			System.out.printf("%.2f\n", number); // �Ǽ��� �Ҽ��� 2��°���� ���
			
		}
		}else {
			System.out.println("�Ǽ��� �Էµ��� �ʾҽ��ϴ�.");
		} System.out.printf("��հ� : %.2f",total/numbers.size());
	} 

}
