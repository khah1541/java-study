package appilcation;

public class BooleanAnd {

	public static void main(String[] args) {
		// ==(����), !=(�����ʴ�), !(�ݴ�), &&(and), ||(or)
		
		boolean isRaining = true; // �� ���°�?
		boolean haveUmbrella = false; //����� �ִ°�?
		boolean takeUmbrella =  false;// ����� ����?
		//1. �� ���� ����� ������ ����� ����.
		//isRaning�� false �̸� �� �����ʴ°��̱� ������ ����� ���ʿ䰡���� false!
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println("ù��° ��� : " + takeUmbrella);
		
		
		// 2.And ������ &&
		if (isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("AND ���� : " + takeUmbrella);
		
		// 3.�������� ������
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		
		System.out.println("�������� ��� : " + takeUmbrella);

	}

}
