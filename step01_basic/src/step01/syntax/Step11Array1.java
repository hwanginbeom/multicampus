/*�н����� - �迭
 *  1. �ټ��� �����͸� �ϳ��� ������ ����
 *  2. ������ �����ʹ� ������ index�� ����
 *  	-ù��° ������ ������ ������ 0
 *  3.��� �迭�� ������ ��ü
 *  		-�迭�� ���� ��� �����ϰ� ���� �� ��� � �޸𸮿� ���� �Ǵ°� ? 
 *  		:heap�� ���� 
 * 	4.�ѹ� ������ �迭�� ũ��� ���� �Ұ�
 * 		-�������� ������ ǥ���� ���ؼ��� �迭�� �ƴ� list ������ ����
 * 		-java.util package �н� ����
 * 5. ���� ��Ų �迭���� �迭 �޸� ũ�Ⱚ�� ������ length���
 *     ������ �ڵ�����
 * 
 */

package step01.syntax;

import step01.domain.peopleDTO;

public class Step11Array1 {
	
	//int �迭
	public static int[] intArray() {
		int [] i =  {1,2,3}; // ���⿡�� 4������ �����µ� 1,2,3 �� lenth�� ������.
		return i;
	}
	
	//String �迭
	public static String[] stringArray() {
		String[] s = {"�Ӽ�ȯ" , "��â��"};
		return s;
		}
	
	
	//PeopleDTO �迭 
	public static peopleDTO[] peopleArray() {
		peopleDTO[] all = { new peopleDTO("�ŵ���",30),
										new peopleDTO("�̿���",31)};
		return all;
		}
		
	
	
	public static void main(String[] args) {
	
		//index 1��° ģ���� �̸����� ����غ���
		peopleDTO[] all = peopleArray();
		peopleDTO p = all[1];
		String name = p.getName();
		System.out.println(name);
		
		/*peopleArray():peopleDTO �迭 ��ȯ
		 * peopleArray()[1]:�迭 ���� �ִ� index 1��° ��ü�� peopleDTO ��ü ��ȯ
		 * peopleArray()[1].getName() : ��ü�� getName() ȣ��
		 * 
		 */
		String p1 = peopleArray()[1].getName();
		
		
		
		int[] i = intArray();
		System.out.println(i[0]);
	
		int i2 = intArray()[2];	
		System.out.println(stringArray()[1]);
		
	}

}