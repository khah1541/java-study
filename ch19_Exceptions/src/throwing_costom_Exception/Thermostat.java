package throwing_costom_Exception;

public class Thermostat {
	
	public void setTemperature(double temperature) throws Exception {
		
		if(temperature < 0 || temperature >35) {
			//온도값이 비정상으로 여겨서 예외 처리한다. throw는 일단 예외를 나중에 처리(이 메소드를 호출할때 처리)
			throw new Exception("온도가 비정상 입니다.");
			}
	
		System.out.println("온도 세팅 : " + temperature);
	}

}
