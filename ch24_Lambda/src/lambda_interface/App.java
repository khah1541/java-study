package lambda_interface;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// Predicate�� ���׸� T Ÿ���� �˻��ؼ� (test) boolean(��/����) �����Ѵ�.
		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// �߻�޼ҵ� �׽�Ʈ ���ϰ� (��/����), ���ڿ� �Ű�����1
				return t.length() < 4; //���ڿ� ���̱Ⱑ 4���� ������ �� �ƴϸ� ����
			}
			
		};
		
		System.out.println(p1.test("abcd"));
		System.out.println(p1.test("�ϳ���"));

		Predicate<String> p2 = t -> t.length() <4;
		System.out.println(p2.test("abcd"));
		System.out.println(p2.test("�ϳ���"));
	}

}
