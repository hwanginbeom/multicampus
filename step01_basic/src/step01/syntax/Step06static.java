/*�н�����
 * 1. static Ű����
 * 2. ���� ����
 * 		1.��� ���� ����
 * 			-�����Ǵ� ��� ��ü���� �����ϴ� ����
 * 				:���� �ڿ��� �ƴ� �����鿡 ��� ���� ex) �̸� , ��й�ȣ �̷��ŵ��
 * 			-static ������ �޸𸮿� ���� ��밡���ϰ� �����Ǵ� ������?
 * 			-Run �ϴ� �������� static�� ���� �� �����Ѵ�.
 * 			
 * 			
 * 		2.�޼ҵ� ����
 * 			-��ü �������� Ŭ���������� �޼ҵ� ȣ�Ⱑ��
 * 		3.static{}
 * 			-web server�� ���� �� �� ��� user�� �����ϴ� �ڿ��� �ִٸ� 
 * 			 �� �ѹ� ���� ������ �� �� �ִ� ����
 * 			 �̸��� ���� ���� �ڵ�� ȣ�� �Ұ�
 * 			-byte code �� �޸𸮿� �ε� �� �� �ڵ� ����
 * 
 * 		
 */

package step01.syntax;

public class Step06static {
	
	//step01 - static ����
	static int no1 = 100; //���α׷��� �� �ϰ� static �� ������ ���� 
	static String msg1 = "���ڿ�"; // ����� ���ÿ� ���� 
	//  �ڵ带 ���������� �� �� �а� ���� �Ѵ� . �׷��Ƿ� ����ƽ�� ���� ���ϰ� ������ �Ѵ�. 
	
	//instance ����
	int no2 = 200;
	String msg2 = "���ڿ� 2 ";
	
	
	void m1() {
		System.out.println("�Ϲ� �޼ҵ�");
	}
	//��ü �������̵� class��.m2() �Ǵ� ������ Ŭ������� m2(); ȣ�Ⱑ��
	static void m2() { // ����ƽ �޼ҵ�� ȣ���ؾ� �����Ѵ�. ����ƽ ������ �ٸ���.  �޼ҵ尡 �־�߸� ȣ�� �� �� �ִ�
		System.out.println("static �޼ҵ�");
	}
	
	
	
	//>java Step06static  �̰� ���� ��ɾ� �ε�.      Step06static.main(); 
	//Ŭ���������� �޼ҵ带 ȣ���Ѵ� �̰� ���������� ������ ������ static�̱� �����̴�.
	public static void main (String[] args) {
		System.out.println(no1);
		System.out.println(msg1);
		m2(); 
		Step06static.m2();
		//     ����ƽ�� �׳� ȣ�� �� �� �ִ�.
//		m1();   �Ϲ� �޼ҵ�� ��ü�� ����ؾ� �Ѵ� ������
//		System.out.println(no2);
//		System.out.println(msg2);
		System.out.println(Math.random());
		
		//java.lang.Integer�� �޼ҵ� ȣ��
		//"3" -> int�� ��ȯ�ϴ� �޼ҵ� ȣ���ؼ� ��ȯ�ϱ�
		/*�ʿ��� ������ - int �� ������ ���ڿ� ������
		 * ��� ������ - int�� ��ȯ�� ������
		 * 
		 * �� ������ � Ŭ�������� ������ �� �ΰ�? 
		 * 		String? Integer?
		 * 		Ȥ ���ڿ� �����͸� ������ �޼ҵ带 ������ ��ü�� �ʿ��Ѱ� ?
		 * 
		 * byte : Byte
		 *  - public static byte parseByte(String v){}
		 */
		int no3 = Integer.parseInt("3"); // integer��� Ŭ���� �� �ִ�  �޼ҵ忡 ���� ã�´�. 
		int no4 = 4;
		
		System.out.println(no3+no4);
	}
	
	
	
//	static {
//		System.out.println(2);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("main");
//	}
//	
//	static {
//		System.out.println(1);
//	}
//	

}
