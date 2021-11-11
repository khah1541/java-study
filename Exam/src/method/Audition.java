package method;

public class Audition {

	public static void main(String[] args) {
		//변수 생성
		
		double tomV = 8.8;
		double tomD = 7.6;
		double kateV = 9.2;
		double kateD = 7.8;
		
		//결과 출력
		System.out.printf("TOM의 오디션 결과 : %s\n",test(tomV,tomD));
		System.out.printf("KATE의 오디션 결과 : %s\n",test(kateV,kateD));
	}
	
	//보컬과 댄스 성적을 토대로 결과 문자열을 반환
	public static String test(double V,double D) {
		return (V*D > 70) ? "합격" : "불합격";
				
	}

}
