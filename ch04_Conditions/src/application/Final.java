package application;

public class Final {

	public static void main(String[] args) {
		// 상수 키워드 Final 변하지 않는 변수, 이름을 대문자로 만듬
		final int VALUE = 9;
		//VALUE = 10;   final 변수는 다른값을 넣을수 없다
		
		System.out.println(VALUE);
		
		final String USER_PASSWORD = "abc";
		
		System.out.println(USER_PASSWORD);

	}

}
