package application;

import java.util.Scanner;

public class CheckPassLimit {
	public static void main(String[] args) {
		
		
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false;
		
		String password = "";
		
		
		for (int i = 1; i<= 3 ;i++) {
			System.out.println("��й�ȣ �Է� : ");
			password = scanner.nextLine();
			
			if(password.equals(USER_PASSWORD)) {
				System.out.println("���� ����");
				accessOK = true;
				break;
			}else {
				System.out.println("����� Ʋ�Ƚ��ϴ�.");
			}
		}
		
		scanner.close();
		
		if(!accessOK) {
			System.out.println("���� �ź�");
		}
		
		
	}
}
