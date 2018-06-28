/*�н�����
 * 1. ����
 * 		1.Ÿ�Կ� ���� ����
 * 			1.�⺻ Ÿ��(built-in)
 * 				-8���� ��, �� �ҹ��� 
 * 				1.������ - byte(8bit) , short(16bit) , int(32bit),long(64��Ʈ)
 * 				2.�Ǽ��� - float(32bit) , double(64bit)
 * 				3.������ - char(16bit) 
 * 				4.������ - boolean(8bit , �� 1bit�� ���)
 * 
 * 			2.���� Ÿ�� ( ��ü Ÿ��, Ŭ���� Ÿ��) # String �� Ŭ���� Ÿ���̴�. 
 * 				-Ÿ���� ������ ���Ѵ�
 * 				1.�⺻ Ÿ���� ������ ��� Ÿ��
 * 				2.����Ŭ((��)sun)���� �����ϴ� Ŭ������ �������̽� Ÿ��
 * 				3.�ڹ� ������ �� �ڹٸ� ����ϴ� ����ڰ� ����� Ŭ������ �������̽� Ÿ��
 * 		2.���� ��ġ�� ���� ����
 * 			1.��� ����
 * 				1.class{} �ٷ� ������ ����� ���� 
 * 				2.instance(��ü) ������ �޸𸮿� ��� �����ϰ� ���� �����Ǵ� ����
 * 				3.�����Ǵ� ��ġ�� 
 * 					- heap �̶�� �޸� ����
 * 					-heap ���� ������ �ʴ� ��ü���� ȸ���� 
 * 						garbage collector[GC]�� ���� (��ü���� �����ؾ� �Ѵ�.)
 * 			2.���� ����(stack ���� , temporary, automatic)
 * 				1.������ , �޼ҵ��� () �� {} ���ο� ����Ǵ� ����
 * 				2.�� �������� ��� ������? 
 * 					-����� �޼ҵ� �������� �Ǵ� ����� ������ �������� ��� 
 * 				3.�����Ǿ� ����Ǵ� �޸�
 * 					-stack
 * 					-�޼ҵ� �Ǵ� ������ ����� �޸� ���� ~ ����� �ڵ� ��ȯ(�ֹ�)
 * 					  
 * 
 */

package step01.syntax;

public class Step04Variable {
	int no; // ��� ���� 
	
	void m1(int no) { // ���� ���� 
		no = no+1;
		this.no= no;  //��� ������  ȣ��  
		//��������� ���� ������ ���� ��� ��������� ȣ�� �Ұ�� this �� ����Ѵ�.
		System.out.println(no);
	}
	
	int m2(int no) {
		no = no -1;
		m1(no);  // ����������� 10���� �ٲ������ �̺κп��� ���ú����� ���� ���� 9�̱� ������
		return no ; //9���� �ش� . 
	}

	public static void main(String[] args) { //���� �޼ҵ忡 ���ú����� args �ϳ��̴�.
		Step04Variable s = new Step04Variable();
		s.no = s.m2(10); //������� 
		System.out.println(s.no);
		

	}

}