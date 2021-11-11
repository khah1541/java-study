package reading_lineByline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		//������ �����θ� ���ڿ��� ǥ��(\\�� ǥ�õ�)
		String filelocation = "C:\\Java\\java-study\\ch21_Reading_Writing\\test.txt";
		System.out.println(new File(filelocation).exists());//������ ������ true ������ false�� ����
		System.out.println();	
		
		//������ ���پ� 
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filelocation));
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// ������ �����ּҿ� ������
			System.out.println("������ ã�� ���� : " + filelocation);
		} catch (IOException e) {
			System.out.println("������ ���� ���� : " + filelocation);
			
		}
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������ ���� �� ����");
		}
	}

}
