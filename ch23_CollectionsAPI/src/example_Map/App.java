package example_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		// key:Person ��ü, value : true,false(���ݼ��� ����)
		Map<Person,Boolean> people1 = new HashMap<>();
		Map<Person,Boolean> people2 = new LinkedHashMap<>();
		Map<Person,Boolean> people3 = new TreeMap<>();
		
		//�ʿ��� Ű������ �ߺ��� �����ϴµ� Person Ŭ�������� equals�޼ҵ带 �̸����� �����ϸ� �̸��� ������ �ߺ��� �ȴ�.
		inputMap(people1);
		dispalyMap(people1);
		
		inputMap(people2);
		dispalyMap(people2);
		
		//Ʈ������ ������ �ؾ��ϴµ� Ű���� Person ��ü�� �� �Ҽ��ִ� �޼ҵ尡 ����. => comparable �������̽� �߰�
		inputMap(people3);
		dispalyMap(people3);
	
	}

	private static void dispalyMap(Map<Person, Boolean> map) {
		// �ʿ� �ִ� k, v ���� ���
		map.forEach((k,v)->System.out.println(k+" : "+v));
		System.out.println();//���� ����
	}

	private static void inputMap(Map<Person, Boolean> map) {
		// map�� Ű �� ���� �Է�
		map.put(new Person("���"),true);
		map.put(new Person("�浿"),true);
		map.put(new Person("���̾�"),false);
		map.put(new Person("�Ѹ�"),false);
		map.put(new Person("���̾�"),false);
		map.put(new Person("�Ѹ�"),true);
	}
	
}
