package ex;

public class Ex15 {
	public static void main(String[] args) {
		
		
		double kcal = calculateCalory(5000);
		
		double result = 0.02;
		System.out.println("¼Ò¸ðÄ®·Î¸® " + kcal + "kcal");
	
	}
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}
}
