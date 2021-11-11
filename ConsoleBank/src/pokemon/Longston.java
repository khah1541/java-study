package pokemon;

public class Longston extends Rockpokemon {
	String Type;
	String Name;
	int Level;
	int BattleHp;
	int Hp;


	public Longston(String type, String name, int Level, int Hp,  int BattleHp) {
		super("¾Ï¼®", "·Õ½ºÅæ", Level, Hp, BattleHp);
		this.Type = "¾Ï¼®";
		this.Name = "·Õ½ºÅæ";
		this.Level = Level;
		this.BattleHp = BattleHp;
		this.Hp = Hp;
	}
}
