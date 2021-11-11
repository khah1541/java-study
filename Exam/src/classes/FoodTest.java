package classes;

public class FoodTest {

	public static void main(String[] args) {
		// ���� ��ü ����
		Food chicken = new Food("ġŲ",18000);
		Food pizza = new Food("����",20000);
		Food sushi = new Food("�ʹ�",22000);
		
		//��ü �迭�� ���� ���
		Food[] foods = {chicken, pizza, sushi};
		
		//��� ���� ���� ���
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
