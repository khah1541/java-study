package method;

public class Grades {

	public static void main(String[] args) {
		// ���� ����
		
		int score1 = 96;
		int score2 = 85;
		int score3 = 76;

		
		//��� ���
		
		System.out.printf("%d�� -> %s\n", score1 , grade(score1));
		System.out.printf("%d�� -> %s\n", score2 , grade(score2));
		System.out.printf("%d�� -> %s\n", score3 , grade(score3));
	}
	public static String grade(int score) {
		String grade = "c+" ;
		
		if(score >= 95) grade = "A";
		else if (score >= 85) grade = "B";
		else grade = "f";
		
		return grade;
	}
	
}
