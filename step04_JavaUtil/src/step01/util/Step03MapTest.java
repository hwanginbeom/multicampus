/*�н�����
 * 1. ������ key�� value �����ؼ� ���� �� Ȱ��
 * 
 * 2. ���ǻ��� 
 * 		1. key�� ���� �ߺ� ����
 * 		2. list ó�� index ��ü�� �� ����
 * 		3. ���׸� �� Ÿ�� ���� ���� 
 * 
 * 3. �ǽ� �ܰ�
 * 		1. �ܼ� ���ڿ� ����
 * 		2. PeopleDTO ����
 * 		3. ProbonoProject ����
 * 		4. ProbonoProject ���� ����� ArrayList�� ����
 * 
 */

package step01.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import model.domain.peopleDTO;


public class Step03MapTest {
	
	public static void m1() { // HashMap < key , value>  �׷��� key �κ��� ������ �ϳ��� ����Ѵ�.
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("one","����");
		map.put("one","�Ѹ�");
		map.put("a","����");
		map.put("b","�Ѹ�");
		map.put("c","����");
		map.put("d","�Ѹ�");
//		System.out.println(map); // map.toString
//		System.out.println(map.get("one")); //one �̶�� key�� ã�� ���� ����ϴ°�
//		System.out.println(map.remove("one"));  //�����  
//		System.out.println(map.get("one")); // map.toString
		System.out.println(map.keySet());
		Set keys = map.keySet();
		System.out.println(keys);
		System.out.println(map);
		
		Iterator allKey = keys.iterator();  // �� �޼ҵ带 ����ؼ� ����� ���� ������� ������ ������� �ִ´�. 
		String k = null;
		while(allKey.hasNext()) {      //hasNext ������ ���� Ȯ�ΰ���
			k =(String)allKey.next();   //next ������ ��ȯ�Ѵ�. 
			System.out.println(k + " " + map.get(k));
		}
		
		Iterator <String> allKey2 = keys.iterator();  // �� �޼ҵ带 ����ؼ� ����� ���� ������� ������ ������� �ִ´�. 
		String k2 = null;
		while(allKey2.hasNext()) {      //hasNext ������ ���� Ȯ�ΰ���
			k2 =allKey2.next();   //next ������ ��ȯ�Ѵ�. 
			System.out.println(k2 + " " + map.get(k2));
		}
		
		/*? ������ �����ڿ� ������ Ȱ�� �ڴ� �ٸ� 
		 * �����ڴ� HashMap ��ȯ , �� � key�� �ִ����� ��޾��� ��ȯ 
		 * �޾Ƽ� ����ϴ� Ȱ���ڴ� ���� Key �� ��
		 * �� , API �޼ҵ�� key Ȯ�� ����   // �̰� ã�ƾߴ� 
		 * (hint)�� , key�� set ������ ����    //set ���� �� ���� 
		 * 
		 */

	}
	
	public static void m2() {
		HashMap<String,peopleDTO> all = new HashMap<String,peopleDTO>();
		
		all.put("a" , new peopleDTO("����" , 25));
		all.put("b" , new peopleDTO("�泲" , 28));
		
		//all.put(key, value); value ������ ��ü�� �ִ´�.  peopleDTO�� ��ü�� ���� �� �κп� �ִ� �޼ҵ带 ��� �� �� �ִ�. 
		//?�泲�� �̸��� ��� �ǰ� ���ּ���
		peopleDTO man = all.get("b");
		String name = man.getName();
		System.out.println( name );
		System.out.println(all.get("b")); // �� �κ��� b��� Ű���� ���� ���� ��ȯ�Ѵ�. ��ȯ�ϸ� ��ü�� ������ �׷��� ��ü�� �ִ� 
														// �޼ҵ带 ��� �� �� �ְ� �׷��� peopleDTO��� ��ü�� ������ �ִ� �޼ҵ� getName�� �Ἥ
														// �̸� ���� �����ü��ִ�. 

		System.out.println((all.get("b").getName()));

		
	}

	public static void main(String[] args) {
//		m1();
		m2();

	}

}
