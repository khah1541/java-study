package timer_Ex3;

import java.util.Timer;

import java.util.TimerTask;
//�ϳ��� ���Ͽ� �������� Ŭ������ ����� �ִ�. �׷��� public class�� �� �ϳ��̰� ������ �̸��� ����.
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Alert extends TimerTask {

	@Override
	public void run() {
		System.out.println("��ο�");
		
	}
	
}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("����!");
		
	}




public static class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(),0 , 1000); //����:run(), 0�ʵ� ����, �ݺ� �ð���1�� (1000= 1��)

			
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
			
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS);//����,������,�ݺ��ð�,�ð�Ÿ��
		

	
	
	}
}}

