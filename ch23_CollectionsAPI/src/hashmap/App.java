package hashmap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// �ؽø��� ����(�ε���)�� ���� Ű ������ �ε��� ��ü
		HashMap<Integer, String> people = new HashMap<>();
		//���� �Է½� ���� 2��(key,value)�̱� ������ add�� �ƴ϶� put���� �Է�
		people.put(0, "���");
		people.put(1, "�浿");
		people.put(3, "���̾�");
		people.put(4, "������");
		people.put(4, "����Ŭ"); // 4�� Ű�� value ���� "����Ŭ"�� ����
		people.put(10, "����");
		
		people.forEach((k,v )-> {
			System.out.println(k + " : " + v);
		}); 
		
		//Ű ���� �ش��ϴ� ���� ��������
		System.out.println(people.get(4));

	}

}
