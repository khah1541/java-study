package arrayList;

import java.util.ArrayList;




public class Custom_Object {

	public static void main(String[] args) {
		//����Ʈ�� Ŀ���� ��ü �Է�
		// people ����Ʈ���� Person Ÿ�� ��ü�� �Էµȴ�.
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("���"));
		people.add(new Person("�浿"));
		people.add(new Person("���̾�"));
		people.add(new Person("�Ѹ�"));
		
		people.forEach(System.out::println);
		
		people.set(1,new Person("����Ŭ"));
		
		System.out.println();
		
		people.forEach(System.out::println);

	}

}
