package timer_Ex3;

import java.util.Timer;

import java.util.TimerTask;
//하나의 파일에 여러개의 클래스를 만들수 있다. 그렌데 public class는 단 하나이고 파일의 이름과 같다.
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Alert extends TimerTask {

	@Override
	public void run() {
		System.out.println("헬로우");
		
	}
	
}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("하이!");
		
	}




public static class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(),0 , 1000); //할일:run(), 0초뒤 실행, 반복 시간은1초 (1000= 1초)

			
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
			
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS);//할일,딜레이,반복시간,시간타입
		

	
	
	}
}}

