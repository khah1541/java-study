package pokemon;

import java.util.Scanner;

public class Battle {
	Scanner scan = new Scanner(System.in);
	Longston GraygymLongston = new Longston("�ϼ�", "�ս���", 8, 40, 40);
	Longston WildLongston = new Longston("�ϼ�", "�ս���", 5, 20, 20);
	Aqustar BluegymAqustar = new Aqustar("��", "����Ÿ", 8, 40, 40);
	Aqustar WildAqustar = new Aqustar("��", "����Ÿ", 5, 20, 20);
	Ketupi WildKetupi = new Ketupi("Ǯ", "ĳ����", 3, 15, 15);
	
	
	public void GrayGym() {
		while (true) {
			System.out.println("[1��] �����Ѵ�            [2��] ��ó�� ���            [3��] �������� ");
			System.out.print("��ȣ �Է� :");
			int GraybattleFunction = scan.nextInt();
			if (GraybattleFunction == 1) {
				if (GraygymLongston.BattleHp <= 0) {
					GraygymLongston.BattleHp = 0;
					System.out.println(GraygymLongston.Name + "��(��) �׾����ϴ�.\n");
					System.out.println("����ġ�� 100�ö����ϴ�.");
					Choice.userPaili.Exp += 100;
					Choice.userPaili.Exp();
					System.out.println("ü���� ���忡�� �̰���ϴ�.");
					System.out.println("ü���� ���� ���̿��� ü���� ������ 2000���� �޾ҽ��ϴ�.");
					System.out.println("");
					User.userMoney += 2000;
					User.grayBbagi += 1;
					break;
				} else {
					System.out.println("����ڰ� ������ �Ͽ����ϴ�.");
					System.out.println("���̸� �� �ձ�!!!");
					System.out.println("");
					GraygymLongston.BattleHp -= Choice.userPaili.Fireattack;
					if (GraygymLongston.BattleHp <= 0) {
						GraygymLongston.BattleHp = 0;
					}
					System.out
							.println("------------------------------------������----------------------------------------");
					System.out.println("");
					System.out.println("-----<���� ���ϸ�>-----");
					System.out.println("�̸�: " + GraygymLongston.Name);
					System.out.println("����: " + GraygymLongston.Level);
					System.out.println("Hp: " + GraygymLongston.BattleHp + "/" + GraygymLongston.Hp);
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
					if (GraygymLongston.BattleHp<=0) {
						GraygymLongston.BattleHp = 0;
						System.out.println("--------------------------------------------------");
						System.out.println(GraygymLongston.Name + "��(��) �׾����ϴ�.\n");
						System.out.println("����ġ�� 100�ö����ϴ�.");
						Choice.userPaili.Exp += 100;
						Choice.userPaili.Exp();
						System.out.println("ü���� ���忡�� �̰���ϴ�.");
						System.out.println("ü���� ���� ���̿��� ü���� ������ 2000���� �޾ҽ��ϴ�.");
						System.out.println("--------------------------------------------------");
						System.out.println("");
						System.out.println("");
						User.userMoney += 2000;
						User.grayBbagi += 1;
						break;
					}
					System.out.println("�ս����� �ݰ��� �Ͽ����ϴ�.");
					System.out.println("�ս��� ��������!!!");
					System.out.println("");
					Choice.userPaili.BattleHp -= GraygymLongston.RockAttack;
					System.out
							.println("------------------------------------������----------------------------------------");
					System.out.println("");
					System.out.println("-----<���� ���ϸ�>-----");
					System.out.println("�̸�: " + GraygymLongston.Name);
					System.out.println("����: " + GraygymLongston.Level);
					System.out.println("Hp: " + GraygymLongston.BattleHp + "/" + GraygymLongston.Hp);
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
					System.out.println("                                            EXP:" + Choice.userPaili.Exp);
					System.out.println(
							"--------------------------------------------------------------------------------");
				}
			}
			if (GraybattleFunction == 2) {
				if (Choice.userPaili.BattleHp > 0) {
					if (User.userMedicine == 0) {
						System.out.println("��ó���� ����� �� �����ϴ�.");
						System.out.println("�����ϰ� �ִ� ��ó���� ��� ����ϼ̽��ϴ�");
						System.out.println("");
						continue;
					} else {
						System.out.println("��ó���� ����ϼ̽��ϴ�.");
						User.userMedicine--;
						Choice.userPaili.BattleHp += 10;
						if (Choice.userPaili.BattleHp > 40) {
							Choice.userPaili.BattleHp = 40;
						}
						System.out.println(
								"------------------------------------������----------------------------------------");
						System.out.println("");
						System.out.println("-----<���� ���ϸ�>-----");
						System.out.println("�̸�: " + GraygymLongston.Name);
						System.out.println("����: " + GraygymLongston.Level);
						System.out.println("Hp: " + GraygymLongston.BattleHp + "/" + GraygymLongston.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<����� ���ϸ�>-----");
						System.out.println(
								"                                                 �̸�: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 ����: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println("                                              EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"---------------------------------------------------------------------------------");
					}
				}
			} else if (GraybattleFunction == 3) {
				System.out.println("���� : �ƽ���....������ �ٽ� �����غ�����");
				System.out.println("");
				break;
			}
		}
	}

	public void BlueGym() {
		while (true) {
			System.out.println("[1��] �����Ѵ�            [2��] ��ó�� ���            [3��] �������� ");
			System.out.print("��ȣ �Է� :");
			int BluebattleFunction = scan.nextInt();
			if (BluebattleFunction == 1) {
				if (BluegymAqustar.BattleHp <= 0) {
					BluegymAqustar.BattleHp = 0;
					System.out.println("--------------------------------------------------");
					System.out.println(BluegymAqustar.Name + "��(��) �׾����ϴ�.\n");
					System.out.println("����ġ�� 100�ö����ϴ�.");
					Choice.userPaili.Exp += 100;
					Choice.userPaili.Exp();
					System.out.println("ü���� ���忡�� �̰���ϴ�.");
					System.out.println("ü���� ���� �̽��̰� ü���� ������ 2000���� �־����ϴ�.");
					User.userMoney += 2000;
					User.blueBbagi += 1;
					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println("");
					break;
				} else {
					System.out.println("����ڰ� ������ �Ͽ����ϴ�.");
					System.out.println("���̸� �� �ձ�!!!");
					System.out.println("");
					BluegymAqustar.BattleHp -= Choice.userPaili.Fireattack;
					if (BluegymAqustar.BattleHp <= 0) {
						BluegymAqustar.BattleHp = 0;
					}
						System.out.println(
								"------------------------------------������----------------------------------------");
						System.out.println("");
						System.out.println("-----<�̽� ���ϸ�>-----");
						System.out.println("�̸�: " + BluegymAqustar.Name);
						System.out.println("����: " + BluegymAqustar.Level);
						System.out.println("Hp: " + BluegymAqustar.BattleHp + "/" + BluegymAqustar.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<����� ���ϸ�>-----");
						System.out.println(
								"                                                 �̸�: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 ����: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println(
								"                                                    EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"---------------------------------------------------------------------------------");
						if (BluegymAqustar.BattleHp <= 0) {
							BluegymAqustar.BattleHp = 0;
							System.out.println("--------------------------------------------------");
							System.out.println(BluegymAqustar.Name + "��(��) �׾����ϴ�.\n");
							System.out.println("����ġ�� 100�ö����ϴ�.");
							Choice.userPaili.Exp += 100;
							Choice.userPaili.Exp();
							System.out.println("ü���� ���忡�� �̰���ϴ�.");
							System.out.println("ü���� ���� �̽��̰� ü���� ������ 2000���� �־����ϴ�.");
							System.out.println("--------------------------------------------------");
							User.userMoney += 2000;
							User.blueBbagi += 1;
							System.out.println("");
							System.out.println("");
							break;
						}
						System.out.println("����Ÿ�� �ݰ��� �Ͽ����ϴ�.");
						System.out.println("����Ÿ ������!!!");
						System.out.println("");
						Choice.userPaili.BattleHp -= BluegymAqustar.WaterAttack;
						System.out.println(
								"------------------------------------������----------------------------------------");
						System.out.println("");
						System.out.println("-----<�̽� ���ϸ�>-----");
						System.out.println("�̸�: " + BluegymAqustar.Name);
						System.out.println("����: " + BluegymAqustar.Level);
						System.out.println("Hp: " + BluegymAqustar.BattleHp + "/" + BluegymAqustar.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<����� ���ϸ�>-----");
						System.out.println(
								"                                                 �̸�: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 ����: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println(
								"                                                    EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"--------------------------------------------------------------------------------");
					}
				}
			
	
			if (BluebattleFunction == 2) {
				if (Choice.userPaili.BattleHp > 0) {
					if (User.userMedicine == 0) {
						System.out.println("��ó���� ����� �� �����ϴ�.");
						continue;
					} else {
						System.out.println("��ó���� ����ϼ̽��ϴ�.");
						User.userMedicine--;
						Choice.userPaili.BattleHp += 10;
						if (Choice.userPaili.BattleHp > 40) {
							Choice.userPaili.BattleHp = 40;
						}
						System.out.println(
								"------------------------------------������----------------------------------------");
						System.out.println("");
						System.out.println("-----<�̽� ���ϸ�>-----");
						System.out.println("�̸�: " + BluegymAqustar.Name);
						System.out.println("����: " + BluegymAqustar.Level);
						System.out.println("Hp: " + BluegymAqustar.BattleHp + "/" + BluegymAqustar.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<����� ���ϸ�>-----");
						System.out.println(
								"                                                 �̸�: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 ����: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out
								.println("                                               EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"---------------------------------------------------------------------------------");
					}
				}
			} else if (BluebattleFunction == 3) {
				System.out.println("�̽� : �ƽ���....������ �ٽ� �����غ�");
				System.out.println("");
				break;
			}
		}
	}

	public void WildbattleKetupi() {
		while (true) {
			System.out.println("[1��] �����Ѵ�            [2��] ��ó�� ���            [3��] ���ͺ� ���           [4��] �������� ");
			System.out.print("��ȣ �Է� :");
			int wildketupibattlefunction = scan.nextInt();
			if (wildketupibattlefunction == 1) {
				if (WildKetupi.BattleHp <= 0) {
					WildKetupi.BattleHp = 0;
					System.out.println("--------------------------------------------------");
					System.out.println(WildKetupi.Name + "��(��) �׾����ϴ�.\n");
					System.out.println("�߻� ���ϸ��� �����ƽ��ϴ�.");
					System.out.println("����ġ�� 20�ö����ϴ�.");
					Choice.userPaili.Exp += 20;
					Choice.userPaili.Exp();
					System.out.println("��������� 300���� �־����ϴ�.");
					User.userMoney += 300;
					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println("");
					break;
				} else {
					System.out.println("����ڰ� ������ �Ͽ����ϴ�.");
					System.out.println("���̸� �� �ձ�!!!");
					WildKetupi.BattleHp -= Choice.userPaili.Fireattack;
					if (WildKetupi.BattleHp <= 0) {
						WildKetupi.BattleHp = 0;
					}
					System.out
							.println("------------------------------------������----------------------------------------");
					System.out.println("");
					System.out.println("-----<�߻� ���ϸ�>-----");
					System.out.println("�̸�: " + WildKetupi.Name);
					System.out.println("����: " + WildKetupi.Level);
					System.out.println("Hp: " + WildKetupi.BattleHp + "/" + WildKetupi.Hp);
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
					if (WildKetupi.BattleHp <= 0) {
						WildKetupi.BattleHp = 0;
						System.out.println("--------------------------------------------------");
						System.out.println(WildKetupi.Name + "��(��) �׾����ϴ�.\n");
						System.out.println("�߻� ���ϸ��� �����ƽ��ϴ�.");
						System.out.println("����ġ�� 20�ö����ϴ�.");
						Choice.userPaili.Exp += 20;
						Choice.userPaili.Exp();
						System.out.println("��������� 300���� �־����ϴ�.");
						User.userMoney += 300;
						System.out.println("--------------------------------------------------");
						System.out.println("");
						System.out.println("");
						break;
					}
					System.out.println("ĳ���ǰ� �ݰ��� �Ͽ����ϴ�.");
					System.out.println("ĳ���� �����ٳ�����!!!");
					System.out.println("");
					Choice.userPaili.BattleHp -= WildKetupi.LeafAttack;
					System.out
							.println("------------------------------------������----------------------------------------");
					System.out.println("");
					System.out.println("-----<�߻� ���ϸ�>-----");
					System.out.println("�̸�: " + WildKetupi.Name);
					System.out.println("����: " + WildKetupi.Level);
					System.out.println("Hp: " + WildKetupi.BattleHp + "/" + WildKetupi.Hp);
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
					System.out.println("                                               EXP:" + Choice.userPaili.Exp);
					System.out.println(
							"--------------------------------------------------------------------------------");
				}
			}
			if (wildketupibattlefunction == 2) {
				if (Choice.userPaili.BattleHp > 0) {
					if (User.userMedicine == 0) {
						System.out.println("��ó���� ����� �� �����ϴ�.");
						continue;
					} else {
						System.out.println("��ó���� ����ϼ̽��ϴ�.");
						User.userMedicine--;
						Choice.userPaili.BattleHp += 10;
						if (Choice.userPaili.BattleHp > 40) {
							Choice.userPaili.BattleHp = 40;
						}
						System.out.println(
								"------------------------------------������----------------------------------------");
						System.out.println("");
						System.out.println("-----<�߻� ���ϸ�>-----");
						System.out.println("�̸�: " + WildKetupi.Name);
						System.out.println("����: " + WildKetupi.Level);
						System.out.println("Hp: " + WildKetupi.BattleHp + "/" + WildKetupi.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<����� ���ϸ�>-----");
						System.out.println(
								"                                                 �̸�: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 ����: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println("                                              EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"---------------------------------------------------------------------------------");
					}
				}
			}
			if (wildketupibattlefunction == 3) {
				if (WildKetupi.BattleHp > 0) {
					if (User.userBall == 0) {
						System.out.println("���ͺ��� ����Ͻ� �� �����ϴ�.");
						System.out.println("");
						continue;
					} else {
						if (WildKetupi.BattleHp > 8) {
							System.out.println("���ͺ��� ����ϼ̽��ϴ�.");
							User.userBall--;
							System.out.println("----------------------------------------");
							System.out.println("���� �� ���� ���� :  " + User.userBall);
							System.out.println("----------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("�߻� ���ϸ��� ���� ������ ���Խ��ϴ�");
							System.out.println("���� ü���� ������ �����ϴ�.");
							System.out.println("");
							continue;
						} else {
							System.out.println("���ͺ��� ����ϼ̽��ϴ�.");
							User.userBall--;
							System.out.println("----------------------------------------");
							System.out.println("���� �� ���� ���� :  " + User.userBall);
							System.out.println("----------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("�߻����ϸ��� �����̽��ϴ�! ���ϵ帳�ϴ�.");
							System.out.println("");
							System.out.println("");
							User.pokemonlist.add(WildKetupi.Name);
							break;
						}
					}
				}
			}
			if (wildketupibattlefunction == 4) {
				System.out.println("�߻����ϸ󿡰Լ� �����ƽ��ϴ�.");
				System.out.println("");
				break;
			}
		}
	}

	public void WildbattleLongston() {
		System.out.println("��Ʋ �����ϰڽ��ϴ�.");
		while (true) {
			System.out.println("[1��] �����Ѵ�            [2��] ��ó�� ���            [3��] ���ͺ� ���           [4��] ��������");
			System.out.print("��ȣ �Է� :");
			int WildlongstonBattleFunction = scan.nextInt();
			if (WildlongstonBattleFunction == 1) {
				if (WildLongston.BattleHp <= 0) {
					WildLongston.BattleHp = 0;
					System.out.println("--------------------------------------------------");
					System.out.println(WildLongston.Name + "��(��) �׾����ϴ�.\n");
					System.out.println("�߻� ���ϸ��� �����ƽ��ϴ�.");
					System.out.println("����ġ�� 20�ö����ϴ�.");
					Choice.userPaili.Exp += 20;
					Choice.userPaili.Exp();
					System.out.println("��������� 300���� �־����ϴ�.");
					User.userMoney += 300;
					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println("");
					break;
				} else {
					System.out.println("����ڰ� ������ �Ͽ����ϴ�.");
					System.out.println("���̸� �� �ձ�!!!");
					System.out.println("");
					WildLongston.BattleHp -= Choice.userPaili.Fireattack;
					if (WildLongston.BattleHp <= 0) {
						WildLongston.BattleHp = 0;
					}
					System.out
							.println("------------------------------------������----------------------------------------");
					System.out.println("");
					System.out.println("-----<�߻� ���ϸ�>-----");
					System.out.println("�̸�: " + WildLongston.Name);
					System.out.println("����: " + WildLongston.Level);
					System.out.println("Hp: " + WildLongston.BattleHp + "/" + WildLongston.Hp);
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
					if (WildLongston.BattleHp <= 0) {
						WildLongston.BattleHp = 0;
						System.out.println("--------------------------------------------------");
						System.out.println(WildLongston.Name + "��(��) �׾����ϴ�.\n");
						System.out.println("�߻� ���ϸ��� �����ƽ��ϴ�.");
						System.out.println("����ġ�� 20�ö����ϴ�.");
						Choice.userPaili.Exp += 20;
						Choice.userPaili.Exp();
						System.out.println("��������� 300���� �־����ϴ�.");
						User.userMoney += 300;
						System.out.println("--------------------------------------------------");
						System.out.println("");
						System.out.println("");
						break;
					} 
					System.out.println(WildLongston.Name + "�� �ݰ��� �Ͽ����ϴ�.");
					System.out.println("�ս��� �� ������!!!");
					System.out.println("");
					Choice.userPaili.BattleHp -= WildLongston.RockAttack;
					System.out
							.println("------------------------------------������----------------------------------------");
					System.out.println("");
					System.out.println("-----<�߻� ���ϸ�>-----");
					System.out.println("�̸�: " + WildLongston.Name);
					System.out.println("����: " + WildLongston.Level);
					System.out.println("Hp: " + WildLongston.BattleHp + "/" + WildLongston.Hp);
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
			if (WildlongstonBattleFunction == 2) {
				if (Choice.userPaili.BattleHp > 0) {
					if (User.userMedicine == 0) {
						System.out.println("��ó���� ����� �� �����ϴ�.");
						continue;
					} else {
						System.out.println("��ó���� ����ϼ̽��ϴ�.");
						User.userMedicine--;
						Choice.userPaili.BattleHp += 10;
						if (Choice.userPaili.BattleHp > 40) {
							Choice.userPaili.BattleHp = 40;
						}
						System.out.println(
								"------------------------------------������----------------------------------------");
						System.out.println("");
						System.out.println("-----<�߻� ���ϸ�>-----");
						System.out.println("�̸�: " + WildLongston.Name);
						System.out.println("����: " + WildLongston.Level);
						System.out.println("Hp: " + WildLongston.BattleHp + "/" + WildLongston.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<����� ���ϸ�>-----");
						System.out.println(
								"                                                 �̸�: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 ����: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println("                                              EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"--------------------------------------------------------------------------------");
					}
				}
			}
			if (WildlongstonBattleFunction == 3) {
				if (WildLongston.BattleHp > 0) {
					if (User.userBall == 0) {
						System.err.println("���ͺ��� ����Ͻ� �� �����ϴ�.");
						System.out.println("");
						continue;
					} else {
						if (WildLongston.BattleHp > 10) {
							System.out.println("���ͺ��� ����ϼ̽��ϴ�.");
							User.userBall--;
							System.out.println("--------------------------------------");
							System.out.println("���� �� ���� ���� :  " + User.userBall);
							System.out.println("--------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("�߻� ���ϸ��� ���� ������ ���Խ��ϴ�");
							System.out.println("���� ü���� ������ �����ϴ�.");
							System.out.println("");
							continue;
						} else {
							System.out.println("���ͺ��� ����ϼ̽��ϴ�.");
							User.userBall--;
							System.out.println("--------------------------------------");
							System.out.println("���� �� ���� ���� :  " + User.userBall);
							System.out.println("--------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("�߻����ϸ��� �����̽��ϴ�! ���ϵ帳�ϴ�.");
							System.out.println("");
							System.out.println("");
							User.pokemonlist.add(WildLongston.Name);
							break;
						}
					}
				}
			}
			if (WildlongstonBattleFunction == 4) {
				System.out.println("�߻����ϸ󿡰Լ� �����ƽ��ϴ�.");
				System.out.println("");
				break;
			}
		}
	}

	public void WildbattleAqustar() {
		System.out.println("��Ʋ �����ϰڽ��ϴ�.");
		while (true) {
			System.out.println("[1��] �����Ѵ�            [2��] ��ó�� ���            [3��] ���ͺ� ���           [4��] �������� ");
			System.out.print("��ȣ �Է� :");
			int WildaqustarBattleFunction = scan.nextInt();
			if (WildaqustarBattleFunction == 1) {
				if (WildAqustar.BattleHp <= 0) {
					WildAqustar.BattleHp = 0;
					System.out.println("--------------------------------------------------");
					System.out.println(WildAqustar.Name + "��(��) �׾����ϴ�.\n");
					System.out.println("�߻� ���ϸ��� �����ƽ��ϴ�.");
					System.out.println("����ġ�� 20�ö����ϴ�.");
					Choice.userPaili.Exp += 20;
					Choice.userPaili.Exp();
					System.out.println("��������� 300���� �־����ϴ�.");
					User.userMoney += 300;
					System.out.println("--------------------------------------------------");
					break;
				} else {
					System.out.println("����ڰ� ������ �Ͽ����ϴ�.");
					System.out.println("���̸� �� �ձ�!!!");
					System.out.println("");
					WildAqustar.BattleHp -= Choice.userPaili.Fireattack;
					if (WildAqustar.BattleHp <= 0) {
						WildAqustar.BattleHp = 0;
					}
					System.out
							.println("------------------------------------������----------------------------------------");
					System.out.println("");
					System.out.println("-----<�߻� ���ϸ�>-----");
					System.out.println("�̸�: " + WildAqustar.Name);
					System.out.println("����: " + WildAqustar.Level);
					System.out.println("Hp: " + WildAqustar.BattleHp + "/" + WildAqustar.Hp);
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
					if (WildAqustar.BattleHp <= 0) {
						WildAqustar.BattleHp = 0;
						System.out.println("-------------------------------------------------");
						System.out.println(WildAqustar.Name + "��(��) �׾����ϴ�.\n");
						System.out.println("�߻� ���ϸ��� �����ƽ��ϴ�.");
						System.out.println("����ġ�� 20�ö����ϴ�.");
						Choice.userPaili.Exp += 20;
						Choice.userPaili.Exp();
						System.out.println("��������� 300���� �־����ϴ�.");
						User.userMoney += 300;
						System.out.println("--------------------------------------------------");
						System.out.println("");
						System.out.println("");
						break;
					}
					System.out.println(WildAqustar.Name + "�� �ݰ��� �Ͽ����ϴ�.");
					System.out.println("����Ÿ �� ����!!!");
					System.out.println("");
					Choice.userPaili.BattleHp -= WildAqustar.WaterAttack;
					System.out
							.println("------------------------------------������----------------------------------------");
					System.out.println("");
					System.out.println("-----<�߻� ���ϸ�>-----");
					System.out.println("�̸�: " + WildAqustar.Name);
					System.out.println("����: " + WildAqustar.Level);
					System.out.println("Hp: " + WildAqustar.BattleHp + "/" + WildAqustar.Hp);
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
			if (WildaqustarBattleFunction == 2) {
				if (Choice.userPaili.BattleHp > 0) {
					if (User.userMedicine == 0) {
						System.err.println("��ó���� ����� �� �����ϴ�.");
						continue;
					} else {
						System.out.println("��ó���� ����ϼ̽��ϴ�.");
						User.userMedicine--;
						Choice.userPaili.BattleHp += 10;
						if (Choice.userPaili.BattleHp > 40) {
							Choice.userPaili.BattleHp = 40;
						}
						System.out.println(
								"------------------------------------������----------------------------------------");
						System.out.println("");
						System.out.println("-----<�߻� ���ϸ�>-----");
						System.out.println("�̸�: " + WildAqustar.Name);
						System.out.println("����: " + WildAqustar.Level);
						System.out.println("Hp: " + WildAqustar.BattleHp + "/" + WildAqustar.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<����� ���ϸ�>-----");
						System.out.println(
								"                                                 �̸�: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 ����: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println("                                              EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"--------------------------------------------------------------------------------");
					}
				}
			}
			if (WildaqustarBattleFunction == 3) {
				if (WildAqustar.BattleHp > 0) {
					if (User.userBall == 0) {
						System.err.println("���ͺ��� ����Ͻ� �� �����ϴ�.");
						System.out.println("");
						continue;
					} else {
						if (WildAqustar.BattleHp > 10) {
							System.out.println("���ͺ��� ����ϼ̽��ϴ�.");
							User.userBall--;
							System.out.println("--------------------------------------");
							System.out.println("���� �� ���� ���� :  " + User.userBall);
							System.out.println("--------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("�߻� ���ϸ��� ���� ������ ���Խ��ϴ�");
							System.out.println("���� ü���� ������ �����ϴ�.");
							System.out.println("");
							continue;
						} else {
							System.out.println("���ͺ��� ����ϼ̽��ϴ�.");
							User.userBall--;
							System.out.println("--------------------------------------");
							System.out.println("���� �� ���� ���� :  " + User.userBall);
							System.out.println("--------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("�߻����ϸ��� �����̽��ϴ�! ���ϵ帳�ϴ�.");
							System.out.println("");
							System.out.println("");
							User.pokemonlist.add(WildAqustar.Name);
							break;
						}
					}
				}
			}
			if (WildaqustarBattleFunction == 4) {
				System.out.println("�߻����ϸ󿡰Լ� �����ƽ��ϴ�.");
				System.out.println("");
				break;
			}
		}
	}

}
