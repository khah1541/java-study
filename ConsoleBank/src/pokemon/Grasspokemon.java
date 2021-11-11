package pokemon;

public class Grasspokemon extends Pokemon {
	int LeafAttack;

	public Grasspokemon(String type, String name, int level, int hp, int battlehp) {
		super("Ǯ", name, level, hp, battlehp);
		this.LeafAttack = 8;
	}

}
