package lambda_parameter;

interface Runner{
	void execute(String s);
}

public class App {

	public static void main(String[] args) {
		// �Ķ����(�Ű�����) �ִ� �߻�޼ҵ�
		Runner run1 = (s) -> System.out.println(s);
		run1.execute("���");

		Runner run2 = (t) -> System.out.println(t);
		run1.execute("�浿");

		
		
		
	}
}


