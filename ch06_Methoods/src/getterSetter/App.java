package getterSetter;

public class App {

	public static void main(String[] args) {
		// ���������� private�� ���� Ŭ���������� ���ٰ���
		Person p1 = new Person();
		//p1.name = "���";
		p1.setName("���");
		System.out.println(p1.getName());
		p1.setAge(7);
		System.out.println(p1.getAge());
		
	}
}
