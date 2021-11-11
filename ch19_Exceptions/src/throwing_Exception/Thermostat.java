package throwing_Exception;

import throwing_Exception_excptions.TempOutOfRangeException;
import throwing_Exception_excptions.TempTooHighException;
import throwing_Exception_excptions.TempTooLowException;

public class Thermostat {
	
	public void setTemperature(double temperature) throws TempOutOfRangeException {
		
		setMachineTemperature(temperature);
		
		System.out.println("온도 세팅 : " + temperature);
	}
	
	public void setMachineTemperature(double temperature) throws TempTooHighException,TempTooLowException {
		if(temperature < 0 ) {
			//온도값이 비정상으로 여겨서 예외 처리한다. throw는 일단 예외를 나중에 처리(이 메소드를 호출할때 처리)
			throw new TempTooLowException("온도가 너무 낮습니다.");//예외 생성
			}
		else if(temperature > 35) {
			throw new TempTooHighException("온도가 너무 높습니다");//예외 생성
		}
	
	}

}
