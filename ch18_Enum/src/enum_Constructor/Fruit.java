package enum_Constructor;

public enum Fruit {	//enum�� ��� (������ �ʴ� ��)���� ����
	APPLE("�ʷϻ�") , BANANA("�����"), ORANGE("��������"); //����,�ٳ���,������ ����
	private String color;
	
	Fruit(String color) {
		this.color = color;
	}
	public String toString() {
		return super.toString() + "("+color+")";
	}
	
}
