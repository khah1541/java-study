package remove_Items;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name; //(�̸�)
	public Cat(String name) { //������(�̸�)
		this.name = name;
	}
	public String toString() { //toString ���� �̸�
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		// ����Ʈ�� �������� ����
		Cat c1 = new Cat("��ƿ��");
		
		List<Cat> cats = new ArrayList<>();
		
		cats.add(c1);
		cats.add(new Cat("���̾�"));
		cats.add(new Cat("����Ŭ"));
		cats.add(new Cat("����"));
		
		cats.forEach(System.out::println);
		System.out.println();
		
		cats.remove(1);//�ε��� ��ȣ

		cats.forEach(System.out::println);
		System.out.println();
		
		cats.remove(c1); // ��ƿ�� ��ü�� �ּ�
		
		cats.forEach(System.out::println);
		System.out.println();
		
		
	}

}
