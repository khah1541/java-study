package list_interface;

import java.util.ArrayList;
import java.util.List;

public class App2 {
	public static void main(String[] args) {
		//��̸���Ʈ�� ��ũ�帮��Ʈ�� �Ѵ� ����Ʈ �������̽��� ������
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		
		displayList(list1); //����Ʈ ������ ����ϴ� �޼ҵ�

		System.out.println();
		
		List<Integer> list2 = new ArrayList<>();
		list2.addAll(list1); //����Ʈ1�� ������ ����Ʈ2�� ��� �Է�

		list2.add(4);
		list2.add(5);

		displayList(list2);
	}

	private static void displayList(List<Integer> list) {
		// �Ű������� ����Ʈ ��ü�� �Է¹޾� ����Ʈ ������ ���� ���
		list.forEach(System.out::println);
		
	}

}
