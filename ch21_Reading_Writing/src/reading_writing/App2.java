package reading_writing;

import java.io.File;

public class App2 {

	public static void main(String[] args) {
		//파일의 절대경로를 문자열로 표시(\\로 표시됨)
		String filelocation = "C:\\Java\\java-study\\ch21_Reading_Writing";
		System.out.println(new File(filelocation).exists());//파일이 있으면 true 없으면 false로 리턴
		System.out.println();
	
	}

}
