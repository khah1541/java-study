package list_interface;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		//��̸���Ʈ�� ��ũ�帮��Ʈ�� �Ѵ� ����Ʈ �������̽��� ������
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		numbers.add(4);
		
		dispalyList(numbers); //����Ʈ ������ ����ϴ� �޼ҵ�
	}

	private static void dispalyList(List<Integer> list) {
		// �Ű������� ����Ʈ ��ü�� �Է¹޾� ����Ʈ ������ ���� ���
		list.forEach(System.out::println);
		
	}

}
