package method;

public class Audition {

	public static void main(String[] args) {
		double tomV = 8.8;
		double tomD = 7.6;
		double kateV = 9.2;
		double kateD = 7.8;
		
		
		System.out.printf("Tom�� ����� ��� : %s\n",test(tomV,tomD));
		System.out.printf("Kate�� ����� ��� : %s\n",test(kateV,kateD));	
	}

	private static Object test(double V, double D) {
	
		return V*D >= 70 ? "���" : "����";
	}

	
}
