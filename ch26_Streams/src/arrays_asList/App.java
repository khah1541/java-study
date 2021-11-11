package arrays_asList;

import java.util.List;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// 배열을 리스트로
		List<String> names = Arrays.asList("Eric","Elena","Java");
		
		names.stream()
			.filter(name -> name.contains("a"))
			.map(String::toUpperCase)	//대문자
			.forEach(System.out::println);//출력
		
		List<Integer> numbers =Arrays.asList(9,4,6,3,2,1);
		
		numbers.stream()
			.filter(n -> n > 3)
			.sorted()
			.map(n -> n*10)
			.forEach(System.out::println);
		
				
	}

}
