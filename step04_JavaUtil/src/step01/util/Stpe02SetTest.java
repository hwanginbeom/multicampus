/*�н�����
 * 1. java.util.Set API �н�
 * 2. Set Ư¡
 * 		1. �ߺ� ������ ����(������ �����͸� ����)  // a ,a,b,c = > a,b,c
 * 		2. ������ ���� , �� ������ �ϳ��ϳ� ��ȯ �� ��� Iterator ApI Ȱ���ؾ� ��
 * 		3. ������ ���� ������ ���� �����ڰ� ������ �Ұ�   // => b,c,d,a => a,b,c,d
 * 
 */

package step01.util;

import java.util.HashSet;
import java.util.Iterator;

public class Stpe02SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("basdf");
		set.add("cwer");
		set.add("awer");
		set.add("aqwe");
		set.add("ddfg");
//		System.out.println(set.toString());

		/*
		 * Set ���ο� �ִ� ������ ���� �ϳ��ϳ� �� ��ȯ�޾� ����ϱ�
		 *  1.Iterator -��� ������ ���� ������ �������� �����ؼ� �ϳ���
		 * ��밡���ϰ� ���ִ� API 
		 * 			-������ ���� Ȯ�� ���
		 * 			 - hasNext() 
		 * 			-������ ��� ��ȯ�ϴ� ��� 
		 * 				-next()
		 *  2. ���� ������ ���� �غ��� ( �ǻ� �ڵ� ) 
		 *  		1�ܰ� - HashSet ��ü�� �����͵��� Iterator�� ��ȯ 
		 *  		2�ܰ� - Iterator���� ������ ���� ����
		 * 				Ȯ�� :�ݺ��� �ʿ� :for ? while ? do~while? 
		 * 			3�ܰ� - ���� �� ��� ������ ��ȯ - �������� ��� ����
		 */

		Iterator  all = set.iterator();  //�̷��� ������ ���� ������� �ְ�   // Ÿ���� ������ �ȵ�����
		String data = null;             // data�� String Ÿ�� 
		while(all.hasNext()) {
			data = (String)all.next();        //���ʿ��� ����ȯ�� ����� ���� Ÿ���� �Ǿ ���� �� �ִ�. / ���⼭ Object Ÿ�� �ΰ� ����.
			System.out.println(data);        //��ȯ�Ѵ�.
		}
		Iterator <String> all2 = set.iterator();  //�̷��� ������ ���� ������� �ְ�   // ���⿡ ���ʸ����� String Ÿ������ �����. 
		String data2 = null;                            //data2�� String Ÿ��  ���� ���� ���� Ÿ���̴�.
		while(all2.hasNext()) { 
			data2 = all2.next();                   //�׷��� ������ ���� ���� ���ִ�.
			System.out.println(data2);        //��ȯ�Ѵ�.

		}

	}
}
