package ex;

import java.util.Scanner;



public class Choice {
	Scanner scan = new Scanner(System.in);
	static Daram Daram = new Daram("다람쥐", 2, 15, 3);
	public void Daram() {
		System.out.println("");
		System.out.println("------------야생포켓몬 배틀 -------------");
		System.out.println("   1.포켓몬 배틀을 한다   2.도망간다    ");
		System.out.println("--------------------------------");
		System.out.print("번호 입력 :");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("------------------------------------전투장----------------------------------------");
			System.out.println("");
			System.out.println("-----<야생 포켓몬>-----");
			System.out.println("이름: " + Daram.Name);
			System.out.println("레벨: " + Daram.level);
			System.out.println("Hp: " + Daram.BattleHp + "/" + Daram.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("배틀 시작하겠습니다.");
			} else if (WildChoice == 2) {
			System.out.println("배틀에서 도망갔습니다.");
		}
	}
		
	}

