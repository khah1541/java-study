package ex;

public class Ex13 {

	public static void main(String[] args) {
		
		double t = 5.0;				//�̵� �ð�
		double g = -9.81;			//�߷� ���ӵ�
		double iv = 0.0;	//�ʱ� �ӵ�
		double ip = 1000.0;//�ʱ���ġ
		
		double finalPosition = 0.5*g*t*t+iv*t+ip;
		
		System.out.printf("%.2f�� �� ��ġ : %.2fm\n",t ,finalPosition);
				
	}

}
