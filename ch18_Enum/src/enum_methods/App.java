package enum_methods;

public class App {

	public static void main(String[] args) {
		//values() �޼ҵ� �ش� enum�� ��� ����� ������ �迭�� ����
		//Fruit[] fruits = Fruit.values();
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f);
		}
		
		//ordinal �޼ҵ�� ����� ����(�ε��� 0���� ����)�� ����
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
		//valueOf("��") �޼ҵ�
		Fruit f1 = Fruit.valueOf("ROANGE"); //���ڿ� ORANGE�� ���� ���� ���� enum ����� ã��
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
	}

}
