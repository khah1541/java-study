package game.objects;

public enum GameObject {
	
	����, ���� ,�� ;
	private int[][] comparison = {
			//����(0)	����(1)	  ��(2)
/* ����(0) */		{	0,	-1,	  1 },
/* ����(1) */		{	1,	 0,	 -1 },
/* �� (2)*/			{  -1,	 1,	  0 }
	
	
	};

	public int compare(GameObject ob) {
		return comparison[this.ordinal()][ob.ordinal()];
		
	}
	
}
