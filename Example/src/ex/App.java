package ex;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
	static ArrayList<Account> mAccount = new ArrayList<>();
	private static boolean mIsRunning = true;
	

	public static void main(String[] args) {
		while (mIsRunning) {
			dispalyMenu();

		}

	}

	private static void dispalyMenu() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1.ȸ������");
		System.out.println("2.�α���");

		System.out.println("3.���� ����");

		int at = scanner.nextInt();
		// System.out.println(at);
		switch (at) {
		case 1:
			hqAccount();
			break;
		case 2:
			logAccount();
			break;

		case 3:
			System.out.println("������ �����մϴ�.");
			mIsRunning = false;
			break;
		default:
			System.out.println("�ٽ� �������ּ���.");

		}
	}

	private static void hqAccount() {
		// ȸ������
		System.out.println("ȯ���մϴ�. ȸ�������� �����ϰڽ��ϴ�.");

		String id = input(1);
		String password = input(2);

		System.out.println("ȸ������ ����");
		mAccount.add(new Account(id, password));
	}

	private static String input(int k) {
		Scanner scanner = new Scanner(System.in);
		String result = null;

		switch (k) {
		case 1:
			while (true) {
				System.out.println("id�� �Է��ϼ���.");
				result = scanner.next();

				if (result.trim().isEmpty()) {
					System.out.println("�߸��� �г����Դϴ�.");
				} else {
					break;
				}
			}
			break;
		case 2:
			while (true) {
				System.out.println("��й�ȣ�� �Է��ϼ���.");
				result = scanner.nextLine();

				System.out.println("��й�ȣ Ȯ��");
				String passwordC = scanner.nextLine();

				if (result.trim().isEmpty() || passwordC.trim().isEmpty()) {
					System.out.println("��й�ȣ �Ǵ� ��й�ȣ Ȯ���� �Էµ����ʾҽ��ϴ�.");
				} else if (!result.equals(passwordC)) {
					System.out.println("��й�ȣ�� ��й�ȣ Ȯ���� ��ġ�����ʽ��ϴ�.");
				} else {
					break;
				}
			}
			break;
		case 3:
			while (true) {
				System.out.println("��й�ȣ�� �Է��ϼ���.");
				result = scanner.nextLine();

				if (result.trim().isEmpty()) {
					System.out.println("��й�ȣ�� �Էµ����ʾҽ��ϴ�.");
				} else {
					
					break;
				}
			}
			break;
		}

		return result;
	}

	private static void logAccount() {
		System.out.println("�α���");

		String id = input(1);
		String password = input(3);
		
		boolean isExist = false;
		for (Account each : mAccount) {
			String eachId = each.getId();
			String eachPassword = each.getPassword();

			if (id.equals(eachId) && password.equals(eachPassword)) {
				System.out.println("�α��� ����");
				System.out.println("ȯ���մϴ� OO�Ǽ��迡 ���Ű� ȯ���մϴ�.");
				System.out.println("������ �����ϼ���.");
				System.out.println("1.�� 2.�ָ� 3.����");
				Scanner scanner = new Scanner(System.in);
				int b = scanner.nextInt();
				if(b == 1) {
					System.out.println("�� ����");
				}else if( b == 2) {
					System.out.println("�ָ� ����");
				}else if (b == 3) {
					System.out.println("���� ����");
				}
				else {
					
					break;
				}

				
				System.out.println("���ӿϷ�");
				System.out.println("ĳ���͸� �������ּ���");
				System.out.println("a.���� b.������ c.���� d.�ü�");
				
				Scanner scanner1 = new Scanner(System.in);

				
				String kh = scanner1.nextLine();
				switch (kh) {
				case "a":
					System.out.println("���縦 �����ϼ̽��ϴ�.");
					System.out.println("������ �����ϼ���!");

					break;
				case "b":
					System.out.println("�����縦 �����ϼ̽��ϴ�.");
					System.out.println("������ �����ϼ���!");

					break;
				case "c":
					System.out.println("������ �����ϼ̽��ϴ�.");
					System.out.println("������ �����ϼ���!");

					break;
				case "d":
					System.out.println("�ü��� �����ϼ̽��ϴ�.");
					System.out.println("������ �����ϼ���!");

					break;
				case "7":
					System.out.println("�������� �ʺ����Դϴ�.");
					System.out.println("��ų�� ������ ���� �޼��� Ư�� ��ų�� ����˴ϴ�.");
					System.out.println("������ �����ϼ���!");

					break;

					
					
				default:
					System.out.println("�߸��� �����Դϴ�.");
					System.out.println("������ �����մϴ�.");
					mIsRunning = false;
					break;

				
				if(kh) {
				System.out.println("1.�����");
				System.out.println("2.����");
				System.out.println("3.����");
				System.out.println("4.�ŷ���");
				
				int ft = scanner.nextInt();
				 
				
				switch (ft) {
				case 1:
					System.out.println("����ͷ� �̵��մϴ�.");
					mIsRunning = false;
					break;
				case 2:
					System.out.println("������ �̵��մϴ�.");
					mIsRunning = false;
					break;
				case 3:
					System.out.println("�������� �̵��մϴ�.");
					mIsRunning = false;
					break;
				case 4:
					System.out.println("�ŷ��ҷ� �̵��մϴ�.");
					mIsRunning = false;
					break;
				default:
					System.out.println("�߸��� �����Դϴ�.");
					mIsRunning = false;
					break;
				
				}
				
				isExist = true;
				break;
					
					
				}
			
				}
				
				
				
				
				
			}
		
		if (!isExist) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		}
		}
	}
		
	


