package shoppingmall;

public class StartShopping {

	public static void main(String[] args) {
		
		MyShop myshop = new MyShop();
		
		myshop.setTitle("11¹ø°¡");
		myshop.genProduct();
		myshop.setExistingUsers("Á¶ÀçÈñ", "±ÇÇõÃµ", myshop.existingUsers);
		myshop.initAlarm();
	}

}
