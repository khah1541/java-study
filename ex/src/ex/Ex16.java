package ex;

public class Ex16 {
	public static void main(String[] args) {
		int in = 3;
		int g  = 180;
		double kcal = 5.179*g;
		
		double total = in*kcal;
		
		System.out.printf("���� %d�κ�:%.2fkcal",in,total);
	}
}
