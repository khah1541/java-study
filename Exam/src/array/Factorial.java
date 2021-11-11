package array;

public class Factorial {

	public static void main(String[] args) {
		// �Է°� �ޱ�
		int number = Integer.parseInt("4");

		// ��� ���
		printFactorial(number);
	}

	// ���� n�� �Է��� �޾� n!�� ����� ���
	private static void printFactorial(int n) {
		int result = 1;
		System.out.printf("%d! =",n);
		for (int i = n; i > 0; i--) {
			System.out.printf("%d", i);
			result *= i;
			if (i != 1) {
				System.out.printf(" x ");
			}
		}
		System.out.printf(" = %d\n",result);
	}

}
