package multiThread2;

public class App {

	private int value = 0;
	
	private synchronized void increment() {//synchronized �� �� �����尡 ����߿� �ٸ������� ������
		value++;
	}
	
	public void run() throws InterruptedException {
		// ��Ƽ ������

		Runnable runnable = () -> {
			for(int i =0; i < 1000; i++) {
				increment();
			}
		};
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);

		//t1.start() �޼ҵ�� t1�� runnable ���ٽ� ����
		t1.start();
		t2.start();
		t3.start();
		
		
		t1.join(); //���� �����带 �������� ����
		t2.join();
		t3.join();

		System.out.println("Value : " + value);
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		//�۰�ü�����ؼ� �޼ҵ� run����
		new App().run();
	}
	
	
}
