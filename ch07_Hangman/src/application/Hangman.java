package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true;
	private RandomWord word = new RandomWord();
	Scanner scanner = new Scanner(System.in);
	
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
		//�������� �� ���� �Է� �䱸
		// �Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ� RandomWord ��ü�� ����=>addGuess(����) �޼ҵ�
			
		System.out.print("�� ���� �Է� : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));
		
		
		
		}
		public void displayWord() {
			//���� �ܾ� ���
		System.out.println(word.toString()); 
		
		
		
		
		}
		
	}
	
	


