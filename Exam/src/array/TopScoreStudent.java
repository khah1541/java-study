package array;

public class TopScoreStudent {

	public static void main(String[] args) {
		String[] names = { "Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton" };

		int[] scores = { 65, 74, 23, 75, 68, 96, 88, 98, 54 };

		// 1�� �ε��� �˻�
		int i = topIndex(scores);

		// ��� ���
		System.out.printf("1�� : %s(%d��)", names[i], scores[i]);

	}

	// ������ �迭�� �Է¹޾� ���� ū ���� �ε����� ��ȯ
	private static int topIndex(int[] arr) {
		int index =0;
		for(int i = 0, temp =0; i <arr.length; i++) {
			if(arr[i] > temp) {
				temp = arr[i];
				index = i;
			}
		}
		return index;
	}

}
