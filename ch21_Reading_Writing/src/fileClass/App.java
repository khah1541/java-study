package fileClass;

import java.io.File;

public class App {

	public static void main(String[] args) {
		File currentDirectory = new File("src");
		
		System.out.println(currentDirectory.getAbsolutePath());//������ (�h��������Ʈ��������)
		
		//�������� ���� ���ϵ��� �̸� ���
		for(String f : currentDirectory.list()) {
			System.out.println(f);
		}
		
	}

}
