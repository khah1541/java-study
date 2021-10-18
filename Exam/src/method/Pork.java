package method;

public class Pork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =3;
		double weight = 180* n;
		double kcal = weight*5.179;
		
		System.out.printf("»ð°ã»ì %dÀÎºÐ %.2f kcal",n,kcal);
		

		
	}

	
	
	private static double calculateCalory(int n) {
		return (180*n)*5.179;
	}
}
