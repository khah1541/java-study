package ex;

public class Ex14 {

	public static void main(String[] args) {
		
		int price = 152365;
		
		int oman = 3 ; 
		int man = 0 ;
		int ochun = 0;
		int chun = 2;
		
		int dis = 365;
		
		int total = oman + man + ochun + chun;
		
		System.out.printf("5만원 x %d\n",oman);
		System.out.printf("1만원 x %d\n",man);
		System.out.printf("5천원 x %d\n",ochun);
		System.out.printf("1천원 x %d\n",chun);
		System.out.println("------------------");
		System.out.printf("총 장수 : %d장\n",total);
		System.out.printf("금액 : %d원\n",price - dis);
		System.out.printf("할인 : %d원\n",dis);
	}

}
