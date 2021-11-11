package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		// ����Ʈ�� ����
		// �Ǽ�Ÿ�� ����Ʈ ����
		ArrayList<Double> doubles = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
	
		
		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.88);
		doubles.add(22.88);
		list.add(9);
		list.add(5);
		list.add(10);
		list.add(3);
		list.add(1);
		
		Collections.sort(doubles); //����
		Collections.sort(list); //����
		
		doubles.forEach(System.out::println);
		list.forEach(System.out::println);
	
		//Ŀ���� ��ü ����
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("���"));
		people.add(new Person("�浿"));
		people.add(new Person("���̾�"));
		people.add(new Person("�Ѹ�"));
		people.add(new Person("��ġ"));
		
		people.forEach(System.out::println);
		
		
		Collections.sort(people);
		System.out.println();

		people.forEach(System.out::println);
	}

}
