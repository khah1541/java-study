package throwing_Exception2;

public class Thermostat {
	
	public void setTemperature(double temperature) {
		
		if(temperature < 0 || temperature >35) {
			//�µ����� ���������� ���ܼ� ���� ó���Ѵ�. throw�� �ϴ� ���ܸ� ���߿� ó��(�� �޼ҵ带 ȣ���Ҷ� ó��)
			throw new RuntimeException("�µ��� ������ �Դϴ�.");
			}
	
		System.out.println("�µ� ���� : " + temperature);
	}

}
