package shoppingmall;

public class StartShopping {

	public static void main(String[] args) {
		
		MyShop myshop = new MyShop();
		
		myshop.setTitle("11����");
		myshop.genProduct();
		myshop.setExistingUsers("������", "����õ", myshop.existingUsers);
		myshop.initAlarm();
	}

}
