package throwing_costom_Exception;

public class Thermostat {
	
	public void setTemperature(double temperature) throws Exception {
		
		if(temperature < 0 || temperature >35) {
			//�µ����� ���������� ���ܼ� ���� ó���Ѵ�. throw�� �ϴ� ���ܸ� ���߿� ó��(�� �޼ҵ带 ȣ���Ҷ� ó��)
			throw new Exception("�µ��� ������ �Դϴ�.");
			}
	
		System.out.println("�µ� ���� : " + temperature);
	}

}
