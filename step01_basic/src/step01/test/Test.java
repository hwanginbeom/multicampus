package step01.test;


public class Test {
	
	String message;
	int age;
	
	public Test() {}
	public Test(String a, int b) {
	//String message; //�����ؼ� String ����
		message = a;
		age = b;
		//��ü ���� ���� message, age ��� ������ ����� ����
	}
	
	public static void main(String [] args) {
		// TODO Auto-generated method stub  ��ü�� instance
		Test t = new Test("������ �� ���׿�",46);
		System.out.println(t.message);
		System.out.println(t.age);
	
		
	
	}

}
/*
 * 1. ������ ���� �ڵ� �߰� �Ǵ� �ڵ��?
 * 	public Test() {}
 * 2. ������ �� ���׿� .. ��� �����͸� ���� �� �� �ִ� ������ �����ϼ��� 
 *  -String
 * 3. 46 �̶�� ���� ���� ������ ���� ����
 * 4. ��ü ���� ������ �������� �����ͷ� ������ ���� �� �� �ִ� parameter(argument,�Ű�����) �� �ִ� ������ �����
 * 5. ������ �� ���׿� , 46�̶�� �����ͷ� ��ü ���� �� ������ �� ���
 * ��Ʈ : ��ü ���� ���� / Ÿ�� ������ = new ������ ȣ��(..);
 */


/*
 *  Test t 
 *  new Test("������ �� ���׿�", 46)
 *  public Test(String m , int a) { 
 *  message = m ; 
 *  age = a ;
 *  }
 *  Test t = new Test (" ������ �� ���׿��� , 46);
 */
*/