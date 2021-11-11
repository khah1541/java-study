package writing_lineByline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		String filelocation = "C:\\Java\\java-study\\ch21_Reading_Writing\\test2.txt";
		System.out.println(new File(filelocation).exists());//������ ������ true ������ false�� ����
		System.out.println();
		
	 try(BufferedWriter br = new BufferedWriter(new FileWriter(filelocation))) {
		 br.write("������");
		 br.newLine();
		 br.write("����");
		 br.newLine();
		 br.write("�ٳ���");
		 br.newLine();
		 br.write("��");
		 br.newLine();
		 
	 } catch (IOException e) {
		System.out.println("������ ���� ���� : " + filelocation);
		
	}
	 System.out.println("���� ���� �Ϸ� : " + filelocation);
	}
}
