package throwing_Exception;

import throwing_Exception_excptions.TempOutOfRangeException;
import throwing_Exception_excptions.TempTooHighException;
import throwing_Exception_excptions.TempTooLowException;

public class Thermostat {
	
	public void setTemperature(double temperature) throws TempOutOfRangeException {
		
		setMachineTemperature(temperature);
		
		System.out.println("�µ� ���� : " + temperature);
	}
	
	public void setMachineTemperature(double temperature) throws TempTooHighException,TempTooLowException {
		if(temperature < 0 ) {
			//�µ����� ���������� ���ܼ� ���� ó���Ѵ�. throw�� �ϴ� ���ܸ� ���߿� ó��(�� �޼ҵ带 ȣ���Ҷ� ó��)
			throw new TempTooLowException("�µ��� �ʹ� �����ϴ�.");//���� ����
			}
		else if(temperature > 35) {
			throw new TempTooHighException("�µ��� �ʹ� �����ϴ�");//���� ����
		}
	
	}

}
