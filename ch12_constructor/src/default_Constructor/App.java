package default_Constructor;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("���");
		System.out.println(p2);
		Person p3 = new Person("���̾�",27);
		System.out.println(p3);

	}

}
