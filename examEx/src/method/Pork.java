package method;

public class Pork {

	public static void main(String[] args) {
		int n = 3;
		int weight = 180*n;
		double k = kcal(n);
		
		
		System.out.printf("ªÔ∞„ªÏ %d¿Œ∫– : %.2fkcal",n,k);

	}
	public static double kcal(int n) {
		return 5.179*180*n;
	}
}
