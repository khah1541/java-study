package arrays_asList;

import java.util.List;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// �迭�� ����Ʈ��
		List<String> names = Arrays.asList("Eric","Elena","Java");
		
		names.stream()
			.filter(name -> name.contains("a"))
			.map(String::toUpperCase)	//�빮��
			.forEach(System.out::println);//���
		
		List<Integer> numbers =Arrays.asList(9,4,6,3,2,1);
		
		numbers.stream()
			.filter(n -> n > 3)
			.sorted()
			.map(n -> n*10)
			.forEach(System.out::println);
		
				
	}

}
