package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	public static void greet() {
		System.out.println("��ο�");
	}
	
	public static void main(String[] args) {
		// �޼ҵ� ���۷����� ���ٽ� ��ü
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		
		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);
									//Ŭ�����̸�::�޼ҵ��̸�(�Ű�����x)
		
	}

}
