package pokemon;

public class GroupBattle extends Thread {
	private String name;

	public GroupBattle(String name) {
		this.name = name;
	}

	public void run() {
		try {
			if (BattleLegend.Fire.BattleHp <= 30) {
				BattleLegend.Fire.fireskill();
				System.out.println();
			}
			while (true) {
				Thread.sleep(7000);
				if (BattleLegend.Fire.BattleHp <= 0) {

					BattleLegend.Fire.BattleHp = 0;
					System.out.println("==========================");
					System.out.println("���̾���� ���ϸ� ��ῡ�� �̰���ϴ�.");
					System.out.println("�����մϴ�!");
					System.out.println("==========================");
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
					break;
				} else if (Choice.userPaili.BattleHp <= 0) {
					System.out.println("");
					break;
				} else {

					System.out.println("=====================================================================");
					System.out.println(PokemonMain.userName + "�� ���ϸ� " + Choice.userPaili.Name + "�� ������ �Ͽ����ϴ�.");
					System.out.println("���ڸ� �Ҳɼ���!!!");
					System.out.println("=====================================================================");
					System.out.println("");
					BattleLegend.Fire.BattleHp -= Choice.userPaili.Fireattack;
					if (BattleLegend.Fire.BattleHp <= 0) {
						BattleLegend.Fire.BattleHp = 0;
					}
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
							"---------------------------------------------------------------------------------");
					if (BattleLegend.Fire.BattleHp <= 0) {
						BattleLegend.Fire.BattleHp = 0;

					}
				}
			}
		} catch (Exception e) {
		}
	}
}
