package application;

import java.util.Random;

public class Hangman {

	private boolean running = false;
	private RandomWord word = new RandomWord();
	public void run() {
		// ���� ����
		
		//1. ȭ���� �ܾ�ǥ��
		//2. ö�� �Է�
		//3. ö�ڰ� �´��� üũ(�� ������ ����)
	
		do {
			displayWord(); //ȭ���� �ܾ�ǥ��
			getUserInput(); //�Է¹���
			checkUserInput(); // �´��� üũ �� ������ running = false
		}while (running);
	}
		public void checkUserInput() 
		{
		 System.out.println("üũ");	
		}
		public void getUserInput() {
		System.out.println("�ܾ���߱�");	
		}
		public void displayWord() {
			//���� �ܾ� ���
				
		System.out.println(word.toString()); 
		
		
		
		
		}
		
	}
	
	


