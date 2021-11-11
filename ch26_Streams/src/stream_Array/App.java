package stream_Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// ���ڿ��� �迭 ��Ʈ��
		Stream.of("��ο�","����","������ī")
			.sorted() //����: �ѱۼ�
			.findFirst()	//ù��°
			.ifPresent(x -> System.out.println(x));//if�����ϸ� ��� (������ ���x)
	
	System.out.println();
	
	String[] items = {"ġŲ","������","����","ġ��","����","ġ��","�����"};
	Stream.of(items)
		.filter(x -> x.startsWith("ġ")) //predicate ��ü ��,�������� ���͸�
		.sorted()	//����
		.forEach(x -> System.out.print(x+ ", "));
	
	System.out.println();
	
	Arrays.stream(new int[] {2,4,6,8,10})
		.filter(x -> x < 5)
		.map(x -> x*x)	//������ �ؼ� ����
		.average() 	//��հ�
		.ifPresent(n ->System.out.print(n));
	
	// �迭�� ����Ʈ�� �ٲٴ� ��� Arrays.asList(�迭)
	List<String> list = Arrays.asList(items);
	list.stream()
		.filter(x -> x.startsWith("��"))
		.sorted()
		.forEach(x -> System.out.println(x + ", "));
	
	//�迭�� Stream.of(�迭) ��Ʈ�� ����, ����Ʈ�� stream() ����
	//filter(x ->) ������ ���̸� ����� �ƴϸ� ����
	//sorted(����)
	//map( x -> ���ϰ�) ������ ���� ���ϰ����� �ٲ�
	
	
	}

}
