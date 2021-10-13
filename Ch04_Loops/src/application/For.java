package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조건;증감){명령문;}
	
		for(int i=0; i<3; i++) {
			System.out.println("i : " + i);
		}
		int x = 0;
		for(int i=1;i<=100; i++) {
			x = x +i;
			System.out.println(x);
		}
			
		
		/* 여러줄 주석
		for(;;) {
			System.out.println("무한반복");
		}
		*/
	}

}
