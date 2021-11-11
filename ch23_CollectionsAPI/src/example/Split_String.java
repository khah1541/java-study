package example;

public class Split_String {

	public static void main(String[] args) {
		// ���ڿ�.split(" ") = > ���ڿ��� ����(space)�� �ɰ��� �迭�� ����
		
		String text1 = "When Joe Manchin stepped to the podium in the US Capitol on Monday afternoon, the hope among Democrats was that he was going to announce that he supported the $1.75 trillion social safety net bill -- a moment that would virtually ensure passage of the bulk of President Joe Biden's first-term domestic agenda.";
		String text2 = "���� 6�� �������� 2021 ���׿��극���� ���� è�Ǿ��(�ѵ���) ����� ��� ��ƿ� ������� ���̹�(EDG)�� ���ž�� ���� ������ ������ ����ī�� ������ ������ �������� ������ ������";


//		String [] words = text1.split("[^a-zA-Z]+"); //����ǥ����[]
		String [] words = text2.split("[^��-�R]+"); //����ǥ����[]

		for(String w : words) {
			
			if(w.length()<2) continue; //�� ö�����ϴ� ����
			
			System.out.println(w.toLowerCase());//���� �ҹ��ڷ� ���
		}
	}

}
