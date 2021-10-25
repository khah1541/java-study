package ex;

public class Ex13 {

	public static void main(String[] args) {
		
		double t = 5.0;				//이동 시간
		double g = -9.81;			//중력 가속도
		double iv = 0.0;	//초기 속도
		double ip = 1000.0;//초기위치
		
		double finalPosition = 0.5*g*t*t+iv*t+ip;
		
		System.out.printf("%.2f초 후 위치 : %.2fm\n",t ,finalPosition);
				
	}

}
