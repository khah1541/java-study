package application;

import java.util.Scanner;

public class CheckPassLimit {
	public static void main(String[] args) {
		
		
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false;
		
		String password = "";
		
		
		for (int i = 1; i<= 3 ;i++) {
			System.out.println("비밀번호 입력 : ");
			password = scanner.nextLine();
			
			if(password.equals(USER_PASSWORD)) {
				System.out.println("접속 승인");
				accessOK = true;
				break;
			}else {
				System.out.println("비번이 틀렸습니다.");
			}
		}
		
		scanner.close();
		
		if(!accessOK) {
			System.out.println("접속 거부");
		}
		
		
	}
}
