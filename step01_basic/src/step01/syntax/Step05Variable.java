/*�н�����
 * 1. ���� �ֱ�ȭ
 * 		1.��� - ��ü ������ �ڵ� �⺻������ �ʱ�ȭ
 * 		2.���� - �ڵ� �ʱ�ȭ�� �Ұ� , ���� ����� �ʱ�ȭ �ʼ�
 * 2.�⺻ Ÿ�� �������� ����ȯ
 * 		-Ÿ���� �ٸ� ���� �� ������ "����ȯ" �������� ��ȯ�� ����
 * 		-boolean�� ���� �ٸ� Ÿ������ ��ȯ �Ұ�
 * 		-�Ǽ��� ������ ���������� �������� ū �޸𸮰� ���� 
 * 
 */

package step01.syntax;

public class Step05Variable {
	
	int no; //��������� ��ü �����ϸ� �ڵ����� 0 �̷������� �ڵ� �ʱ�ȭ ���ȴ�.
	String msg;
	
	//���� ���� �ʱ�ȭ �н�
	void localVar() {
		int no = 0; // ���ú����� ����ϱ����� �ʱ�ȭ�� �� �ؾ��Ѵ�.  �ʱ�ȭ ���� ������ ������ ����. 
		System.out.println(no);
	}
	
	//�⺻Ÿ�� ����ȯ
	void typeCasting() {
		byte b = 8;  //byte 8bit
		int i = b;    //byte 32 bit  									upcasting
		byte b4 = (byte)i; // �� ��ȯ   32bit - > 8bit ��ȯ    downcasting
		char c= 'A'; // 16bit
		int i2 = c;
		System.out.println(c);
		System.out.println(i2);
		
		//������ ��Ģ ����� ������ int�� ��ȯ
		byte b1 = 8;
		byte b2 = 10; 
		byte b3 = (byte)(b1+b2);
		
	}
	

	public static void main(String[] args) {
		//��ü ������ heap�� ���� �� no�� msg�� �ڵ� �ʱ�ȭ 
		

		
		Step05Variable s = new Step05Variable();
//		System.out.println(s.no);
//		System.out.println(s.msg);
		s.typeCasting();
	}

}