package step01;

/*1. parent2 ��ӹޱ�
 * 2. int no2 ���� �� �ʱ�ȭ(�� ����)
 * 3. printAll() ������
 * 4. �������� ����� ��ü�� main���� ����
 * 5. printAll() ȣ��
 * 6. Child2���� no2 ���� 100 ���� ����
 * 7.no2 ���� ���
 */
public class Child2 extends Parent2 {
	int no2=20;
	
	 void printAll() {
		super.printAll();
		System.out.println(no1);
		System.out.println(no2);
	}

	
	public static void main(String[] args) {
		Parent2 p = new Child2();
		p.printAll();
		Child2 c = (Child2)p;
		c.no2 = 100;
		System.out.println(p.no1);
		p.no1 = 1000;
		System.out.println(c.no1);

	}

}


class Parent2{
	int no1 = 10;
void printAll() {
		System.out.println(no1);
		}

	
}