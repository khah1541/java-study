package method;

public class Grade {

	public static void main(String[] args) {
		// 변수 생성
		int score1 = 96;
		int score2 = 85;
		int score3 = 76;

		// 결과 출력
		System.out.printf("%d점 -> %s\n",score1,grade(score1));
		System.out.printf("%d점 -> %s\n",score2,grade(score2));
		System.out.printf("%d점 -> %s\n",score3,grade(score3));
	}

	public static String grade(int score) {
		String grade = "C+";
		if(score >= 95) grade = "A+";
		else if (score >= 90)grade = "A";
		else if (score >= 85)grade = "b+";
		else if (score >= 80)grade = "b";
		else grade = "c+";		
		return grade;
	}
	
}
