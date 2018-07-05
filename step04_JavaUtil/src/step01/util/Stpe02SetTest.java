/*학습내용
 * 1. java.util.Set API 학습
 * 2. Set 특징
 * 		1. 중복 데이터 불허(고유한 데이터만 저장)
 * 		2. 저장은 쉬움 , 단 데이터 하나하나 반환 할 경우 Iterator ApI 활용해야 함
 * 		3. 데이터 저장 순서에 대한 개발자가 관리는 불가
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
