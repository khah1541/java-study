package classes;

public class Minertest {

	public static void main(String[] args) {
		//1. �� ���� ��ü�� �����ϼ���.
		Miner malon = new Miner("����");
		Miner gloria = new Miner("�۷θ���");
		
		//2. ������ ä���ϼ���
		//ä�� �޼ҵ带 ����ؼ� ������ ��ü�� ���μ��� �ø���.
		for(int coins = 0 ; coins <= 3 ; coins++) {
			System.out.println(malon.coins);
		}
		
	
	
		//3. ��ü ������ ����ϼ���
		
	
	
	}

}
class Miner{
	//�ʵ� (�ν��Ͻ� ����)
	String name;
	int coins;

	//������
	public Miner(String str) {
		name = str;
		coins= 0;
	}
	//�޼ҵ�(�ν��Ͻ� �޼ҵ�) - ��ü�� ������ ���ڿ��� ��ȯ
	public String toString() {
		return String.format("Miner { name: %s,coins: %d}",name,coins);
	}
	
	public void mine() {
		coins +=1;
	}
}

