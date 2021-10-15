package application;

import java.util.Random;

public class Hangman {

	private boolean running = false;
	private RandomWord word = new RandomWord();
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
		public void checkUserInput() 
		{
		 System.out.println("체크");	
		}
		public void getUserInput() {
		System.out.println("단어맞추기");	
		}
		public void displayWord() {
			//랜덤 단어 출력
				
		System.out.println(word.toString()); 
		
		
		
		
		}
		
	}
	
	


