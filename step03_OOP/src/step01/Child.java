package step01;

public class Child extends Parent{ // ���� ���� Object �� ������ �ִ� �޼ҵ� 11���� Parent �� ������ �ִ� �޼ҵ� 1���� �� 12���� �������ִ�.
	String job;
	
	Child(){
		super();
		System.out.println("�ڽ��� �⺻ ������");
	}

	public static void main(String[] args) {
		Child c = new Child();

	}

}
