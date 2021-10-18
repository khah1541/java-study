package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true;
	private RandomWord word = new RandomWord();
	Scanner scanner = new Scanner(System.in);
	
	public void run() {
		// 게임 시작
		
		//1. 화면의 단어표시
		//2. 철자 입력
		//3. 철자가 맞는지 체크(다 맞으면 종료)
	
		do {
			displayWord(); //화면의 단어표시
			getUserInput(); //입력받음
			checkUserInput(); // 맞는지 체크 다 맞으면 running = false
		}while (running);
	}
		public void close() {
			scanner.close();
		}
		
		public void checkUserInput() 
		{
		//유저가 단어를 다 맞췄는지 체크해서 게임을 종료
			//게임 종료 확인을 하는 메소드 isCompleted 를 RandomWord 클래스에 만들기
			
		 if(word.isCompleted()) {
			 System.out.println("잘 맞췄어요");
			 System.out.println("정답은 : " + word.toString());
			 running = false; // 반복문 종료
		 }
		}
		public void getUserInput() {
		//유저에게 한 문자 입력 요구
		// 입력받은 문자열에서 그 문자를 뽑아서 RandomWord 객체에 전달=>addGuess(문자) 메소드
			
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));
		
		
		
		}
		public void displayWord() {
			//랜덤 단어 출력
		System.out.println(word.toString()); 
		
		
		
		
		}
		
	}
	
	


