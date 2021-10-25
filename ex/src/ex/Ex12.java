package ex;

public class Ex12 {

	public static void main(String[] args) {
		
		int num = 374;
		int 일 = num%10;
		int 십 = (num%100)/10;
		int 백 = num/100;
		
		int total = 일+십+백;
		
		System.out.println(total);
		
	}

}
