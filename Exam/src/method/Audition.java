package method;

public class Audition {

	public static void main(String[] args) {
		//���� ����
		
		double tomV = 8.8;
		double tomD = 7.6;
		double kateV = 9.2;
		double kateD = 7.8;
		
		//��� ���
		System.out.printf("TOM�� ����� ��� : %s\n",test(tomV,tomD));
		System.out.printf("KATE�� ����� ��� : %s\n",test(kateV,kateD));
	}
	
	//���ð� �� ������ ���� ��� ���ڿ��� ��ȯ
	public static String test(double V,double D) {
		return (V*D > 70) ? "�հ�" : "���հ�";
				
	}

}
