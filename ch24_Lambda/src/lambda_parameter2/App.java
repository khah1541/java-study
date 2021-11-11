package lambda_parameter2;

interface Runner {
	void execute(String name,String text);
}

public class App {

	public static void main(String[] args) {
		// �Ķ����2(�Ű�����) �ִ� �߻�޼ҵ�
		Runner run = (n,t) -> System.out.printf("%s�� %s \n",n,t);
		Runner run2 = (n,t) -> System.out.printf("%s %s�� \n",t,n);
		
		run.execute("���","�ȳ��ϼ���");
		run2.execute("����", "�ȳ��ϼ���");
		greet(run);
		greet(run2);
	}

	private static void greet(Runner run) {
		run.execute("�浿", "�ȳ��ϼ���");
		
	}
}
