package lambda_example;

interface Runner{
	void execute();
}


public class App2 {

	public static void main(String[] args) {
		// ���� �Լ��� �������̽��� ����� ���ٽ� ���
		// 1. �Լ��� �������̽�(�޼ҵ尡 1��)�϶� ��밡��
		// 2. �߻�޼ҵ��� ���ϰ��� �Ű������� Ȯ���ϰ� �����Ѵ�.
		Runner run = () -> System.out.println("��ο�");
		run.execute();
		
	}

}
