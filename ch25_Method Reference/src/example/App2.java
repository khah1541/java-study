package example;


@FunctionalInterface
interface Greeter{
	void greet(); //�߻� �޼ҵ�
}


public class App2 {

	public static void main(String[] args) {
		// �޼ҵ� ���۷����� ���ٽ� ��ü
		Greeter g =  App2::sayHello;
		
		g.greet();
		
	}

	private static void sayHello() {
		System.out.println("��ο�~~");
	}
}
