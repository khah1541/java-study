package pokemon;

public class Longston extends Rockpokemon {
	String Type;
	String Name;
	int Level;
	int BattleHp;
	int Hp;


	public Longston(String type, String name, int Level, int Hp,  int BattleHp) {
		super("�ϼ�", "�ս���", Level, Hp, BattleHp);
		this.Type = "�ϼ�";
		this.Name = "�ս���";
		this.Level = Level;
		this.BattleHp = BattleHp;
		this.Hp = Hp;
	}
}
