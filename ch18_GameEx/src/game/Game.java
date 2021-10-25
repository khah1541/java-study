package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.*;

public class Game {
	
	
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	public void run() {
		System.out.println("�＼�� ������������ �����մϴ�.");
		int wins = 0;
		
		for(int i=1 ; i<=3; i++) {
			System.out.println(i + "��° ������ �����մϴ�.");
		
			
			//������ ����
			System.out.println("����(0),����(1),��(2)�� ���ڷ� ���� : ");
			
			int num = scanner.nextInt();
		
			//for(GameObject ob : objects) {
			//System.out.println(ob.toString());
			//}
			
			// �������� �ϳ� ����
	//		int num = random.nextInt(objects.length);
	//		GameObject ob1 = objects[num];
	//		GameObject ob2 = objects[num];
			
			GameObject[] objects = GameObject.values();	// enum GameObject �� ������ �迭�� ����		
			GameObject ob1 = objects[num];
			GameObject ob2 = objects[random.nextInt(objects.length)];
			
			System.out.println("����� ������ : " + ob1);
			System.out.println("��ǻ�� ������ : " + ob2);
			int score = ob1.compare(ob2);
			wins = wins + score;
		}
		//System.out.println(ob1.compare(ob2));
		 System.out.println("��������� => ");
		if(wins > 0) {
			System.out.println("����� �¸�!");
		}else if(wins < 0) {
			System.out.println("����� �й�!");
		}else {
			System.out.println("�����ϴ�.");
		}
	}

}
