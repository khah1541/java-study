package throwing_Exception;


import throwing_Exception_excptions.TempOutOfRangeException;
import throwing_Exception_excptions.TempTooHighException;
import throwing_Exception_excptions.TempTooLowException;

public class App {

	public static void main(String[] args) throws TempOutOfRangeException {
		// ����ó���� �ѱ�
		Thermostat stat = new Thermostat();
		
		//setTemperature �޼ҵ忡�� ����ó���� throw �߱� ������ ȣ���Ҷ� ó���ؾ� �Ѵ�.
		//try-catch�� �ٷ� ó��, throw�� �ѱ�
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
