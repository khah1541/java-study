package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		// ���ٽ� ������ ����Ʈ�� ����� ����
		List<String> list = new ArrayList<>();
		list.add("�ϳ�");
		list.add("��");
		list.add("��");
		
		//����Ʈ�� forEach �޼ҵ��� �Ű������� consumer �������̽� ��ü�̴�
		//�������̽��δ� ��ü�� ����� ���� ������ �͸�Ŭ������ ����� �׾ȿ� �߻�޼ҵ带 �ϼ��ϸ� �ȴ�.
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// Consumer �������̽��� �߻�޼ҵ� (������ �ؾ��Ѵ�.)
				System.out.print(t);
				System.out.println(" ");				
			}
		});
	
		//���ٽ����� �����ϰ�
		list.forEach((s)->
			System.out.print(s)
			
		);
		
		
	}

}
