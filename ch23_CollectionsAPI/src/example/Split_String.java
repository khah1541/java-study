package example;

public class Split_String {

	public static void main(String[] args) {
		// 문자열.split(" ") = > 문자열을 공백(space)로 쪼개서 배열로 리턴
		
		String text1 = "When Joe Manchin stepped to the podium in the US Capitol on Monday afternoon, the hope among Democrats was that he was going to announce that he supported the $1.75 trillion social safety net bill -- a moment that would virtually ensure passage of the bulk of President Joe Biden's first-term domestic agenda.";
		String text2 = "오는 6일 벌어지는 2021 리그오브레전드 월드 챔피언십(롤드컵) 결승전 담원 기아와 에드워드 게이밍(EDG)의 사령탑인 꼬마 김정균 감독과 마오카이 양지쑹 감독이 동지에서 적으로 만났다";


//		String [] words = text1.split("[^a-zA-Z]+"); //정규표현식[]
		String [] words = text2.split("[^가-힣]+"); //정규표현식[]

		for(String w : words) {
			
			if(w.length()<2) continue; //한 철자이하는 빼기
			
			System.out.println(w.toLowerCase());//전부 소문자로 출력
		}
	}

}
