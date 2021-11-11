package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		// å ������ �ҷ��ͼ� �ܾ�� ���� ���
		File wordsdra = new File("dra.txt");

		System.out.println(wordsdra.exists());

		TreeSet<String> dralist = loadWords(wordsdra);
	
		System.out.println(dralist.size());

		displayWord(dralist);
		
	}
	private static void displayWord(TreeSet<String>dra) {
		//Ʈ������ �Է¹޾� �� �ȿ� �ܾ���� ����Ѵ�
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
		//������ �Է��ϸ� �о �ܾ���� TreeSet���� ����
		TreeSet<String> wordSet = new TreeSet<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = null;
			while((line = br.readLine()) != null){
				String[] words = line.split("[^a-zA-Z]+");
		
			for(String w : words) {
				if(w.length()<2) continue;
				wordSet.add(w.toLowerCase()); //�ܾ���� �ҹ��ڷ� ����Ʈ�� �߰�
			
			}
		
			
		}
	}
		
		return wordSet;
	}
}
