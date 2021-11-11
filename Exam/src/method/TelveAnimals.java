package method;

public class TelveAnimals {

	public static void main(String[] args) {
		printAnimal(1986);
		printAnimal(1990);
		printAnimal(2000);

	}

	private static void printAnimal(int birthYear) {
		String animal = "";
		switch (birthYear % 12) {
		case 0:
			animal = "¿ø¼þÀÌ";
			break;
		case 1:
			animal = "´ß";
			break;
		case 2:
			animal = "°³";
			break;
		case 3:
			animal = "µÅÁö";
			break;
		case 4:
			animal = "Áã";
			break;
		case 5:
			animal = "¼Ò";
			break;
		case 6:
			animal = "È£¶ûÀÌ";
			break;
		
		default :
			animal = "¿¡·¯!";
			break;
		}
		System.out.printf("%d³â => %s¶ì\n" , birthYear,animal);
	}
	

}
