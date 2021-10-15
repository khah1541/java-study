package school;

public class Student {
	//����
	private String name;
	private int age;
	private boolean isVisible; //��ü true , ���� false
	private double temperature;
	
	//������
	public Student() {
		//�⺻ ������
		name  = "�̸���";
		age = 18;
		isVisible = false;
		temperature = 36.0;
	}
	
	public Student(String name, int age, boolean isVisible, double temperature) {
		super();
		this.name = name;
		this.age = age;
		this.isVisible = isVisible;
		this.temperature = temperature;
	}
	// ���� ���� �ڵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Person [�̸�=" + name + ", ����=" + age + ", ��ü=" + isVisible + ", �µ�=" + temperature
				+ "]";
	}
	
	
	

	
}