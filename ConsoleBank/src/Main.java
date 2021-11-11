import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Account> mAccounts = new ArrayList<>();
    private static boolean mIsRunning = true;

    public static void main(String[] args) {
        while (mIsRunning) {
            displayMenu();
        }
    }

    private static void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. ���� ����");
        System.out.println("2. ���� ��ȸ");
        System.out.println("3. ������ �α���");
        System.out.println("4. ����");

        int action = scanner.nextInt();

        switch (action) {
            case 1:
                makeAccount();
                break;
            case 2:
                checkAccount();
                break;
            case 3:
                admin();
                break;
            case 4:
                System.out.println("���α׷��� �����մϴ�!");
                mIsRunning = false;
                break;
            default:
                System.out.println("�������� �ʴ� ����Դϴ�!");
        }
    }

    private static void makeAccount() {
        System.out.println("���� ������ �����մϴ�!");

        String id = input(1);
        String password = input(2);

        System.out.println("���°� �����Ǿ����ϴ�!");
        mAccounts.add(new Account(id, password, 0));
    }

    private static String input(int mode) {
        Scanner scanner = new Scanner(System.in);
        String result = null;

        switch (mode) {
            case 1:
                while (true) {
                    System.out.println("id�� �Է��ϼ���!");
                    result = scanner.nextLine();

                    if (result.trim().isEmpty()) {
                        System.out.println("id�� ������ ������� �ʽ��ϴ�!");
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                while (true) {
                    System.out.println("��й�ȣ�� �Է��ϼ���!");
                    result = scanner.nextLine();

                    System.out.println("��й�ȣ Ȯ���� �Է��ϼ���!");
                    String passwordCheck = scanner.nextLine();

                    if (result.trim().isEmpty() || passwordCheck.trim().isEmpty()) {
                        System.out.println("��й�ȣ �Ǵ� ��й�ȣ Ȯ���� �����Դϴ�!");
                    } else if (!result.equals(passwordCheck)) {
                        System.out.println("��й�ȣ�� ��й�ȣ Ȯ���� ��ġ���� �ʽ��ϴ�!");
                    } else {
                        break;
                    }
                }
                break;
            case 3:
                while (true) {
                    System.out.println("��й�ȣ�� �Է��ϼ���!");
                    result = scanner.nextLine();

                    if (result.trim().isEmpty()) {
                        System.out.println("��й�ȣ�� �����Դϴ�!");
                    } else {
                        break;
                    }
                }
                break;
        }

        return result;
    }

    private static void checkAccount() {
        System.out.println("���¸� ��ȸ�մϴ�!");

        String id = input(1);
        String password = input(3);

        boolean isExist = false;
        for (Account each : mAccounts) {
            String eachId = each.getId();
            String eachPassword = each.getPassword();

            if (id.equals(eachId) && password.equals(eachPassword)) {
                System.out.println("��ȸ�Ͻ� ������ ������ ������ �����ϴ�!");
                System.out.printf("���¸� : %s, ��й�ȣ : %s, �ܾ� : %d", eachId, eachPassword, each.getMoney());
                System.out.println();
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("�׷��� ���´� �������� �ʽ��ϴ�!");
        }
    }

    private static void admin() {
        System.out.println("������ ����Դϴ�!");

        String id = input(1);
        String password = input(3);

        if (id.equals("admin") && password.equals("1234")) {
            System.out.println("������ �α��ο� �����ϼ̽��ϴ�.");
            System.out.println("������ ȸ������ ������ ������ �����ϴ�.");

            for (Account each : mAccounts) {
                System.out.printf("���¸� : %s, ��й�ȣ : %s, �ܾ� : %d\r\n", each.getId(), each.getPassword(), each.getMoney());
            }
        } else {
            System.out.println("���̵� �Ǵ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�!");
        }
    }


}
