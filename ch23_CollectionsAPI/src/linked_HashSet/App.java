package linked_HashSet;

import java.util.LinkedHashSet;

public class App {

	public static void main(String[] args) {
		// ��ũ�� �ؽ��� : �ߺ� �ȵǰ� �Էµ� ������� ���
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("���");
		fruits.add("�ٳ���");
		fruits.add("������");
		fruits.add("������");
		fruits.add("��");
		fruits.add("���");
		fruits.add("���");
		
		System.out.println(fruits.contains("������")); //������ true ������ false
		
		for(String f : fruits) {
			System.out.println(f);
		}

	}

}
