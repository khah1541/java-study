package appilcation;

public class BooleanOr {

	public static void main(String[] args) {
		// and or ���ÿ� ���
		boolean isRaining = false; //�� ���°�?
		boolean mightRain = true; //�� �ü��� �ִ°�?
		
		boolean haveUmbrella = true; //����� �ִ°�?
		
		if((isRaining || mightRain) && haveUmbrella) {
			System.out.println("����� ����");
		}else {
			System.out.println("����� ���� �ʴ´�.");
		}
		
		boolean rainCheck = isRaining || mightRain; //�� ���ų� �ü��� �ְų� �϶� ��
		
		if(rainCheck && haveUmbrella) {
			System.out.println("����� ����!");
			
		}else {
			System.out.println("����� ���� �ʴ´�.");
		}
	
	}

}
