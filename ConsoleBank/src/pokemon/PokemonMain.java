//���� Ű���
// TODO �빮�� / �޼ҵ�� �ҹ��� Ŭ������ �빮�� ������ �ҹ���
package pokemon;

import java.util.Random;
import java.util.Scanner;

public class PokemonMain {
	static int bbagi = User.grayBbagi + User.blueBbagi;
	static User user = new User();
	static Scanner scan = new Scanner(System.in);
	static String userName;
	static int randomNumber;

	public static void main(String[] args) throws InterruptedException {

		System.out.println("\r\n" + " _____         _       ______         _  _  _ \r\n"
				+ "|  __ \\       | |      | ___ \\       (_)| |(_)\r\n"
				+ "| |  \\/  ___  | |      | |_/ /  __ _  _ | | _ \r\n"
				+ "| | __  / _ \\ | |      |  __/  / _` || || || |\r\n"
				+ "| |_\\ \\| (_) ||_|      | |    | (_| || || || |\r\n"
				+ " \\____/ \\___/ (_)      \\_|     \\__,_||_||_||_|\r\n"
				+ "                                              \r\n"
				+ "                                              \r\n" + "");
		System.out.println("");
		System.out.println("");
		System.out.print("����� ���� �Է����ּ���:");
		userName = scan.nextLine();
		System.out.println("");
		System.out.println("");
		// ���Ӽ���
		System.out.println("                               *���� ����*");
		System.out.println("============================================================================");
		System.out.print(userName + "�� �ȳ��ϼ���! ");
		System.out.println("���ϸ󼼰迡 ���Ű� ȯ���մϴ�!");
		System.out.println("�� ������ ������ ���ΰ��� �Ǿ� ���ϸ��� ������ ���ƴٴϸ�  ");
		System.out.println("�߻����ϸ� ��� ���ϸ� ��Ʋ�� �� �� �ֽ��ϴ�.");
		System.out.println("�� ������ Ŭ�����ϱ� ���ؼ���");
		System.out.println("ȸ����Ƽ,����Ƽ�� ü������ ���ƴٴϸ� �װ��� ����� �ο��� �̰� �� 2���� ������ ������ ���� �Ǵ� �����Դϴ�.");
		System.out.println("============================================================================");
		System.out.println("");
		System.out.println("������ �����Ͻðڽ��ϱ�?");
		System.out.println("�����Ͻ÷��� ����Ű�� �����ּ���.");
		System.out.print("");
		System.out.println("");
		String storystart = scan.nextLine();

		// ���ʸ���
		// �㳷 ������
		DayNight dayNight = new DayNight(true);
		dayNight.start();
		Narration TaechoNarration = new Narration();
		TaechoNarration.TaechovillageNarration();
		System.out.println("�� �ҳ��� �̸���  " + userName + " 10��!!");
		System.out.println(userName + "��(��) ��� ���ʸ������� 10�츸 �Ǹ� ���ϸ��� ���� �� �ִ�.");
		System.out.println("�׸��� ���ϸ� ������ ���ڻ�Կ��� �ʺ��ڿ� ���ϸ��� 1���� ���� �� �ִ�.");
		System.out.println("���� ���ϸ� Ʈ���̳ʰ� �Ǳ� ���� ������ ��������!");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(userName + ": ����!!! ");
		System.out.println(userName + ": !!!!");
		System.out.println(userName + ": !!!!");
		System.out.println(userName + ": !!!!");
		System.out.println(userName + ": ���ϸ� ���� ������ �ʹ� ������٤Ф� ");
		System.out.println(userName + ": �� ���ڻ�Բ� ������...");
		System.out.println("");
		System.out.println("");

		// ���ʸ������� ������ �� �ִ� ���
		while (true) {
			Choice TaechovillageChoice = new Choice();
			TaechovillageChoice.TaechovillageChoice();
			System.out.print("��ȣ �Է� :");
			int Taechochoice = scan.nextInt();
			switch (Taechochoice) {

			// ���� ����� ����â �����ֱ�
			case 1:
				System.out.println("���� ����� ����:");
				Choice startuserchoice = new Choice();
				startuserchoice.UserChoice();
				continue;

			// ���ڻ�Բ� ���ϸ���,���� �ޱ�
			case 2:
				if (User.userMedicine > 1) {
					System.out.println("���ڻ� : �̹� ���ϸ��� ������� � ������ �������Ŷ�~!");
					System.out.println("");
					continue;
				}
				System.out.println("");
				System.out.println("======================================================");
				System.out.println("���ڻ�� �����ҿ� �����ߴ�.");
				System.out.println(userName + ": �ڻ�� ���ϸ� �������Ծ��!");
				System.out.println("���ڻ� : ���̱�......! �ʹ� �ʰ� �Ա���");
				System.out.println("���ڻ� : ���ϸ��� ���̸��� �����ִܴ�.");
				System.out.println(userName + ":���̸� ���ƿ�!!! ���� ���� �����ϴ�  ���ϸ��̿���");
				System.out.println("======================================================");
				System.out.println("");
				
				// ���ڻ� �޴�
				Narration ObaksaNarration = new Narration();
				ObaksaNarration.ObaksaNarration();
				System.out.print("��ȣ�Է� : ");
				Choice Obaksamenu = new Choice();
				int Obaksachoice = scan.nextInt();

				// ���ڻ� ���ϸ� ���̽�
				if (Obaksachoice == 1) {
					Obaksamenu.Obaksapokemonchoice();
					Obaksamenu.Obaksagift();
					continue;
				}
				// �ǵ��ư���
				else if (Obaksachoice == 2) {
					continue;
				}

				// ���� �� �̵�, ���ϸ��� �������� �ʾ����� ���� �� �̵� �Ұ�.
			case 3:
				if (User.userMedicine > 1) {
					System.out.println("���� ������ �̵��մϴ�.");
					break;
				} else {
					System.out.println("");
					System.err.println("���ϸ��� ���� �ʾҽ��ϴ�.");
					System.err.println("���� ������ �̵��� �� �����ϴ�.");
					System.err.println("���ڻ�Բ� ���ư� ���ϸ��� ��� ������ ������ �� �ֽ��ϴ�");
					System.out.println("");
					System.out.println("");
					continue;
				}
			}
			break;
		}

		System.out.println("");
		System.out.println("");
		System.out.println("���ϸ� ������� ���� ������ ��������!");

		while (true) {
			System.out.println("���� ���Ͻðڽ��ϱ�?");
			System.out.println("[1��]�׷��̽�Ƽ   [2��]����Ƽ");
			System.out.print("��ȣ �Է�:");
			int citychoice = scan.nextInt();

			switch (citychoice) {

			// �׷��̽�Ƽ ����
			case 1:
				Narration grayNarration = new Narration();
				grayNarration.GraycityNarration();
				while (true) {

					// �׷��̽�Ƽ �޴�
					Choice Graycitymenu = new Choice();
					Graycitymenu.Graycitychoice();
					System.out.print("��ȣ �Է� :");
					int grayChoice = scan.nextInt();
					switch (grayChoice) {

					// �׷���ü���� ����
					case 1:
						if (User.grayBbagi == 0) {
							System.out.println("ü���������߽��ϴ�.");
							System.out.println("ü�������� ���ϸ� ü���� ���� ���̰� �ִ�.");
							// ���̽�Ŭ������ �� �� ����â �����ֱ�
							Choice graygym = new Choice();
							graygym.Woongchoice();
							continue;
						} else if (User.grayBbagi == 1) {
							System.err.println("�̹� �׷��̹����� ����ϼ̽��ϴ�");
							System.out.println("");
							continue;
						}
						// ���ϸ����� ����
					case 2:
					
						System.out.println("���ϸ��� �����߽��ϴ�.");
						System.out.println("");
						// ���ϸ��� �����̼�
						Narration center = new Narration();
						center.NurseNarration();
						System.out.print("��ȣ �Է� :");
						int nursechoice = scan.nextInt();

						// ���ϸ� ġ��
						if (nursechoice == 1) {
							Choice cure = new Choice();
							cure.Nursepokemoncure();
						}
						// ������ ���
						else if (nursechoice == 2) {
							Choice itemsell = new Choice();
							itemsell.Nurseitemsell();
						}
						// ������
						else if (nursechoice == 3) {
							continue;
						}
						continue;

					// ����� ����â ����
					case 3:		
						System.out.println(userName + "���¸� ���ڽ��ϴ�.");
						Choice userchoice = new Choice();
						userchoice.UserChoice();			
						continue;

					// �߻����ϸ� ���
					case 4:
						System.out.println("�߻����ϸ� ������ ����!");
						System.out.println("�߻����ϸ��� �����⸦ ��ٸ��� �ִ�.");
						System.out.println("");
						System.out.println("");
						Random graywildpokemon = new Random(); // �߻����ϸ� �������� ������ �ϱ�
						randomNumber = graywildpokemon.nextInt(2) + 1; // case �ѹ� 1���� �ֱ� ���� +1
						switch (randomNumber) {
						case 1:
							System.out.println("�߻����ϸ� ĳ���� ����!!!");
							System.out.println("��Ʋ �����ϰڽ��ϴ�.");
							// �߻����ϸ�� <1.��Ʋ�� �Ѵ�. 2.��������> ����
							Choice wildbattleketupi = new Choice();
							wildbattleketupi.WildchoiceKetupi();
							continue;
						case 2:
							System.out.println("�߻����ϸ�  �ս��� ����!!!");
							System.out.println("��Ʋ �����ϰڽ��ϴ�.");
							System.out.println("");
							// �߻����ϸ�� <1.��Ʋ�� �Ѵ�. 2.��������> ����
							Choice wildbattlelongston = new Choice();
							wildbattlelongston.WildchoiceLongston();
							continue;
						}
						// ���� �� �̵�
					case 5:;
						if (User.grayBbagi == 0) {
							System.err.println("������ ���� ���ϸ� ���� ������ �̵��� �� �����ϴ�.");
							continue;
						} else if (User.grayBbagi == 1) {
							break;
						}
					}
					break;
				}
				// ����Ƽ ����
			case 2:
				if (User.grayBbagi == 0) {
					System.err.println("�׷��� ������ ���� ����Ƽ�� �̵��� �� �ֽ��ϴ�.");
					System.out.println("");
					continue;
				} else if (User.grayBbagi == 1) {
					// ����Ƽ ����
					Narration BlueNarration = new Narration();
					BlueNarration.BluecityNarration();
					while (true) {
						// ����Ƽ �޴�
						Choice bluecitymenu = new Choice();
						bluecitymenu.Bluecitychoice();
						System.out.print("��ȣ �Է� :");
						int Bluechoice = scan.nextInt();
						switch (Bluechoice) {
						// ü���� ����
						case 1:
							if (User.blueBbagi == 0) {
								System.out.println("ü���������߽��ϴ�.");
								System.out.println("ü�������� ���ϸ� ü���� ���� �̽��� �ִ�.");
								// ���ü���� (1.��Ʋ�� �Ѵ�, 2.��������)
								Choice bluegym = new Choice();
								bluegym.EsuelChoice();
								continue;
							} else if (User.blueBbagi == 1) {
								System.err.println("�̹� �������� ����ϼ̽��ϴ�.");
								continue;
							}
							// ���ϸ��� ����
						case 2:
							System.out.println("���ϸ��� �����߽��ϴ�.");
							// ��ȣ�� ����
							Narration center = new Narration();
							center.NurseNarration();
							System.out.print("��ȣ �Է� :");
							int nursechoice = scan.nextInt();
							// ���ϸ� ġ���ϱ�
							if (nursechoice == 1) {
								Choice cure = new Choice();
								cure.Nursepokemoncure();
							} else if (nursechoice == 2) {
								// ������ ���
								Choice itemsell = new Choice();
								itemsell.Nurseitemsell();
							} else if (nursechoice == 3) {
								// ���ϸ� ���� ������
								continue;
							}
							continue;
						// ����� ���º���
						case 3:
							System.out.println(userName + "���¸� ���ڽ��ϴ�.");
							// ���� ���� â �����ֱ�
							Choice userchoice = new Choice();
							userchoice.UserChoice();
							continue;
						// �߻����ϸ� ���
						case 4:
							System.out.println("�߻����ϸ� ������ ����!");
							System.out.println("�߻����ϸ��� �����⸦ ��ٸ��� �ִ�.");
							System.out.println("");
							System.out.println("");
							// ����Ƽ ���� �߻����ϸ� ���� ����
							Random bluewildpokemon = new Random();
							randomNumber = bluewildpokemon.nextInt(2) + 1;
							switch (randomNumber) {
							case 1:
								System.out.println("�߻����ϸ� ĳ���� ����!!!");
								Choice wildbattleketupi = new Choice();
								wildbattleketupi.WildchoiceKetupi();
								continue;
							case 2:
								System.out.println("�߻����ϸ�  ����Ÿ ����!!!");
								Choice wildbattleaqustar = new Choice();
								wildbattleaqustar.WildchoiceAqustar();
								continue;
						 	}
							System.out.println("");
							break;
						// ����
						case 5:;
							if (User.blueBbagi == 0) {
								System.err.println("������ ������ ���� ���ϸ� ������ �� �� �����ϴ�.");
								continue;
							} else if (User.blueBbagi == 1) {
								// �㳷 ������ ����
								dayNight.close();
								System.out.println("������ ���� �Ǿ����ϴ�.");
								System.out.println("");
								System.out.println("2���� ������ ��� ���� " + userName + "���� �� ������ Ŭ�����ϼ̽��ϴ�.");
								System.out.println("���ϵ帳�ϴ�!!!");
								System.out.println("");
								System.out.println("\r\n"
										+ "                                                                                                                    \r\n"
										+ "    ,o888888o.    8 8888         8 8888888888            .8.          8 888888888o.                                 \r\n"
										+ "   8888     `88.  8 8888         8 8888                 .888.         8 8888    `88.                                \r\n"
										+ ",8 8888       `8. 8 8888         8 8888                :88888.        8 8888     `88                                \r\n"
										+ "88 8888           8 8888         8 8888               . `88888.       8 8888     ,88                                \r\n"
										+ "88 8888           8 8888         8 888888888888      .8. `88888.      8 8888.   ,88'                                \r\n"
										+ "88 8888           8 8888         8 8888             .8`8. `88888.     8 888888888P'                                 \r\n"
										+ "88 8888           8 8888         8 8888            .8' `8. `88888.    8 8888`8b                                     \r\n"
										+ "`8 8888       .8' 8 8888         8 8888           .8'   `8. `88888.   8 8888 `8b.                                   \r\n"
										+ "   8888     ,88'  8 8888         8 8888          .888888888. `88888.  8 8888   `8b.                                 \r\n"
										+ "    `8888888P'    8 888888888888 8 888888888888 .8'       `8. `88888. 8 8888     `88.                               \r\n"
										+ "");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");
								System.out.println("");

								System.out.println("\r\n"
										+ " _____                     _         _     _____                      _   \r\n"
										+ "/  ___|                   (_)       | |   |  ___|                    | |  \r\n"
										+ "\\ `--.  _ __    ___   ___  _   __ _ | |   | |__  __   __  ___  _ __  | |_ \r\n"
										+ " `--. \\| '_ \\  / _ \\ / __|| | / _` || |   |  __| \\ \\ / / / _ \\| '_ \\ | __|\r\n"
										+ "/\\__/ /| |_) ||  __/| (__ | || (_| || |   | |___  \\ V / |  __/| | | || |_ \r\n"
										+ "\\____/ | .__/  \\___| \\___||_| \\__,_||_|   \\____/   \\_/   \\___||_| |_| \\__|\r\n"
										+ "       | |                                                                \r\n"
										+ "       |_|                                                                \r\n"
										+ "");
								System.out.println("");
								System.out.println("���� 2���� �������  ������ ���ϸ��� ���� ��  �ִ� ��ȸ��  ������ϴ�.");
								System.out.println("������ ���ϸ�� ��Ʋ�� �� �� �ֽ��ϴ�.");
								System.out.println("\r\n" + "\r\n" +

										"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:,,-\r\n"
										+ "@@@@@@@@@@@@@@@@@~~@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@--..-\r\n"
										+ "@@@@@@@@@@@@@@@@;.~~@-,.-@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~,  .=\r\n"
										+ "@@@@@@@@@@@@@@@@~ .-.   .-@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-. ,,!\r\n"
										+ "@@@@@@@@@@@@@@@@;.       -@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-,,. ., :\r\n"
										+ "@@@@@~@@@@@@@@@@@.       ,-@---@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.   .- ,!\r\n"
										+ "@@@@@---~@@@@--@@@,       -@,.~ --@@@@@@@@@@@@@@@@@@@@@@@@@ @. .-  -=@\r\n"
										+ "@@@@@,  -~#@*,,~@@~,      ,:. ,. .@@@@@@~,~@@@@@@@@@@@@@@@@-- .- .:*@@\r\n"
										+ "@@@@@,. ..~:;,..-, .     .~-      ,@@@@@- ..~@@@@@@@@@@@@-... ~.,;@@@@\r\n"
										+ "--,-@--.  ,..~.           ..      , @@@@-.  ~-,~@@@@@@@@@,   . .!@@@@@\r\n"
										+ "-. .. ... .-  -.                 .@@@@@@@.  .. .;~@@@@,--.   , ;@@@@@@\r\n"
										+ "@,-.       :.  .~          .     .: @@@@-       .,@@@@,..   , .*@@@@@@\r\n"
										+ "@@@-.        ,.  .,.              ..,@@@-        ,-@~,    .-, ;@@@@@@@\r\n"
										+ "@@@~..,      ,~-   .,,.             ,@@@@,,      -~~-.   -:,,:#@@@@@@@\r\n"
										+ "@@@@@@~-.     ..-,    .,,...       .--;@@@,      .,~....~--~=@@@@@@@@@\r\n"
										+ "@@@@@@@@~-~,     ., .,.   .-        .-@@@@,,..    .,...--!#@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@-      .,-,,    ,~        ,@@@@@-,-.   ...-~:=@@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@-,..       ,,,  ..-,,,   .-@@@@@@:.     ...,~@@@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@,..       ,,~~  ,~-   ,@=!;!#@@.     ..  .,@@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@-~:,      .~~~    ,,..-~.   ,~**,         .@@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@:. .-..   .;~!.   ,--~,    -~,--.      -@@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@;~;-.. ..   ,,--     .~    ,~~~-     .,;@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@--,,:~,.    --,,   .,,,  .-!~..,    -@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@~@@@@~...,,,.-:,   ..        ..   ,@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!;@*--,,,,,.     .     .-...-@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@$*#=*:---,,,,,,..:**-  .- --=@@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@#*~:;=*;;;:--,,,-:!@@$;..,=-~=@@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@$:~!$@@@@@#=!!;!$@@@@@#~,.:-,:@@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@;;:=@@@@@@$=$=#@@@@@@@@@!~:;-,;@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@*;;*$@@@@@@=$*=@@@@@@@@@@@@@#*:-!@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@$=!*#@@@@@@@==@@@@@@@@@@@@@@@@=*-;@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@$=#@@@@@@@@@@@@@@@@@@@@@@@@@@@@*;!@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
										+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +

										"");
								System.out.println("�����Ͻðڽ��ϱ�? ");
								System.out.println("[1��] ��       [2��] �ƴϿ�");
								System.out.print("��ȣ �Է� :");
								int LegendChallenge = scan.nextInt();
								if (LegendChallenge == 1) {
									// ���� ���ϸ� ����
									GroupBattle pokemon1 = new GroupBattle(Choice.userPaili.Name);
									// ������ ���ϸ� ����
									BattleLegend pokemon2 = new BattleLegend(BattleLegend.Fire.Name);
									// ����(�������ִ� ���) ����
									Cheer usercheer = new Cheer();

									// ������ ����ϴ� ���ϸ�� �������ϸ��� �켱������ ���� �־���.
									// ������ �켱������ ���� �־� ���� �ൿ�� �� �ְ� �������.
									pokemon1.setPriority(Thread.MIN_PRIORITY);
									pokemon2.setPriority(Thread.MIN_PRIORITY);
									usercheer.setPriority(Thread.MAX_PRIORITY);

									// ������ ����
									usercheer.start();
									pokemon1.start(); // ���� ���ϸ� ����
									Thread.sleep(5000);
									pokemon2.start(); // ������ ���ϸ� ����

								}
								// ������ ���ϸ� ���� ���ϱ�
								else if (LegendChallenge == 2) {
									System.out.println("�ƴϿ�. �̸� ������ �����ϰڽ��ϴ�.");
									System.out.println("");
									System.out.println("");
									System.out.println();
									System.out.println("\r\n" + " _____  _                  _____             _ \r\n"
											+ "|_   _|| |                |  ___|           | |\r\n"
											+ "  | |  | |__    ___       | |__   _ __    __| |\r\n"
											+ "  | |  | '_ \\  / _ \\      |  __| | '_ \\  / _` |\r\n"
											+ "  | |  | | | ||  __/      | |___ | | | || (_| |\r\n"
											+ "  \\_/  |_| |_| \\___|      \\____/ |_| |_| \\__,_|\r\n"
											+ "                                               \r\n"
											+ "                                               \r\n" + "");

								}

								break;
							}
							break;
						}
						break;
					}
					break;
				}
				break;
			}
			break;
		}

	}
}
