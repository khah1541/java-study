package throwing_Exception_excptions;

//�µ��� �ʹ� ���� ��� �߻���ų ����
public class TempTooHighException extends TempOutOfRangeException {
	private static final long serialVersionUID = 1L;
	
	public TempTooHighException(String message) {
		//������ ���� �޼����� ���� ����Ŭ������ ó��
		super(message);	//����Ŭ�������� �޼��������� ���ܸ� ����
		
	}
}
