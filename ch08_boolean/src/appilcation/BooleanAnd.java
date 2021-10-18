package appilcation;

public class BooleanAnd {

	public static void main(String[] args) {
		// ==(같다), !=(같지않다), !(반대), &&(and), ||(or)
		
		boolean isRaining = true; // 비가 오는가?
		boolean haveUmbrella = false; //우산이 있는가?
		boolean takeUmbrella =  false;// 우산을 쓰나?
		//1. 비가 오고 우산이 있으면 우산을 쓴다.
		//isRaning가 false 이면 비가 오지않는것이기 때문에 우산을 쓸필요가없다 false!
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println("첫번째 경우 : " + takeUmbrella);
		
		
		// 2.And 연산자 &&
		if (isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("AND 사용시 : " + takeUmbrella);
		
		// 3.삼항조건 연산자
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		
		System.out.println("삼항조건 사용 : " + takeUmbrella);

	}

}
