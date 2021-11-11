package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {

	public static void main(String[] args) {
	//	HashSet, LinkedHashSet, TreeSet ��������, ��������, ���ĵ�
	//	HashMap, LinkedHashMap, TreeMap ��������, ��������, ���ĵ�
		Map<Integer, String> months1 = new LinkedHashMap<>();
		
		months1.put(1, "1��");
		months1.put(3, "3��");
		months1.put(6, "6��");
		//��ũ�� �ؽø��� �Է¼����� ��µ�
		months1.forEach((k,v) -> System.out.println(k + ": " + v));
		
		System.out.println();
		
		Map<Integer,String>months2 = new TreeMap<>();
		
		months2.put(3, "3��");
		months2.put(6, "6��");
		months2.put(1, "1��");
		// Ʈ������ ���ĵ�(Ű ������ ����
		months2.forEach((k,v)->System.out.println(k + ": " + v));
	}

}
