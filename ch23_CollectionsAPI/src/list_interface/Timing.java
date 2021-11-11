package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.management.RuntimeOperationsException;

public class Timing {

	public static void main(String[] args) {
		//

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		// Ŭ���� �����ö� ����Ű ��Ʈ��+�����̽� , ������ �Ѳ����� ��Ʈ��+����Ʈ+o
		
		long duration = timeOperation(linkedList);
		
		System.out.println("�����ð�  : " + duration);
		// �׳� ������� �߰��Ҷ� ��̸���Ʈ�� ��ũ�� ���� 5���̻� ������
		// Ư�� ��ġ�� �߰� �Ǵ� ���� �Ҷ� ��ũ�� ����Ʈ�� 10��� ������
		
	}

	private static long timeOperation(List<Integer> List) {
		// �Է¹��� ����Ʈ�� ����ð��� �����ؼ� ����
		long start = System.currentTimeMillis(); //���� �ð��� 1/1000�� ������ ����
		
		int total = 0;
		for(int i = 0; i < 100000; i++) {
			List.add(0,i);
		}	return System.currentTimeMillis() - start; //�۾��� ���� ������ �����ð� - �����ð�
	}
	}

