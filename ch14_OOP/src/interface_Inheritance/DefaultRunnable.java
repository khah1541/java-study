package interface_Inheritance;

//�������̽��� ��Ʈ���̽��� ���
public interface DefaultRunnable extends Runnable {
	default void displayDetails()	{// ����Ʈ �޼���� �޼ҵ� �ڵ带 �����.
		System.out.println("ǥ���� ������ ����");
	}
}
