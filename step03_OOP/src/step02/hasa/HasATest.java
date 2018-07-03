/*�н�����
 * 1. ��ü���� ����� ���(����) �Ǵ� ���踦 "has a" ����
 * 2. ����
 * 		has a[����� , ����]
 *3. ����
 *		-����� is a[�����, ����] �� ǥ��
 *		-�� �Ӽ�(������)���� ������ ��쿡�� ��� ����
 *		����: ���� Ŭ������ �� Ŭ���� ������ ��� ����
 */

package step02.hasa;

public class HasATest {
	
	public static void printAll(Person a) {
		System.out.println("����:" +a.getName());
		System.out.println("�� cc:"+a.myCar.engine.getCc());
		System.out.println("�� �����̸�:"+a.myCar.engine.getEngineName());
	}

	public static void main(String[] args) {
		//String -> Engine  -> Car ->person & String
		/* �λ���� �� ���� Person ��ü ����
		 *  ?���� �̸� , cc , Person�� �̸��� �� �����Ͻð� 
		 *  ���
		 */
		Person p1 = new Person();
		p1.setName("�ѱǿ�");
		p1.myCar.engine.setCc(1000);
		p1.myCar.engine.setEngineName("���ƿ�����");
		
		Person p2 = new Person();
		p2.setName("Ȳ�ι�");
		p2.myCar.engine.setCc(2000);
		p2.myCar.engine.setEngineName("��������޿���");
		
		
		System.out.println(p1.getName());
		System.out.println(p1.myCar.engine.getCc());
		System.out.println(p1.myCar.engine.getEngineName());
		
		System.out.println("--------�ѻ纮-------");


		System.out.println(p2.getName());
		System.out.println(p2.myCar.engine.getCc());
		System.out.println(p2.myCar.engine.getEngineName());
		
		
		printAll(p1);
		System.out.println("--------�ѻ纮-------");
		printAll(p2);
	}
	

}
