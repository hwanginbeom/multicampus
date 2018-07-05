/*학습내용
 * 1. 고유한 key로 value 구분해서 관리 및 활용
 * 
 * 2. 주의사항 
 * 		1. key는 절대 중복 불허
 * 		2. list 처럼 index 자체가 미 존재
 * 		3. 제네릭 즉 타입 제약 가능 
 * 
 * 3. 실습 단계
 * 		1. 단순 문자열 저장
 * 		2. PeopleDTO 저장
 * 		3. ProbonoProject 저장
 * 		4. ProbonoProject 들이 저장된 ArrayList를 저장
 * 
 */

package step01.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import model.domain.peopleDTO;


public class Step03MapTest {
	
	public static void m1() { // HashMap < key , value>  그래서 key 부분이 같으면 하나만 출력한다.
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("one","영상");
		map.put("one","한림");
		map.put("a","영상");
		map.put("b","한림");
		map.put("c","영상");
		map.put("d","한림");
//		System.out.println(map); // map.toString
//		System.out.println(map.get("one")); //one 이라는 key를 찾아 값을 출력하는거
//		System.out.println(map.remove("one"));  //지우기  
//		System.out.println(map.get("one")); // map.toString
		System.out.println(map.keySet());
		Set keys = map.keySet();
		System.out.println(keys);
		System.out.println(map);
		
		Iterator allKey = keys.iterator();  // 이 메소드를 사용해서 만들면 순서 상관없이 데이터 순서대로 넣는다. 
		String k = null;
		while(allKey.hasNext()) {      //hasNext 데이터 존재 확인가능
			k =(String)allKey.next();   //next 데이터 반환한다. 
			System.out.println(k + " " + map.get(k));
		}
		
		Iterator <String> allKey2 = keys.iterator();  // 이 메소드를 사용해서 만들면 순서 상관없이 데이터 순서대로 넣는다. 
		String k2 = null;
		while(allKey2.hasNext()) {      //hasNext 데이터 존재 확인가능
			k2 =allKey2.next();   //next 데이터 반환한다. 
			System.out.println(k2 + " " + map.get(k2));
		}
		
		/*? 데이터 제공자와 데이터 활용 자는 다름 
		 * 제공자는 HashMap 반환 , 단 어떤 key가 있는지는 언급없이 반환 
		 * 받아서 사용하는 활용자는 현재 Key 를 모름
		 * 단 , API 메소드로 key 확인 가능   // 이걸 찾아야댐 
		 * (hint)단 , key는 set 구조로 관리    //set 구조 로 관리 
		 * 
		 */

	}
	
	public static void m2() {
		HashMap<String,peopleDTO> all = new HashMap<String,peopleDTO>();
		
		all.put("a" , new peopleDTO("영복" , 25));
		all.put("b" , new peopleDTO("경남" , 28));
		
		//all.put(key, value); value 값에는 객체를 넣는다.  peopleDTO의 객체가 들어가고 그 부분에 있는 메소드를 사용 할 수 있다. 
		//?경남씨 이름만 출력 되게 해주세요
		peopleDTO man = all.get("b");
		String name = man.getName();
		System.out.println( name );
		System.out.println(all.get("b")); // 이 부분은 b라는 키값을 가진 것을 반환한다. 반환하면 객체가 나오고 그러면 객체에 있는 
														// 메소드를 사용 할 수 있고 그래서 peopleDTO라는 객체가 가지고 있는 메소드 getName을 써서
														// 이름 값을 가져올수있다. 

		System.out.println((all.get("b").getName()));

		
	}

	public static void main(String[] args) {
//		m1();
		m2();

	}

}
