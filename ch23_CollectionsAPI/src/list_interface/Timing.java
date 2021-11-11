package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.management.RuntimeOperationsException;

public class Timing {

	public static void main(String[] args) {
		//

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		// 클래스 가져올때 단축키 컨트롤+스페이스 , 여러개 한꺼번에 컨트롤+쉬프트+o
		
		long duration = timeOperation(linkedList);
		
		System.out.println("측정시간  : " + duration);
		// 그냥 순서대로 추가할때 어레이리스트가 링크드 보다 5배이상 빠르다
		// 특정 위치에 추가 또는 제거 할때 링크드 리스트가 10배는 빠르다
		
	}

	private static long timeOperation(List<Integer> List) {
		// 입력받은 리스트로 실행시간을 측정해서 리턴
		long start = System.currentTimeMillis(); //현재 시간을 1/1000초 단위로 측정
		
		int total = 0;
		for(int i = 0; i < 100000; i++) {
			List.add(0,i);
		}	return System.currentTimeMillis() - start; //작업이 끝난 다음에 측정시간 - 이전시간
	}
	}

