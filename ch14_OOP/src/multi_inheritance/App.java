package multi_inheritance;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		//Speaker s1 = new Speak();
		p1.greet();
		p1.speak();
		
		Speaker p2 = new Person();
		p2.speak();
		//p2.greet(); ����Ŀ �������̽��� greet �޼ҵ� ����!
		
		Greeter p3 = new Person();
		p3.greet();
		//p3.speak(); �׸��� �������̽����� speak �޼ҵ� ����!

	}

}