package lambda_interface;

import java.util.ArrayList;
import java.util.List;

public class RepalceAll {

	public static void main(String[] args) {
		// ����Ʈ�� ������ ���� ���� ����� ��ü
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		
		//����Ʈ�� ������ �ϳ��� �������� �ٲ۴�
		numbers.replaceAll(n -> n*n);
		
		numbers.forEach(t -> System.out.println(t));

		List<String> friends = new ArrayList<>();
		
		friends.add("���");
		friends.add("�浿");
		friends.add("�޸�");
		friends.add("ö��");
		friends.add("��");

		//���ڿ� ����Ʈ�� ������ "�ȳ�~"���� �ٿ��� �ٲ۴�.
		friends.replaceAll(s -> "�ȳ�~" +s);

		friends.forEach(t -> System.out.println(t));
		
		
		
	}

}
