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
	//������
	public void printAll() {
		super.printAll();
		System.out.println(job);

	}

	public static void main(String[] args) { //c�� ���úκп� �ִµ� ���ú����ΰ��� !?
		//step02 - ������
//		Parent p = new Child();  //up casting �� ĳ����
//		p.name = "����";
////		p.job = "IT man"; ���� ����
////		�ڽĸ��� ����� access�� ���� �ʼ� ���� - ��ü ���� ����ȯ
//		Child c2 = (Child)p;
//		c2.job = "IT man";
//		p.printAll();
//		c2.printAll();
//		
		
		System.out.println("----------------");
//		step01-��� ������ ��ü ���� �н�
		Child c = new Child();        //Ŭ������ ����ٴ� �������� �ٿ�ĳ����
//		System.out.println(c.name);
		c.name = "��";
//		System.out.println(c.name);
		c.printAll();
	}

}
