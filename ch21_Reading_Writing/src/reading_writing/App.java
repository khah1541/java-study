package reading_writing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		// �ؽ�Ʈ ���� �а� ����
		File currentDirectory = new File(".");
	
//		for(String f : currentDirectory.list()) {
//				System.out.println(f);
//		}
		
		//�ؽ�Ʈ ���� ����
		String text = "��ο�! \n ȭ �� �� ?";
		
		Path path = Paths.get("text.txt");
		Files.write(path, text.getBytes()); //Files.write(�����ּ�,��������)

		//���� �б�
		String recivedText = Files.readString(path);
		System.out.println(recivedText);
		
	}

}
