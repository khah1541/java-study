package multiThread;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// ��Ƽ ������

		Runnable runnable = () -> {
			for(int i=0; i<100; i++) {
				System.out.println("i : " + i);
				try {
					Thread.sleep(50); //������ �۾���� 0.5��
				} catch (InterruptedException e) {
					// ����߿� ���ܹ߻��� 
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);

		//t1.start() �޼ҵ�� t1�� runnable ���ٽ� ����
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("��ο�");
	}

}
