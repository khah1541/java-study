package method;

public class Walking {

	public static void main(String[] args) {
		// 1. Į�θ� ����� ���� �޼ҵ带 ȣ���Ͻÿ�.
		
		double kcal = calculateCalory(5000);
		System.out.println("�Ҹ� Į�θ�  : " + kcal +"kcal");
		
		
		double result = 0.02; 
				
				
	   // 3.����� ����Ͻÿ�.
	}

	
	//2. Į�θ� ��� �޼ҵ带 �����Ͻÿ�.
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}
	
}
