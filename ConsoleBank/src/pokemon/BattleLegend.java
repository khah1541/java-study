package pokemon;

import java.util.Scanner;

public class BattleLegend extends Thread {
	private String name;
	static Fire Fire = new Fire("��", "���̾�", 15, 40, 40);
	static Scanner Scan = new Scanner(System.in);
	boolean check = true;

	public BattleLegend(String name) {
		this.name = name;
	}

	public void run() {
		try {
			while (true) {
				Thread.sleep(7000);
				if (Choice.userPaili.BattleHp <= 0) {
					Choice.userPaili.BattleHp = 0;
					System.out.println("==========================================");
					System.out.println(PokemonMain.userName + "�� ���ϸ��� �׾����ϴ�.");
					System.out.println("���̾ �޾Ƴ����ϴ�.");
					System.out.println("==========================================");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("====================================================");
					System.out.println("\r\n" + " _____  _                  _____             _ \r\n"
							+ "|_   _|| |                |  ___|           | |\r\n"
							+ "  | |  | |__    ___       | |__   _ __    __| |\r\n"
							+ "  | |  | '_ \\  / _ \\      |  __| | '_ \\  / _` |\r\n"
							+ "  | |  | | | ||  __/      | |___ | | | || (_| |\r\n"
							+ "  \\_/  |_| |_| \\___|      \\____/ |_| |_| \\__,_|\r\n"
							+ "                                               \r\n"
							+ "                                               \r\n" + "");

					System.out.println("====================================================");
					System.out.println("");
					break;
				} else if (BattleLegend.Fire.BattleHp <= 0) {
					System.out.println("");
					break;
				} else {
					if (check) {
						if (BattleLegend.Fire.BattleHp <= 30) {
							BattleLegend.Fire.fireskill();
							System.out.println("");
							check = false;
						}
					}
					System.out.println("==========================================");
					System.out.println(BattleLegend.Fire.Name + "�� ������ �Ͽ����ϴ�.");
					System.out.println("���̾�  ȭ�����!!!");
					System.out.println("==========================================");
					System.out.println("");
					Choice.userPaili.BattleHp -= BattleLegend.Fire.Firelegend;
					System.out
							.println("------------------------------------������----------------------------------------");
					System.out.println("");
					System.out.println("-----<�߻� ���ϸ�>-----");
					System.out.println("�̸�: " + BattleLegend.Fire.Name);
					System.out.println("����: " + BattleLegend.Fire.Level);
					System.out.println("Hp: " + BattleLegend.Fire.BattleHp + "/" + BattleLegend.Fire.Hp);
					System.out.println("-------------------");
					System.out.println("");
					System.out.println(
							"---------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("                   -----<����� ���ϸ�>-----");
					System.out.println("                                                 �̸�: " + Choice.userPaili.Name);
					System.out
							.println("                                                 ����: " + Choice.userPaili.Level);
					System.out.println(
							"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
					System.out
							.println("                                                    EXP:" + Choice.userPaili.Exp);
					System.out.println(
							"--------------------------------------------------------------------------------");

				}

			}
		} catch (Exception e) {
		}
	}

}
