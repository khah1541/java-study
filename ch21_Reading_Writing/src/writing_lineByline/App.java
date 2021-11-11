package writing_lineByline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		String filelocation = "C:\\Java\\java-study\\ch21_Reading_Writing\\test2.txt";
		System.out.println(new File(filelocation).exists());//파일이 있으면 true 없으면 false로 리턴
		System.out.println();
		
	 try(BufferedWriter br = new BufferedWriter(new FileWriter(filelocation))) {
		 br.write("오렌지");
		 br.newLine();
		 br.write("애플");
		 br.newLine();
		 br.write("바나나");
		 br.newLine();
		 br.write("배");
		 br.newLine();
		 
	 } catch (IOException e) {
		System.out.println("파일을 쓸수 없음 : " + filelocation);
		
	}
	 System.out.println("파일 쓰기 완료 : " + filelocation);
	}
}
