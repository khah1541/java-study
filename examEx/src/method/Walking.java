package method;

public class Walking {

	public static void main(String[] args) {
		
		
		
		double result = calculateCalory(5000); 
				

				
		System.out.println("�Ҹ� Į�θ� : " + result + "kcal");

	}

	
	private static double calculateCalory(int walk) {
		return 0.02*walk;
	}
	
}
