package throwing_Exception;

public class App {

	public static void main(String[] args) throws Exception {
		// ����ó���� �ѱ�
		Thermostat stat = new Thermostat();
		
		//setTemperature �޼ҵ忡�� ����ó���� throw �߱� ������ ȣ���Ҷ� ó���ؾ� �Ѵ�.
		//try-catch�� �ٷ� ó��, throw�� �ѱ�
		try{stat.setTemperature(40);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
