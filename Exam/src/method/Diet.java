package method;

public class Diet {

	public static void main(String[] args) {
		//���� ����
		double w = 81.6;
		double t = 1.76;
		
		//BMI ���
		double bmi = calculate(w,t);
		
		//��� ���
		System.out.printf("BMI : %.2f(%.1fkg,%.2fm)\n",bmi,w,t);
		System.out.printf("��� : %s�Դϴ�.\n",result(bmi));
		}
		//�����Կ� Ű�� �Է¹޾� bmi ������ ��ȯ
	public static double calculate(double weight,double tall) {
		
		return weight / (tall*tall);
		
	}
	public static String result(double bmi) {
		
				if(30>bmi) {
					System.out.println("��ü���Դϴ�.");
				}else {
		 			System.out.println("�����Դϴ�.");
				}
		
		
			}


}
