package step01;

public class InstanceofTest {

	public static void main(String[] args) {
		// String ��ü�� ���밪 ��
		System.out.println("data".equals("data"));

		// Integer ��ü�� ���� �� ��
		Integer i = new Integer("3");
		Integer i2 = new Integer("32");
		System.out.println(i.equals(i2));

		// ���� �ٸ� Ÿ���̱� �ϳ� equals()�� parameter�� Object
		/*
		 * java.lang.Object�� ��� ��ü Ÿ���� �ֻ��� �⺻ Ÿ�� 8������ ������ ��� Ÿ�� �� ���� ����
		 */

		System.out.println(i.equals("���ڿ�"));

		// 1 Ÿ���� �ٸ��� �� ��ü�� �ȵ�
		System.out.println(i.equals("3")); // false
		// 2
		System.out.println("3".equals(i)); // false
		// ����� ���� ��ü�� ���� �� ��

		// Object�� �ڽ� String
		/*
		 * ��ü Ÿ�� �� ������ 1.instanceof 2.�������� : ��� ���迡���� �񱳰���
		 */
		System.out.println("string" instanceof Object); // true
		System.out.println("string" instanceof String); // ture
		// String �� Integer�� ��Ӱ��谡 �ƴ� ���� �񱳺Ұ�
		// System.out.println("string" instanceof Integer); //���� ����

		System.out.println("---- ������");
		AA a = new AA(5);
		AA a2 = new AA(5);
//		BB a3 = ne w BB(10); �ٸ� Ÿ������ instanceof�� �Ұ�
		System.out.println(a.equals(a2));// ��ü�� Ÿ�� ���Ƶ� �ٸ� ��ü�̱� ������
											// �ּҰ� �񱳸� �ϰ� false �� ���´�.
//		System.out.println(a2.equals(a3));

	}
}



class AA extends Object {
	int data;

	AA() {
	}

	AA(int d) {
		data = d;
	}

	// ��ü�� �ּҰ� ���ߴ� �޼ҵ带 ���� �� �񱳷� ������
	/*
	 * AA ��ü�� �� 1. AAŸ�� ���� �� 2. AAŸ���� ��ġ�ȴٸ� AA��ü���� ������ ��� ������ �� Object Ÿ���� ������
	 * ��ӽ�Ų �޼ҵ常 ȣ���� �����ϰ� �ڽĸ��� ����� ȣ���ϱ� ���ؼ��� ����ȯ �ʼ�
	 */
	
//	System.out.println(a.equals(a2));// ��ü�� Ÿ�� ���Ƶ� �ٸ� ��ü�̱� ������

	public boolean equals(Object o) { // ������Ʈ�� �⺻ 8������ �����ϰ� ���� ��Ӱ���
		if (o instanceof AA) {
			AA a = (AA) o; // data ��� ���� �񱳸� ���� ����ȯ
			// �� �޼ҵ带 ������ ��ü�� data ������
			// parameter�� ���Ե� ��ü�� data ���� ��
			if (data == a.data) {
				return true;
			}
		}
		return false;

	}

}

//class BB extends Object {
//	int data;
//
//	BB() {
//	}
//
//	BB(int d) {
//		data = d;
//	}
//
//	// ��ü�� �ּҰ� ���ߴ� �޼ҵ带 ���� �� �񱳷� ������
//	/*
//	 * AA ��ü�� �� 1. AAŸ�� ���� �� 2. AAŸ���� ��ġ�ȴٸ� AA��ü���� ������ ��� ������ �� Object Ÿ���� ������
//	 * ��ӽ�Ų �޼ҵ常 ȣ���� �����ϰ� �ڽĸ��� ����� ȣ���ϱ� ���ؼ��� ����ȯ �ʼ�
//	 */
//	public boolean equals(Object o) { // ������Ʈ�� �⺻ 8������ �����ϰ� ���� ��Ӱ���
////		if (o instanceof AA) {
//			AA a = (AA) o; // data ��� ���� �񱳸� ���� ����ȯ
//			// �� �޼ҵ带 ������ ��ü�� data ������
//			// parameter�� ���Ե� ��ü�� data ���� ��
//			if (data == a.data) {
//				return true;
//			}
//		
//		return false;
//
//	}
//
//}
//
