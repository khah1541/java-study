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
		
		System.out.printf("5���� x %d\n",oman);
		System.out.printf("1���� x %d\n",man);
		System.out.printf("5õ�� x %d\n",ochun);
		System.out.printf("1õ�� x %d\n",chun);
		System.out.println("------------------");
		System.out.printf("�� ��� : %d��\n",total);
		System.out.printf("�ݾ� : %d��\n",price - dis);
		System.out.printf("���� : %d��\n",dis);
	}

}
