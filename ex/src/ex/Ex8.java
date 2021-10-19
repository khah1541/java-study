package ex;

public class Ex8 {

	public static void main(String[] args) {
		
		
		int x = 7582;
		
		int 시 = x/(60*60);
		int 분 = x/60%60;
		int 초 = x%60;
		
		System.out.printf("%d시간%d분%d초",시,분,초);

	}

}
