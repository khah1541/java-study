package example;

public class Split_String {

	public static void main(String[] args) {
		// ¹®ÀÚ¿­.split(" ") = > ¹®ÀÚ¿­À» °ø¹é(space)·Î ÂÉ°³¼­ ¹è¿­·Î ¸®ÅÏ
		
		String text1 = "When Joe Manchin stepped to the podium in the US Capitol on Monday afternoon, the hope among Democrats was that he was going to announce that he supported the $1.75 trillion social safety net bill -- a moment that would virtually ensure passage of the bulk of President Joe Biden's first-term domestic agenda.";
		String text2 = "¿À´Â 6ÀÏ ¹ú¾îÁö´Â 2021 ¸®±×¿Àºê·¹Àüµå ¿ùµå Ã¨ÇÇ¾ğ½Ê(·ÑµåÄÅ) °á½ÂÀü ´ã¿ø ±â¾Æ¿Í ¿¡µå¿öµå °ÔÀÌ¹Ö(EDG)ÀÇ »ç·ÉÅ¾ÀÎ ²¿¸¶ ±èÁ¤±Õ °¨µ¶°ú ¸¶¿ÀÄ«ÀÌ ¾çÁö¾« °¨µ¶ÀÌ µ¿Áö¿¡¼­ ÀûÀ¸·Î ¸¸³µ´Ù";


//		String [] words = text1.split("[^a-zA-Z]+"); //Á¤±ÔÇ¥Çö½Ä[]
		String [] words = text2.split("[^°¡-ÆR]+"); //Á¤±ÔÇ¥Çö½Ä[]

		for(String w : words) {
			
			if(w.length()<2) continue; //ÇÑ Ã¶ÀÚÀÌÇÏ´Â »©±â
			
			System.out.println(w.toLowerCase());//ÀüºÎ ¼Ò¹®ÀÚ·Î Ãâ·Â
		}
	}

}
