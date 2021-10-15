package application;

import java.util.Random;

public class RandomWord {
	private String books = "homework organization committee requirement intention marketing employment inspection philosophy entertainment collection database significance location weakness interaction construction personality recording depression";
	private String[] words = books.split(" ");
	
	private String selectWord;// 선택한 단어
	private Random rand = new Random();//랜덤 객체를 생성
	public RandomWord() {
		
		selectWord = words[rand.nextInt(words.length)]; //랜덤으로 단어를 선택
	}
	
	public String toString() {
		return selectWord;
	}
	
	public void getwords() {
		for(String w : words) {
			System.out.println(w);
		}
	}
			
}
