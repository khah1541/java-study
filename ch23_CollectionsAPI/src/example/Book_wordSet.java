package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		// 책 파일을 불러와서 단어로 정렬 출력
		File wordsdra = new File("dra.txt");

		System.out.println(wordsdra.exists());

		TreeSet<String> dralist = loadWords(wordsdra);
	
		System.out.println(dralist.size());

		displayWord(dralist);
		
	}
	private static void displayWord(TreeSet<String>dra) {
		//트리셋을 입력받아 그 안에 단어들을 출력한다
		int count = 0;
		for(String w : dra) {
			if(w.length()>6) {
			System.out.printf("%-10s \t",w);
			count++;
				if(count == 6) {
					System.out.println();
					count = 0;
				}
			}
		}
		
		
	}
	private static TreeSet<String> loadWords(File file) throws FileNotFoundException, IOException{
		//파일을 입력하면 읽어서 단어들을 TreeSet으로 리턴
		TreeSet<String> wordSet = new TreeSet<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = null;
			while((line = br.readLine()) != null){
				String[] words = line.split("[^a-zA-Z]+");
		
			for(String w : words) {
				if(w.length()<2) continue;
				wordSet.add(w.toLowerCase()); //단어들을 소문자로 리스트에 추가
			
			}
		
			
		}
	}
		
		return wordSet;
	}
}
