package pokemon;

public class Pokemon {

	String Type; // �Ӽ�(��,��,Ǯ,�ϼ�)
	String Name;
	int Level;
	static int Hp; // HP-ü��
	static int BattleHp; // �ο� �� �پ��� HP
	

	public Pokemon(String Type, String Name, int Level, int Hp, int BattleHp) {
		super();
		this.Type = Type;
		this.Name = Name;
		this.Level = Level;
		this.Hp = Hp;
		this.BattleHp = BattleHp;
		
	}
}
