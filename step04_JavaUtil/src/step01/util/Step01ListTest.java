/*�н�����
 * 1. �ֿ�API
 * 		1.java.util
 * 		2.ArrayList - ���� �迭�� ���
 * 			-ù ������ 10 ���� �޸� ����
 * 			-11��° ������ ������ 10���� �߰� ����
 * 			-21��° �����͸� ������ 10���� �߰� ����  
 * 		3.�޼ҵ�
 * 			1.������ ���� : add(Object o)
 * 			2.������ ���� : remove(int index)
 * 			3.������ ��ȯ : Object get(int index) 
 * 			4.������ ���� : :size()
 * 
 */

package step01.util; // ********* java.lang ����� ��� import �ؾߵȴ�
 
import java.util.ArrayList;

public class Step01ListTest {

	public static void main(String[] args) {
		//String�� �� ���� ������ ���� �޸��� �迭 ���� ��ü ����
		System.out.println("--- ���ʸ� �� �ݿ� ---");
		ArrayList a = new ArrayList();
		a.add(3);// newInteger(3) autoboxing
		a.add("ans");
		//? index 1��°�� ���ڿ� ��ü���� ������ charAt(1)
		String v= (String)a.get(1);
		System.out.println(v.charAt(1));
		System.out.println(((String)a.get(1)).charAt(1));
		
		
		System.out.println("--- ���ʸ� ������ list ---");
		//Ÿ�� ���� - ���ʸ�
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.size());  // 0
		
		//������ ����
		list.add("Ȳ�ι�");  //0��° �ڵ�����
		System.out.println((list.get(0)).charAt(1));
		
		//���ʸ� ������ ����ȯ ���� index ������
		//���� ������ Ÿ���� ��ü�� ��ȯ
		
		
		list.add("���Ѹ�");	//1��° �ڵ�����
		list.add("������");
		list.add("������");
//		list.add((new Integer(3));             ���� ���� Ÿ���� �ٸ��� ������
		System.out.println(list.size()); // 3
		
		//index�� 1�� ����� ������ ��ȯ �� ���
		System.out.println(list.get(1)); // ���Ѹ�
		
		//������ ����
		list.remove(1);
		System.out.println(list.size()); //2
		System.out.println(list.get(1));// ������
		
		System.out.println(list);
		

	}

}
