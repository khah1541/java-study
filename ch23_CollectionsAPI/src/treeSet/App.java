package treeSet;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person other) {
		// Tree���� ������ �� �� �ֵ��� �񱳹���� �ڵ�� �ۼ��Ѵ�.
		return this.name.compareTo(other.name);
	}
	
	
}



public class App {

	public static void main(String[] args) {
		// Ʈ������ ���� ��� �߰�
		TreeSet<Person> people = new TreeSet<>();
		TreeSet<Integer> numbers = new TreeSet<>();
		
		
		
		people.add(new Person("���"));
		people.add(new Person("���̾�"));
		people.add(new Person("������"));
		people.add(new Person("������"));
		
		numbers.add(8);
		numbers.add(1);
		numbers.add(3);
		numbers.add(7);
		
		
		
		for(Person p : people) {
			System.out.println(p);
		}
		
		for(Integer n : numbers) {
			System.out.println(n);
		}
		
		}

}
