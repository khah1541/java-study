package lambda_return;

interface Joiner {
	String join(String t1, String t2); // ���ϰ��� �ִ� �߻�޼ҵ�
}

public class App {

	public static void main(String[] args) {
		// ���� ���� �ִ� ���ٽ�
		Joiner joiner = (t1, t2) -> {
			String text = t1 + " - " + t2;
			return text;
		};

		System.out.println(joiner.join("ġŲ", "����"));
		System.out.println(joiner.join("�п�", "����"));

		Joiner joiner2 = (s1, s2) -> s1 + " + " + s2;//�ڵ尡 �����϶� ���� �������� 1���ڵ�
		System.out.println(joiner2.join("ġŲ", "����"));
		System.out.println(joiner2.join("�п�", "����"));
		
		
	}

}
