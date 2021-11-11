package classes;

public class Minertest {

	public static void main(String[] args) {
		//1. 두 갱부 객체를 생성하세요.
		Miner malon = new Miner("말런");
		Miner gloria = new Miner("글로리아");
		
		//2. 코인을 채굴하세요
		//채굴 메소드를 사용해서 각각의 객체의 코인수를 늘린다.
		for(int coins = 0 ; coins <= 3 ; coins++) {
			System.out.println(malon.coins);
		}
		
	
	
		//3. 객체 정보를 출력하세요
		
	
	
	}

}
class Miner{
	//필드 (인스턴스 변수)
	String name;
	int coins;

	//생성자
	public Miner(String str) {
		name = str;
		coins= 0;
	}
	//메소드(인스턴스 메소드) - 객체의 정보를 문자열로 반환
	public String toString() {
		return String.format("Miner { name: %s,coins: %d}",name,coins);
	}
	
	public void mine() {
		coins +=1;
	}
}

