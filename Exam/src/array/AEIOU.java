package array;

public class AEIOU {

	public static void main(String[] args) {
		// ���� ����
		String s = "Programming is fun! right";
		
		// ���� ���� ���� ����
		int[] result = count(s);
		
		//��� ���
		System.out.printf("%s\n => ���� %d��, ���� %d��",s,result[0],result[1]);
	}
		public static int[] count(String str) {
			int conso = 0; //����
			int vowel = 0; //����
		//���ڿ��� ������ �迭�� ����	
		char[] characters = str.toUpperCase().toCharArray();
		
		//��� ���� �迭�� ��ȸ�ϸ� �˻�
		for(int i = 0; i < characters.length; i++) {
			switch(characters[i]) {
			//����
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowel++;
				break;
		
			//���� �� Ư�� ���� ����
			case ' ': //�����̽�
			case '\t': //��
			case '\n': //����
			case ',': //�޸�
			case '.': //��
			case '!':
			case '?':
				break;
				
				//�� ��(����)
				default:
					conso++;
					break;
			}
		}
		return new int[] {conso,vowel};
		}


}

