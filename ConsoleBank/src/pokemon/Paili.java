package pokemon;

public class Paili extends Firepokemon {
	String Type;
	String Name;
	int Level;
	int BattleHp;
	int Hp;
	int Exp;

	public Paili(String Type, String Name, int Level, int Hp, int BattleHp, int Exp) {
		super(Type, Name, Level, Hp, BattleHp);
		this.Type = "��";
		this.Name = "���̸�";
		this.Level = 5;
		this.BattleHp = 40;
		this.Hp = 40;
		this.Exp = 0;
	}

	// ���� ���ϸ� ���̸� ����ġ
	public void Exp() {
		if (Exp >= 100) {
			System.out.println("=========================================");
			System.out.println("���ϸ��� ���� �� �߽��ϴ�!!! ");
			System.out.println("���ϸ��� ü���� +10 �����߽��ϴ�!!! ");
			System.out.println("���ϸ��� ���ݷ��� +3 �����߽��ϴ�!!! ");
			System.out.println("=========================================");
			Level++; // Exp 100�̻��� �� ���� 1����
			Exp = 0; // Exp 0���� �ʱ�ȭ
			Hp += 10; // Hp +10����
			Firepokemon.Fireattack += 3; // ���ݷ� +3����
			if (Level == 6) {
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("---------------------------------");
				System.out.println("���ϸ��� ��ȭ�մϴ�.");
				System.out.println("���̸��� ���ڵ�� ��ȭ�Ͽ����ϴ�!");
				System.out.println("---------------------------------");
				User.pokemonlist.remove(Choice.userPaili.Name);
				Choice.userPaili.Name = "���ڵ�";
				User.pokemonlist.add(Choice.userPaili.Name);
			}
			if (Level == 7) {
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("---------------------------------");
				System.out.println("���ϸ��� ��ȭ�մϴ�.");
				System.out.println("���ڵ尡 ���ڸ����� ��ȭ�Ͽ����ϴ�!");
				System.out.println("---------------------------------");
				User.pokemonlist.remove(Choice.userPaili.Name);
				Choice.userPaili.Name = "���ڸ�";
				User.pokemonlist.add(Choice.userPaili.Name);
			}

		}
	}
}
