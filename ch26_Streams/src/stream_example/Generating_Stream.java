package stream_example;

import java.util.stream.Stream;

public class Generating_Stream {

	public static void main(String[] args) {
		//Stream.of()�� ����� �����ϰ� ��Ʈ�� ����
		Stream.of(1,2,3).forEach(System.out::println);
		Stream.of("�ϳ�","��","��").forEach(System.out::println);

		//Stream.generate(���ٽ�)���� ����
		Stream.generate(() ->"��ο�").limit(5).forEach(System.out::println);
		
	}

}
