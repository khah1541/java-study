package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// �Է��� �޴� Ŭ���� scanner �̿�
		Scanner scanner = new Scanner(System.in); // ��ĳ�ʸ� ����Ҽ� �ְ� ����
		System.out.println("�µ��� �Է��� �ּ��� :");
		double c = scanner.nextDouble(); // ��ĳ�� ��ü�� nextInt() �޼ҵ�� �������� �Է�
		double f = (c * 9 / 5) + 32;

		System.out.println("����  " + c + "�� ȭ��" + f + "�̴�.");
	}

}
