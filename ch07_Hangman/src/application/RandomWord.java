package application;

import java.util.Random;

public class RandomWord {
	private String books = "homework organization committee requirement intention marketing employment inspection philosophy entertainment collection database significance location weakness interaction construction personality recording depression";
	private String[] words = books.split(" ");
	
	private String selectWord;// ������ �ܾ�
	private Random rand = new Random();//���� ��ü�� ����
	public RandomWord() {
		
		selectWord = words[rand.nextInt(words.length)]; //�������� �ܾ ����
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
