package pokemon;

public class Aqustar extends Waterpokemon {
	String Type;
	String Name;
	int Level;
	int BattleHp;
	int Hp;

	public Aqustar(String Type, String Name, int Level, int Hp, int BattleHp) {
		super(Type, Name, Level, Hp, BattleHp);
		this.Type = "��";
		this.Name = "����Ÿ";
		this.Level = Level;
		this.BattleHp = BattleHp;
		this.Hp = Hp;
	}
	
}
