/*�н�����
 * 1. java.util.Set API �н�
 * 2. Set Ư¡
 * 		1. �ߺ� ������ ����(������ �����͸� ����)
 * 		2. ������ ���� , �� ������ �ϳ��ϳ� ��ȯ �� ��� Iterator ApI Ȱ���ؾ� ��
 * 		3. ������ ���� ������ ���� �����ڰ� ������ �Ұ�
 * 
 */

package step01.util;

import java.util.HashSet;
public class Stpe02SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		System.out.println(set);

		
	}

}
