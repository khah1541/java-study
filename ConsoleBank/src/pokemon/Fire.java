package pokemon;

public class Fire extends Firepokemon {
	String Type;
	String Name;
	int Level;
	int BattleHp;
	int Hp;


	public Fire(String Type, String Name, int Level, int Hp, int Battlehp) {
		super(Type, Name, Level, Hp, Battlehp);
		// TODO Auto-generated constructor stub
		this.Type = "��";
		this.Name = "���̾�";
		this.Level = 30;
		this.BattleHp = 150;
		this.Hp = 150;
	}
     
	

	public void fireskill() {
		if( this.BattleHp <= 30) {
			System.out.println("���̾��� Ư���ɷ��� �ߵ��Ǿ����ϴ�.");
			System.out.println("���ݷ°� Hp�� �ö󰩴ϴ�");
			Firepokemon.Firelegend+=5;		//�����ϸ� ���̾� ��� ���� +5
			this.BattleHp +=10;				//���̾� HP +10
		}
		
	}

	
}
