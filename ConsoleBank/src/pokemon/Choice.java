package pokemon;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Choice {

	Scanner scan = new Scanner(System.in);
	static User user = new User();
	int ballPrice = 200;
	int medicinePrice = 300;
	static Paili userPaili = new Paili("��", "���̸�", 5, 40, 40, 10);
	static Longston GraygymLongston = new Longston("�ϼ�", "�ս���", 8, 40, 40);
	static Longston WildLongston = new Longston("�ϼ�", "�ս���", 5, 20, 20);
	static Aqustar BluegymAqustar = new Aqustar("��", "����Ÿ", 8, 40, 40);
	static Aqustar WildAqustar = new Aqustar("��", "����Ÿ", 5, 20, 20);
	static Ketupi WildKetupi = new Ketupi("Ǯ", "ĳ����", 3, 15, 15);
	int Bbagi = User.grayBbagi + User.blueBbagi;

	// ���ڻ����� ���� ���ϸ� �����ϱ�
	public void Obaksapokemonchoice() {
		while (true) {
			System.out.println(
					"------------------------------------------�ʺ��ڿ� ���ϸ�------------------------------------- ");
			System.out.println("[1��]�̸�: ���̸�/����: 5/ �Ӽ�: ��, [2��]�̸�: ���α� /����: 5/ �Ӽ�: ��, [3��]�̸�: �̻��ؾ� /����: 5/ �Ӽ�: Ǯ ");
			System.out.println(
					"----------------------------------------------------------------------------------------- ");
			System.out.println("");
			System.out.println("�� �� ���ϸ��� �����ڽ��ϱ�?");
			System.out.print("��ȣ �Է� :");
			int PokemonChoice = scan.nextInt();
			if (PokemonChoice == 1) {
				//�ش� ���ϸ� �̹��� ���
				/*
				 * Runnable PailiImage = new Image("PailiImage.png"); Thread PailiChoice = new
				 * Thread(PailiImage) { public void run() { try { Thread.sleep(2000);
				 * }catch(Exception e) { e.printStackTrace(); } } }; PailiChoice.start();
				 */
				System.out.println("���̸��� �����ϼ̽��ϴ�.");
				System.out.println("");
				System.out.println("������ �����Ͻðڽ��ϱ�?");
				System.out.println("1.��    2.�ƴϿ�");
				System.out.print("��ȣ �Է� :");
				int TruepailiChoice = scan.nextInt();
				if (TruepailiChoice == 1) {
					System.out.println("���ڻ�Կ��Էκ��� ���̸��� �޾ҽ��ϴ�");
					User.pokemonlist.add(userPaili.Name); // ���ϸ� ����Ʈ�� ��ü �߰�
					break;
				} else {
					System.out.println("�ٽ� �������ּ���");
					System.out.println("");
				}

			}
			//���α� ����
			if (PokemonChoice == 2) {
				//���α� �̹��� ��� 
				/*
				 * Runnable KkoubugiImage = new Image("KkoubugiImage.png"); Thread
				 * KkoubugiChoice = new Thread(KkoubugiImage); KkoubugiChoice.start();
				 */
				System.out.println("���α⸦ �����ϼ̽��ϴ�.");
				System.out.println("...");
				System.out.println("...");
				System.out.println("...");
				System.out.println("�˼��մϴ�...�̹� �ٸ� ���� �������̽��ϴ�...");
				System.out.println("�ٽ� �������ּ���");
				System.out.println("");
				continue;
			}
			//�̻��ؾ� ���� 
			if (PokemonChoice == 3) {
				//�̻��ؾ� �̹��� ��� 
				/*
				 * Runnable EsanghaessiImage = new Image("EsanghaessiImage.png"); Thread
				 * EsanghaessiChoice = new Thread(EsanghaessiImage); EsanghaessiChoice.start();
				 */
				System.out.println("�̻��ؾ��� �����ϼ̽��ϴ�.");
				System.out.println("...");
				System.out.println("...");
				System.out.println("...");
				System.out.println("�˼��մϴ�...�̹� �ٸ� ���� �������̽��ϴ�...");
				System.out.println("�ٽ� �������ּ���");
				System.out.println("");
				continue;
			}
		}
	}

	// ���ڻ��� ����
	public void Obaksagift() {
		System.out.println("");
		System.out.println("���ڻ� : �̰� ���థ �� ���Ŷ� ");
		System.out.println("���ͺ�x3��, ��ó�� x3�� , ������ 2,000���� �޾ҽ��ϴ�.");
		System.out.println("");
		System.out.println("");
		User.userBall += 3;
		User.userMoney += 2000;
		User.userMedicine += 3;
	}

	// ��ȣ�� ���ϸ� ġ��
	public void Nursepokemoncure() {
		System.out.println("���� Hp:" + userPaili.BattleHp);
		System.out.println("���ϸ��� ġ���ϰڽ��ϴ�.");
		System.out.print("ġ��Ϸ�� Hp: ");
		System.out.println(userPaili.BattleHp = userPaili.Hp);
		System.out.println("ġ�� �Ϸ��Ͽ����ϴ�. �ȳ��� ������.");
		System.out.println("");
	}

	// ��ȣ������ ���� ������ ���
	public void Nurseitemsell() {
		System.out.println("���� �������� �ʿ��ϼ���?");
		while (true) {
			System.out.println(" ");
			System.out.println("-----------------------��ȣ�� ������ �޴� ------------------------");
			System.out.println("  [1��] ��ó��/����: 300��       [2��] ���� ��/����: 200��          [3��] ������  	 ");
			System.out.println("------------------------------------------------------------");
			System.out.println("                                     (���� ������: " + User.userMoney + ")");
			System.out.println("�� ���� �����Ͻðڽ��ϱ�?");
			System.out.print("��ȣ �Է� :");
			int ItemChoice = scan.nextInt();
			if (ItemChoice == 1) {
				System.out.println("��ó���� ���� �����ϼ̽��ϴ�.");
				System.out.println("�� �� ��� �ǰ���?-------------------(���� ������:" + User.userMoney + "��)");
				System.out.print("��ó�� �� �� �Է�(1�� �̻� �Է����ּ���) : ");
				int MedicineCount = scan.nextInt();
				if (medicinePrice * MedicineCount <= User.userMoney) {
					for (int i = 1; i < MedicineCount; i++) {
						User.userMedicine++;
					}
					System.out.println("���� �Ϸ��Ͽ����ϴ�.");
					System.out.println("");
					User.userMoney -= medicinePrice * MedicineCount;
				//���ź� �����ݺ��� ���� ��� ������ �� ����
				} else if (medicinePrice * MedicineCount > User.userMoney) {
					System.out.println("���� �� �� �����ϴ�.");
					System.out.println("");
				}

			}
			if (ItemChoice == 2) {
				System.out.println("���� ���� ���� �����ϼ̽��ϴ�.");
				System.out.println("�� �� ��� �ǰ���?-------------------(���� ������:" + User.userMoney + "��)");
				System.out.print("���� �� �� �� �Է�(1�� �̻� �Է����ּ���) : ");
				int BallCount = scan.nextInt();
				if (ballPrice * BallCount <= User.userMoney) {
					for (int i = 1; i < BallCount; i++) {
						User.userBall++;
					}
					System.out.println("���� �Ϸ��Ͽ����ϴ�.");
					System.out.println("");
					User.userMoney -= ballPrice * BallCount;
					//���ź� �����ݺ��� ���� ��� ������ �� ���� 
				} else if (medicinePrice * BallCount > User.userMoney) {
					System.out.println("���� �� �� �����ϴ�.");
					System.out.println("");
				}

			} else if (ItemChoice == 3) {
				System.out.println("������ �ٽ� �ò���.");
				System.out.println("");
				break;
			}
		}
	}

	public void TaechovillageChoice() {
		System.out.println("--------------���ʸ��� �޴� --------------");
		System.out.println("   [1��]���¸� ����         [2��]���ڻ�Բ� ����         [3��]�� �̵� ");
		System.out.println("-------------------------------------");
	}

	public void Graycitychoice() {
		System.out.println("--------------ȸ����Ƽ �޴� --------------");
		System.out.println("   [1��]ü���� ����         [2��]���ϸ��� ����         [3��]���¸� ���� \n   [4��]�߻����ϸ� ���   [5��]�� �̵�");
		System.out.println("-------------------------------------");

	}

	public void Bluecitychoice() {
		System.out.println("---------------����Ƽ �޴� ---------------");
		System.out.println("   [1��]ü���� ����         [2��]���ϸ��� ����         [3��]���¸� ���� \n   [4��]�߻����ϸ� ���  [5��]�������� ");
		System.out.println("---------------------------------------");
	}
	//�׷��̽�Ƽ ���� ���� �޴� 
	public void Woongchoice() {
		System.out.println("���� ���� : ���� ����غ��ٰ�? ");
		System.out.println("");
		System.out.println("------------���� �޴� -------------");
		System.out.println("   1.���ϸ� ��Ʋ�� �Ѵ�   2.��������    ");
		System.out.println("--------------------------------");
		System.out.print("��ȣ �Է� :");
		int WoongChoice = scan.nextInt();
		if (WoongChoice == 1) {

			System.out.println("�Ƿ� �� �� ����?");
			System.out.println("���� ���̰� ���ϸ��� ���½��ϴ�");
			System.out.println("����ڴ��� ���ϸ��� ���½��ϴ�");
			System.out.println("------------------------------------������----------------------------------------");
			System.out.println("");
			System.out.println("-----<���� ���ϸ�>-----");
			System.out.println("�̸�: " + GraygymLongston.Name);
			System.out.println("����: " + GraygymLongston.Level);
			System.out.println("Hp: " + GraygymLongston.BattleHp + "/" + GraygymLongston.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("                   -----<����� ���ϸ�>-----");
			System.out.println("                                                 �̸�: " + userPaili.Name);
			System.out.println("                                                 ����: " + userPaili.Level);
			System.out.println("                      Hp: " + userPaili.BattleHp + "/" + userPaili.Hp);
			System.out.println("                                                    EXP:" + userPaili.Exp);
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("��Ʋ �����ϰڽ��ϴ�.");
			Battle GrayBattle = new Battle();
			GrayBattle.GrayGym();
		} else if (WoongChoice == 2) {
			System.out.println("��Ʋ���� ���������ϴ�.");
			System.out.println("");
		}

	}
	//����Ƽ ���� �̽� �޴� 
	public void EsuelChoice() {
		System.out.println("���� �̽� : ���� ����غ���? ");
		System.out.println("");
		System.out.println("------------�̽� �޴� -------------");
		System.out.println("   1.���ϸ� ��Ʋ�� �Ѵ�   2.��������    ");
		System.out.println("--------------------------------");
		System.out.print("��ȣ �Է� :");
		int EsuelChoice = scan.nextInt();
		if (EsuelChoice == 1) {
			System.out.println("�Ƿ� �� �� ����?");
			System.out.println("���� �̽��� ���ϸ��� ���½��ϴ�");
			System.out.println("����ڴ��� ���ϸ��� ���½��ϴ�");
			System.out.println("------------------------------------������----------------------------------------");
			System.out.println("");
			System.out.println("-----<�̽� ���ϸ�>-----");
			System.out.println("�̸�: " + BluegymAqustar.Name);
			System.out.println("����: " + BluegymAqustar.Level);
			System.out.println("Hp: " + BluegymAqustar.BattleHp + "/" + BluegymAqustar.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("                   -----<����� ���ϸ�>-----");
			System.out.println("                                                 �̸�: " + userPaili.Name);
			System.out.println("                                                 ����: " + userPaili.Level);
			System.out.println("                      Hp: " + userPaili.BattleHp + "/" + userPaili.Hp);
			System.out.println("                                                    EXP:" + userPaili.Exp);
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("��Ʋ �����ϰڽ��ϴ�.");
			Battle BlueBattle = new Battle();
			BlueBattle.BlueGym();
		} else if (EsuelChoice == 2) {
			System.out.println("��Ʋ���� ���������ϴ�.");
		}
	}

	public void WildchoiceKetupi() {
		System.out.println("");
		System.out.println("------------�߻����ϸ� ��Ʋ -------------");
		System.out.println("   1.���ϸ� ��Ʋ�� �Ѵ�   2.��������    ");
		System.out.println("--------------------------------");
		System.out.print("��ȣ �Է� :");
		int WildChoice = scan.nextInt();
		if (WildChoice == 1) {
			System.out.println("------------------------------------������----------------------------------------");
			System.out.println("");
			System.out.println("-----<�߻� ���ϸ�>-----");
			System.out.println("�̸�: " + WildKetupi.Name);
			System.out.println("����: " + WildKetupi.Level);
			System.out.println("Hp: " + WildKetupi.BattleHp + "/" + WildKetupi.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("                   -----<����� ���ϸ�>-----");
			System.out.println("                                                 �̸�: " + userPaili.Name);
			System.out.println("                                                 ����: " + userPaili.Level);
			System.out.println("                      Hp: " + userPaili.BattleHp + "/" + userPaili.Hp);
			System.out.println("                                                    EXP:" + userPaili.Exp);
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("��Ʋ �����ϰڽ��ϴ�.");
			Battle WildbattleKetupi = new Battle();
			WildbattleKetupi.WildbattleKetupi();
		} else if (WildChoice == 2) {
			System.out.println("��Ʋ���� ���������ϴ�.");
		}
	}

	public void WildchoiceLongston() {
		System.out.println("");
		System.out.println("------------�߻����ϸ� ��Ʋ -------------");
		System.out.println("   1.���ϸ� ��Ʋ�� �Ѵ�   2.��������    ");
		System.out.println("--------------------------------");
		System.out.print("��ȣ �Է� :");
		int WildChoice = scan.nextInt();
		if (WildChoice == 1) {
			System.out.println("------------------------------------������----------------------------------------");
			System.out.println("");
			System.out.println("-----<�߻� ���ϸ�>-----");
			System.out.println("�̸�: " + WildLongston.Name);
			System.out.println("����: " + WildLongston.Level);
			System.out.println("Hp: " + WildLongston.BattleHp + "/" + WildLongston.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("                   -----<����� ���ϸ�>-----");
			System.out.println("                                                 �̸�: " + userPaili.Name);
			System.out.println("                                                 ����: " + userPaili.Level);
			System.out.println("                      Hp: " + userPaili.BattleHp + "/" + userPaili.Hp);
			System.out.println("                                                    EXP:" + userPaili.Exp);
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("��Ʋ �����ϰڽ��ϴ�.");
			Battle WildbattleLongston = new Battle();
			WildbattleLongston.WildbattleLongston();
		} else if (WildChoice == 2) {
			System.out.println("��Ʋ���� ���������ϴ�.");
		}
	}

	public void WildchoiceAqustar() {
		System.out.println("");
		System.out.println("------------�߻����ϸ� ��Ʋ -------------");
		System.out.println("   1.���ϸ� ��Ʋ�� �Ѵ�   2.��������    ");
		System.out.println("--------------------------------");
		System.out.print("��ȣ �Է� :");
		int WildChoice = scan.nextInt();
		if (WildChoice == 1) {
			System.out.println("------------------------------------������----------------------------------------");
			System.out.println("");
			System.out.println("-----<�߻� ���ϸ�>-----");
			System.out.println("�̸�: " + WildAqustar.Name);
			System.out.println("����: " + WildAqustar.Level);
			System.out.println("Hp: " + WildAqustar.BattleHp + "/" + WildAqustar.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("                   -----<����� ���ϸ�>-----");
			System.out.println("                                                 �̸�: " + userPaili.Name);
			System.out.println("                                                 ����: " + userPaili.Level);
			System.out.println("                      Hp: " + userPaili.BattleHp + "/" + userPaili.Hp);
			System.out.println("                                                    EXP:" + userPaili.Exp);
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("��Ʋ �����ϰڽ��ϴ�.");
			Battle WildbattleAqustar = new Battle();
			WildbattleAqustar.WildbattleAqustar();
		} else if (WildChoice == 2) {
			System.out.println("��Ʋ���� ���������ϴ�.");
		}
	}
	//���� ����â ���� 
	public void UserChoice() {
		while (true) {
			System.out.println("-------------------��� �޴� ---------------------");
			System.out.println(" [1��]������ǰ   [2��]���ϸ��   [3��]������ ����   [4��]�ڷΰ���   ");
			System.out.println("-----------------------------------------------");
			System.out.print("��ȣ �Է�:");
			int UserMenu = scan.nextInt();
			switch (UserMenu) {
			case 1:
				System.out.println("-------------------������ǰ ---------------------");
				System.out.println(" ������ : " + User.userMoney + "           ���� ��������: " + Bbagi);
				System.out.println("-----------------------------------------------");
				System.out.println("			(0��: �ڷΰ���)");
				System.out.print("��ȣ �Է�:");

				// �ڷΰ���
				int BackUser = scan.nextInt();
				if (BackUser == 0) {
					continue;
				}

			case 2:
				System.out.println("-------------���ϸ�� --------------");
				System.out.println(User.pokemonlist);
				System.out.println("------------------------------------");
				System.out.println("			(0��: �ڷΰ���)");
				System.out.print("��ȣ �Է�:");
				int BackPokemon = scan.nextInt();
				if (BackPokemon == 0) {
					continue;
				}

			case 3:
				System.out.println("-------------------------������ ���� ----------------------------");
				System.out.println("[1]��ó�� :" + User.userMedicine + "��   [2]���ͺ� :" + User.userBall + "��");
				System.out.println("-------------------------------------------------------------");
				System.out.println("			(0��: �ڷΰ���)");
				System.out.print("��ȣ �Է�:");
				int BackItem = scan.nextInt();
				if (BackItem == 0) {
					continue;
				}
			case 4:
				break;
			}
			break;
		}
	}

}
