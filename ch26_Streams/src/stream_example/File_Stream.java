package stream_example;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class File_Stream {

	public static void main(String[] args) throws IOException {
		//lines�޼ҵ�� ������ �о ���پ� ���ڿ� ��Ʈ������ ����
		
		Files.lines(Paths.get("dra.txt")).forEach(System.out::println);

	
	}

}
