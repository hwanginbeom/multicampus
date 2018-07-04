/*Wrapper class �� �н�
 * 1. �ʿ伺
 * 		-���� : ��ü�� ���� ������ �迭, ��ü�� ���� ������ �ڷ� ���� ����
 * 				�⺻ Ÿ�� ���� �����ϰ� ���� �� �����Ұ�
 * 		-�ذ�å : �⺻ Ÿ���� ������ �� Ÿ�� �� ����Ʈ Ŭ������ ����
 * 				java.lang �� 8������ ����
 * 2. ����
 * 		byte   -2    : Byte   -  new  Byte(2)
 * 		short   - 3  : Short    -   new Short(3)
 * 		int :Integer
 * 		long : Long
 * 
 * 3. ��ü Ÿ�԰� �⺻ Ÿ�԰��� ȣȯ ���� : jdk1.5 ���� �߰�
 * 		������ : Integer i = new Integer(3)
 * 					int i = 3;
 * 					*�⺻ ���� ȣȯ ���� �Ұ�
 * 
 * 		�Ź��� : Integer i = 2;  - autoboxing //��ü�� 2�� �ް� 
 * 					������ ���� Integer i = new Integer(2); ���� ��ȯ
 * 					int i = new Integer(2);   - unboxing
 * 					������ ���� int i = (new Integer(2)).intValue();
 * 						
 * 
 */
package step04.API;

public class Stpe02Wrapper {

	public static void main(String[] args) {
		String s = "3";
		int a =3;
		System.out.println(s.equals("3"));
		System.out.println(s.equals(3));
		System.out.println(s.equals( new Integer("3")));
		System.out.println();
		


	}

}