package reading_writing;

import java.io.File;

public class App2 {

	public static void main(String[] args) {
		//������ �����θ� ���ڿ��� ǥ��(\\�� ǥ�õ�)
		String filelocation = "C:\\Java\\java-study\\ch21_Reading_Writing";
		System.out.println(new File(filelocation).exists());//������ ������ true ������ false�� ����
		System.out.println();
	
	}

}
