package pokemon;

public class Firepokemon extends Pokemon {
	static int Fireattack;
	static int Firelegend;

	public Firepokemon(String type, String name, int level, int hp, int battlehp) {
		super("��", name, level, hp, battlehp);
		this.Fireattack = 10;
		this.Firelegend = 15;
		}
	
}
