package array;

public class Bacteria {

	public static void main(String[] args) {
		//�迭����
		int[] bacteriaCountLogs = new int[10];
		
		//��ü �� ���
		writeLog(bacteriaCountLogs);
		
		//��� ���
		printLog(bacteriaCountLogs);
		

	}	
	private static void writeLog(int[] Logs) {
		for(int i = 0; i <10; i++) {
			Logs[i] = (int)Math.pow(2, i);
			}
		}
		
	


	private static void printLog(int[] arr) {
		System.out.printf("[");
		for (int i = 0; i <arr.length; i++) {
			System.out.printf("%d",arr[i]);
			if (i != arr.length -1) {
				System.out.printf(", ");
			}
		}
		System.out.printf("]");
		
	}


}
