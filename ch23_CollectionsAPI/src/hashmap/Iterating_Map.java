package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Iterating_Map {

	public static void main(String[] args) {
		// �ݹ������� ���� �����۵��� ���� �д� ���
		HashMap<String, String> months = new HashMap<>();
		months.put("JAN", "1��");
		months.put("FEB", "2��");
		months.put("MAR", "3��");
		months.put("APR", "4��");
		months.put("MAY", "5��");
		months.put("JUN", "6��");
		months.put("JUL", "7��");
		
		//1. ���ٽ�
		months.forEach((k,v) ->System.out.println(k + ": " + v));
		System.out.println();
		
		// 2. entrySet() : key�� value ���� ������
		for(Map.Entry<String,String> entry  :  months.entrySet()) {
			var k = entry.getKey(); //Ű��
			var v = entry.getValue(); // value��
			System.out.println(k + ": " + v);
		}
		
		System.out.println();
		// 3. keySet() : key ���� ������
		for(String k : months.keySet()) {
			String v = months.get(k);
			System.out.println(k + ": " + v);
		}
	
	}
}
