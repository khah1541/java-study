package try_catch;

import java.util.Scanner;

public class App2 {
private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// try catch ���� ����� ����ó��
		
	
		
		int number = getNumber() {
		//���ڸ� �Է¹��� ������ �ݺ��Ͽ� ���ڸ� �Է¹޾� �����ϴ� �޼ҵ�
			System.out.println("�Է��� ���ڴ�  : " + number);
			scanner.close();
		}
		private static int getNumber() {
		
			int number = 0;
		boolean isNumber = false;
		do {
			System.out.println("���ڸ� �Է� : ");
			String line = scanner.nextLine();
			try { //������ ���� �մ� �ڵ带 try�� �ȿ� �ִ´�}
				number = Integer.parseInt(line);//���⼭ ������ ���� ������ ���� �Է��� ����
				isNumber = true;
			}catch (Exception e) {// try���� ������ �߻��� catch������ ó���Ѵ�.
				System.out.println("���� �Է��� �ƴմϴ�.");
			}
			
		}while (!isNumber);
			
	return number;
}
	
}