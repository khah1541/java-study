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

		System.out.println("1.회원가입");
		System.out.println("2.로그인");

		System.out.println("3.게임 종료");

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
			System.out.println("게임을 종료합니다.");
			mIsRunning = false;
			break;
		default:
			System.out.println("다시 선택해주세요.");

		}
	}

	private static void hqAccount() {
		// 회원가입
		System.out.println("환영합니다. 회원가입을 진행하겠습니다.");

		String id = input(1);
		String password = input(2);

		System.out.println("회원가입 성공");
		mAccount.add(new Account(id, password));
	}

	private static String input(int k) {
		Scanner scanner = new Scanner(System.in);
		String result = null;

		switch (k) {
		case 1:
			while (true) {
				System.out.println("id를 입력하세요.");
				result = scanner.next();

				if (result.trim().isEmpty()) {
					System.out.println("잘못된 닉네임입니다.");
				} else {
					break;
				}
			}
			break;
		case 2:
			while (true) {
				System.out.println("비밀번호를 입력하세요.");
				result = scanner.nextLine();

				System.out.println("비밀번호 확인");
				String passwordC = scanner.nextLine();

				if (result.trim().isEmpty() || passwordC.trim().isEmpty()) {
					System.out.println("비밀번호 또는 비밀번호 확인이 입력되지않았습니다.");
				} else if (!result.equals(passwordC)) {
					System.out.println("비밀번호와 비밀번호 확인이 일치하지않습니다.");
				} else {
					break;
				}
			}
			break;
		case 3:
			while (true) {
				System.out.println("비밀번호를 입력하세요.");
				result = scanner.nextLine();

				if (result.trim().isEmpty()) {
					System.out.println("비밀번호가 입력되지않았습니다.");
				} else {
					
					break;
				}
			}
			break;
		}

		return result;
	}

	private static void logAccount() {
		System.out.println("로그인");

		String id = input(1);
		String password = input(3);
		
		boolean isExist = false;
		for (Account each : mAccount) {
			String eachId = each.getId();
			String eachPassword = each.getPassword();

			if (id.equals(eachId) && password.equals(eachPassword)) {
				System.out.println("로그인 성공");
				System.out.println("환영합니다 OO의세계에 오신걸 환영합니다.");
				System.out.println("서버를 선택하세요.");
				System.out.println("1.연 2.주몽 3.낙랑");
				Scanner scanner = new Scanner(System.in);
				int b = scanner.nextInt();
				if(b == 1) {
					System.out.println("연 서버");
				}else if( b == 2) {
					System.out.println("주몽 서버");
				}else if (b == 3) {
					System.out.println("낙랑 서버");
				}
				else {
					
					break;
				}

				
				System.out.println("접속완료");
				System.out.println("캐릭터를 생성해주세요");
				System.out.println("a.전사 b.마법사 c.도적 d.궁수");
				
				Scanner scanner1 = new Scanner(System.in);

				
				String kh = scanner1.nextLine();
				switch (kh) {
				case "a":
					System.out.println("전사를 선택하셨습니다.");
					System.out.println("모험을 시작하세요!");

					break;
				case "b":
					System.out.println("마법사를 선택하셨습니다.");
					System.out.println("모험을 시작하세요!");

					break;
				case "c":
					System.out.println("도적을 선택하셨습니다.");
					System.out.println("모험을 시작하세요!");

					break;
				case "d":
					System.out.println("궁수를 선택하셨습니다.");
					System.out.println("모험을 시작하세요!");

					break;
				case "7":
					System.out.println("히든직업 초보자입니다.");
					System.out.println("스킬이 없지만 만렙 달성시 특수 스킬이 개방됩니다.");
					System.out.println("모험을 시작하세요!");

					break;

					
					
				default:
					System.out.println("잘못된 선택입니다.");
					System.out.println("접속을 종료합니다.");
					mIsRunning = false;
					break;

				
				if(kh) {
				System.out.println("1.사냥터");
				System.out.println("2.마을");
				System.out.println("3.던전");
				System.out.println("4.거래소");
				
				int ft = scanner.nextInt();
				 
				
				switch (ft) {
				case 1:
					System.out.println("사냥터로 이동합니다.");
					mIsRunning = false;
					break;
				case 2:
					System.out.println("마을로 이동합니다.");
					mIsRunning = false;
					break;
				case 3:
					System.out.println("던전으로 이동합니다.");
					mIsRunning = false;
					break;
				case 4:
					System.out.println("거래소로 이동합니다.");
					mIsRunning = false;
					break;
				default:
					System.out.println("잘못된 선택입니다.");
					mIsRunning = false;
					break;
				
				}
				
				isExist = true;
				break;
					
					
				}
			
				}
				
				
				
				
				
			}
		
		if (!isExist) {
			System.out.println("잘못된 입력입니다.");
		}
		}
		}
	}
		
	


