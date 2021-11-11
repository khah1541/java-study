package method;

public class Elevator {

	public static void main(String[] args) {
		int a = 13;
		int b = 7;
		int c = 1;
	
		System.out.printf("%d類 -> %s 縣溯漆檜攪\n", a, guide(a));
		System.out.printf("%d類 -> %s 縣溯漆檜攪\n", b, guide(b));
		System.out.printf("%d類 -> %s 縣溯漆檜攪\n", c, guide(c));

	}

	private static String guide(int floor) {
		// TODO Auto-generated method stub
		return (floor > 10 ) ? "堅類" : "盪類";
	}


	}


