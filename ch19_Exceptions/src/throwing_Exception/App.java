package throwing_Exception;


import throwing_Exception_excptions.TempOutOfRangeException;
import throwing_Exception_excptions.TempTooHighException;
import throwing_Exception_excptions.TempTooLowException;

public class App {

	public static void main(String[] args) throws TempOutOfRangeException {
		// 예외처리를 넘김
		Thermostat stat = new Thermostat();
		
		//setTemperature 메소드에서 예외처리를 throw 했기 때문에 호출할때 처리해야 한다.
		//try-catch는 바로 처리, throw는 넘김
		try{
			stat.setTemperature(-5);
		}catch (TempTooHighException e) {
			System.out.println(e.getMessage());

		} catch (TempTooLowException e) {
			// 
			System.out.println(e.getMessage());
		} 
		
		

	}

}
