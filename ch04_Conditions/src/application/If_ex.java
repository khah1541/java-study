package application;

import java.util.Scanner;

public class If_ex {

	public static void main(String[] args) {
		// IF 문
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사과의 개수는?");
		int apples = scanner.nextInt();
		System.out.println("바나나의 개수는?");
		int bananas = scanner.nextInt();
		scanner.close();
		
		if(apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		}
		if(apples < bananas) {
		 System.out.println("바나나가 사과보다 많음");
		}
		System.out.println("프로그램 종료.");
	}

}
