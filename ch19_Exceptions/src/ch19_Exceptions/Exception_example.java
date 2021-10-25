package ch19_Exceptions;

public class Exception_example {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("하나");
		Thread.sleep(2000); // 2초동안 프로그램 대기
		System.out.println("둘");

	}

}
