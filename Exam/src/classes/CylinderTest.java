package classes;

public class CylinderTest {

	public static void main(String[] args) {
		//��ü ����
		Cylinder c = new Cylinder();
		
		//�Ӽ��� �Է�
		c.radius = 4;
		c.height = 5;
		
		//���
		System.out.printf("������� ���� : %.2f\n", c.getVolume());
		System.out.printf("������� �ѳ��� : %.2f\n", c.getArea());
	}

}

class Cylinder {
	int radius;
	int height;
	
	double getVolume() {
		return Math.PI*radius*radius*height; 
	}
	double getArea() {
		return 2*(Math.PI*radius*radius)+2*(Math.PI*height*radius);
	}
}
