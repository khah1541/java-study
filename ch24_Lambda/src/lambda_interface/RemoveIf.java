package lambda_interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args) {
		// Ư��Ÿ��(���׸�)�� �˻�(test)�ؼ� ��/���� �Ǻ��� ����
		List<Integer> numbers = new ArrayList<>();

		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);
		numbers.add(4);
		// removeIf �޼ҵ�� ����Ʈ�� �������� precate�� test�޼ҵ�� �˻��ؼ� ���̸� ���� 
		numbers.removeIf(n -> n < 6);//������ ���� 6���� ������ ��
		
		numbers.forEach(t -> System.out.println(t));
	}

}
