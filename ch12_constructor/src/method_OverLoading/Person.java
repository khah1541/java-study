package method_OverLoading;

public class Person {
	// �޼ҵ� �����ε� => �޼ҵ��� �̸��� ������, �Ű�����(parameter)�� �ٸ���
	public void greet() {
		System.out.println("��ο�!");
	}
	public void greet(String name) {
		System.out.println("��ο� " + name);
	}
	public void greet(int height) {
		if(height>185) {
			System.out.println("Ű�� ũ����.");
		}
		System.out.println("��ο� ");
	}
	public void greet(String name, int height) {
		if(height>185) {
			System.out.println("Ű�� ũ����.");
		}
		System.out.println("��ο� " + name);
	}
}
