package ex;

import java.util.Scanner;



public class Choice {
	Scanner scan = new Scanner(System.in);
	static Daram Daram = new Daram("�ٶ���", 2, 15, 3);
	public void Daram() {
		System.out.println("");
		System.out.println("------------�߻����ϸ� ��Ʋ -------------");
		System.out.println("   1.���ϸ� ��Ʋ�� �Ѵ�   2.��������    ");
		System.out.println("--------------------------------");
		System.out.print("��ȣ �Է� :");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("------------------------------------������----------------------------------------");
			System.out.println("");
			System.out.println("-----<�߻� ���ϸ�>-----");
			System.out.println("�̸�: " + Daram.Name);
			System.out.println("����: " + Daram.level);
			System.out.println("Hp: " + Daram.BattleHp + "/" + Daram.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("��Ʋ �����ϰڽ��ϴ�.");
			} else if (WildChoice == 2) {
			System.out.println("��Ʋ���� ���������ϴ�.");
		}
	}
		
	}

