package example;

import java.util.ArrayList;
import java.util.List;

public class App3 {
	public static void main(String[] args) {
		// �޼ҵ� ���۷����� ���ٽ� ��ü
		List<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(6);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		numbers.add(6);
		numbers.add(3);

		numbers.removeIf(App3::filter);
		numbers.replaceAll(App3::map);

		numbers.forEach(System.out::println);

	}
	//�޼ҵ� ���۷��� 1.static 2.���ϰ� �Ű������� �����
	private static boolean filter(Integer n) {
		return n < 5;

	}
	private static Integer map (Integer n) {
		return n*2  ;
	}
}
