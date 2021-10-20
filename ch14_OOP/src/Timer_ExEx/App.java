package Timer_ExEx;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class SK implements Runnable{

	@Override
	public void run() {
		
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");
	}
	
}

class Task extends TimerTask{

	@Override
	public void run() {
		System.out.println("계란 삶는중");
		
	}
	
	
}

public class App {

	public static void main(String[] args) {
		

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 5000, 5000);
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new SK(), 30, 30, TimeUnit.SECONDS);
		
		
		
	}

}
