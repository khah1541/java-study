package method;

public class Elevator {
	public static void main(String[] args) {
		//���� ����
		int a = 13;
		int b = 7;
		int c = 10;
		//��� ���
		
		System.out.printf("%d�� -> %s ����������\n",a,guide(a));
		System.out.printf("%d�� -> %s ����������\n",b,guide(b));
		System.out.printf("%d�� -> %s ����������\n",c,guide(c));
	}
		public static String guide(int floor) {
			return ( floor > 10 ) ? "����" : "����";
			
	}
}
