package appilcation;

public class Cat {
	private String name; // ����� �̸�
	public static final String FOOD = "����� ���";
	//����ƽ ������ ��ü���� ��������
	private static int count = 0;// ������ ������� ����
	
	public Cat(String name) { // �����ڴ� ���� Ÿ���� ����(�Ϲ� �޼ҵ�� �ٸ�)
		this.name = name;
		count++; // ����� ��ü ������ ����ƽ count�� +1�� �ȴ�
		
	
	}

	@Override
	public String toString() { // toString �޼ҵ� �ڵ�����
		return "��ι� [�̸� = " + name + "]";
	}
	
	public static int getCount( ) { //����ƽ �޼ҵ�
		//String n = name; ����ƽ �޼ҵ忡�� �ν��Ͻ�(��ü) ������ ����� �� ����.
		return count;
	}
	
}
