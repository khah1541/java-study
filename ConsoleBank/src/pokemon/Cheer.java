package pokemon;

import java.util.Scanner;

public class Cheer extends Thread {
	int i = 0;

	public void run() {
		try {
			Scanner Scan = new Scanner(System.in);
			while (true) {
				Thread.sleep(6000);
				if (BattleLegend.Fire.BattleHp <= 0) {
					BattleLegend.Fire.BattleHp = 0;
					break;
				} else if (Choice.userPaili.BattleHp <= 0) {
					Choice.userPaili.BattleHp = 0;
					break;
				} else {
					System.out.println("====================================================");
					System.out.println("������ ���ϸ󿡰� �̱� �� �ְ� �����غ�����");
					System.out.println("��Ʋ �߿� �ڽ��� ���ϸ��� �����ϰ� ���� �� ����'1234'�� �Է����ּ���!!! ");
					System.out.println("���ݷ� ������ Hp ��ü ȸ���� �˴ϴ�.");
					System.out.println("=====================================================");
					System.out.println("");
					System.out.println("");
					int cheer = Scan.nextInt();	//��Ʈ�� �ް���� ���� nextLine
					if (cheer == 1234) { 		//��Ʈ���ް� ���� �� .equal() ��� 
						System.err.println("==================================");
						System.err.println("���ݷ� +10, ��ü HPȸ�� �ϼ̽��ϴ�.");
						System.err.println("==================================");
						System.err.println("");
						Choice.userPaili.Fireattack += 10;
						Choice.userPaili.BattleHp = 60;
						continue;
					} else {
						System.err.println("========================================");
						System.err.println("�߸��Է��ϼ̽��ϴ�. ���������� ������� ���Ͽ����ϴ�.");
						System.err.println("=========================================");
						System.err.println("");
						continue;
					}
				}
			}
		} catch (Exception e) {
		}
	}
}
