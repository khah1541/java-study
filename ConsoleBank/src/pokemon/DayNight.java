package pokemon;

public class DayNight extends Thread{
	private boolean isLoop;
	//�� �� �ֱ� 1�� 60000�� ���� �㳷�� �ٲ�� 
	//�� ������ ���� ���ϸ󿡰� �ִ� ������ �ٸ���. 
  
	public DayNight (boolean isLoop) {
			try {
				this.isLoop = isLoop;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		//������ ���� 
		public void close() {
			isLoop = false;
			
			this.interrupt(); // �ش� �����带 �������·� �����.
		}
		
		@Override
		public void run() {
			try {
				do {
					System.err.println("");
					System.err.println("������ '��'�Դϴ�");
					System.err.println("���̸�/�ս��� ��(��) ����ȿ��(���ݷ� ����)�� �޽��ϴ�");
					System.out.println("");
					System.out.println("");
					Choice.WildKetupi.LeafAttack -=3;
					Choice.WildAqustar.WaterAttack -=5;
					Choice.userPaili.Fireattack+=5;
					Choice.WildLongston.RockAttack+=5;
					Thread.sleep(20000);	//20��
					System.err.println("");
					System.err.println("������ '��'�Դϴ�");
					System.err.println("����Ÿ/ĳ���ǰ�  ����ȿ��(���ݷ� ����)�� �޽��ϴ�");
					System.out.println("");
					System.out.println("");
					Choice.WildKetupi.LeafAttack +=3;
					Choice.WildAqustar.WaterAttack +=5;
					Choice.userPaili.Fireattack-=5;
					Choice.WildLongston.RockAttack-=5;
					Thread.sleep(20000);	//20��
				}while(isLoop); //isLoop�� true���̸� ���� �ݺ� 
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

