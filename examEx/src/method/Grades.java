package method;

public class Grades {

	public static void main(String[] args) {

		int score1 = 96;
		int score2 = 85;
		int score3 = 76;
		
		
		System.out.printf("%dÁ¡ -> %s\n",score1, grade(score1));
		System.out.printf("%dÁ¡ -> %s\n",score2, grade(score2));
		System.out.printf("%dÁ¡ -> %s\n",score3, grade(score3));
	}

	private static Object grade(int score) {
		String grade = "A+";
		if(score >= 95) grade = "A+";
		else if(score >=85)grade = "B+";
		else grade ="B0";
		
		return grade;
	}

}
