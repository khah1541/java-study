package appilcation;

public class BooleanAndOr {

	public static void main(String[] args) {
		// || or �� ������
		boolean isRaining = true; //�� ���°�?
		boolean mightRain = false; //�� �ü��� �ִ°�?
		
		boolean takeUmbrella = false; //����� �������°�?
		
		takeUmbrella = isRaining || mightRain; //�� ���ų� �Ǵ� �ü��� �ְų� �ϳ��� ���̸� ��
		
		System.out.println(takeUmbrella);
	}

}
