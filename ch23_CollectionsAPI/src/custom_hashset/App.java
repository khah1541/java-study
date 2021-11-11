package custom_hashset;

import java.util.HashSet;
import java.util.Objects;

class Creature {
	private int id;
	private String name;
	
	public Creature(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		
		return id + " : " +name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return id == other.id;//��ü�� id�� ������ true ����
	}
	
}

public class App {

	public static void main(String[] args) {
		// Ŀ���� Ŭ���� Creature Ÿ�� �� ����Ʈ ����
		HashSet<Creature> creatures = new HashSet<>();
		
		//�� ������ �ߺ��� �񱳴� ��ü�� equals �޼ҵ带 ����� ������ ����
		creatures.add(new Creature(0,"�����"));
		creatures.add(new Creature(1,"��"));
		creatures.add(new Creature(2,"����"));
		creatures.add(new Creature(2,"����"));
		creatures.add(new Creature(3,"��"));
		creatures.add(new Creature(4,"��"));
		creatures.add(new Creature(4,"��ѱ�"));
		
		System.out.println(creatures.contains(new Creature(0, "�����")));

		creatures.forEach(System.out::println);
	}

}
