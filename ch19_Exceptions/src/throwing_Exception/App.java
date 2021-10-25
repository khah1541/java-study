package throwing_Exception;

public class App {

	public static void main(String[] args) throws Exception {
		// 예외처리를 넘김
		Thermostat stat = new Thermostat();
		
		//setTemperature 메소드에서 예외처리를 throw 했기 때문에 호출할때 처리해야 한다.
		//try-catch는 바로 처리, throw는 넘김
		try{stat.setTemperature(40);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
