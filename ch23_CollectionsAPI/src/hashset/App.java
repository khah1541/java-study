package hashset;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// ��(set)���� ������ ����, �������� �ߺ� �ȵ�
		HashSet<String> fruits = new HashSet<>();
		
		fruits.add("���");
		fruits.add("�ٳ���");
		fruits.add("������");
		fruits.add("������");
		fruits.add("��");
		fruits.add("���");
		fruits.add("���");

		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		//�� ����Ʈ�� Ư�� �������� �ִ��� Ȯ��
		System.out.println(fruits.contains("������"));
	}

}
