package step01;

public class Parent extends Object{ //Object Ŭ������ ����ϴ� parent  Object�� ��� ���� !  //�ڵ�����
	 String name;
	 int age;
	
	public Parent() { //�⺻ ������
		super(); // Object ��ü�� ���� // �ڵ� ����  
		System.out.println("�θ��� �⺻ ������");
	} // name , age ���� ������ ��밡���ϰ� heap ��ü ���ο� ����
		//Parent ��ü ���� �Ϸ�
	
	public Parent(String name, int age) { //������
		super();  //�ڵ�����
		this.name = name;
		this.age = age;
		System.out.println("�θ��� ������");

	}
	public void printAll() {
		System.out.println(name);
		System.out.println(age);
	}

}
