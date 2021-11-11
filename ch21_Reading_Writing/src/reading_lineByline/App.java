package reading_lineByline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		//파일의 절대경로를 문자열로 표시(\\로 표시됨)
		String filelocation = "C:\\Java\\java-study\\ch21_Reading_Writing\\test.txt";
		System.out.println(new File(filelocation).exists());//파일이 있으면 true 없으면 false로 리턴
		System.out.println();	
		
		//파일을 한줄씩 
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filelocation));
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// 파일이 파일주소에 없을때
			System.out.println("파일을 찾지 못할 : " + filelocation);
		} catch (IOException e) {
			System.out.println("파일을 읽지 못합 : " + filelocation);
			
		}
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 닫을 수 없음");
		}
	}

}
