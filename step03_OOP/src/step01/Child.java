package step01;

public class Child extends Parent{ // ���� ���� Object �� ������ �ִ� �޼ҵ� 11���� Parent �� ������ �ִ� �޼ҵ� 1���� �� 12���� �������ִ�.
	String job;
	
	Child(){
//		super(); // ���⼭ �θ� ������ �Ѿ��. 
									//Object -> Parent(name,age) ->Child(job) �θ���� ����
									//������ ��ġ�� �̵�
		super("â��",28);
		System.out.println("�ڽ��� �⺻ ������");
	}

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.name);
		c.name = "��";
		System.out.println(c.name);
		c.printAll();
	}

}
