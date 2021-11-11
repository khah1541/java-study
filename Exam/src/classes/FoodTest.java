package classes;

public class FoodTest {

	public static void main(String[] args) {
		// 음식 개체 생성
		Food chicken = new Food("치킨",18000);
		Food pizza = new Food("피자",20000);
		Food sushi = new Food("초밥",22000);
		
		//객체 배열에 음식 담기
		Food[] foods = {chicken, pizza, sushi};
		
		//모든 음식 정보 출력
		for(int i = 0 ; i < foods.length; i++) {
			System.out.println(foods[i].toString());
		}
	}

}
class Food{
	String name;
	int price;
	
	Food(String name, int price){
		this.name = name;
		this.price = price;
		
	}
	public String toString() {
		return "name: " +name +"price: " + price ;

	}
	
}
