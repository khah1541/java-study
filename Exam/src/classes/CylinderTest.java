package classes;

public class CylinderTest {

	public static void main(String[] args) {
		//°´Ã¼ »ı¼º
		Cylinder c = new Cylinder();
		
		//¼Ó¼º°ª ÀÔ·Â
		c.radius = 4;
		c.height = 5;
		
		//Ãâ·Â
		System.out.printf("¿ø±âµÕÀÇ ºÎÇÇ : %.2f\n", c.getVolume());
		System.out.printf("¿ø±âµÕÀÇ °Ñ³ĞÀÌ : %.2f\n", c.getArea());
	}

}

class Cylinder {
	int radius;
	int height;
	
	double getVolume() {
		return Math.PI*radius*radius*height; 
	}
	double getArea() {
		return 2*(Math.PI*radius*radius)+2*(Math.PI*height*radius);
	}
}
