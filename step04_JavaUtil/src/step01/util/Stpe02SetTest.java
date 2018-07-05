/*학습내용
 * 1. java.util.Set API 학습
 * 2. Set 특징
 * 		1. 중복 데이터 불허(고유한 데이터만 저장)  // a ,a,b,c = > a,b,c
 * 		2. 저장은 쉬움 , 단 데이터 하나하나 반환 할 경우 Iterator ApI 활용해야 함
 * 		3. 데이터 저장 순서에 대한 개발자가 관리는 불가   // => b,c,d,a => a,b,c,d
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
		 * Set 내부에 있는 데이터 들을 하나하나 씩 변환받아 사용하기
		 *  1.Iterator -모든 데이터 들을 정해진 순번없이 열거해서 하나씩
		 * 사용가능하게 해주는 API 
		 * 			-데이터 존재 확인 기능
		 * 			 - hasNext() 
		 * 			-존재할 경우 반환하는 기능 
		 * 				-next()
		 *  2. 개발 로직을 말로 해보기 ( 의사 코드 ) 
		 *  		1단계 - HashSet 객체의 데이터들을 Iterator로 변환 
		 *  		2단계 - Iterator에서 데이터 존재 여부
		 * 				확인 :반복문 필요 :for ? while ? do~while? 
		 * 			3단계 - 존재 할 경우 데이터 반환 - 미존재할 경우 종료
		 */

		Iterator  all = set.iterator();  //이렇게 넣으면 순서 상관없이 넣고   // 타입이 지정이 안되있음
		String data = null;             // data는 String 타입 
		while(all.hasNext()) {
			data = (String)all.next();        //이쪽에서 형변환을 해줘야 같은 타입이 되어서 넣을 수 있다. / 여기서 Object 타입 인것 같다.
			System.out.println(data);        //반환한다.
		}
		Iterator <String> all2 = set.iterator();  //이렇게 넣으면 순서 상관없이 넣고   // 여기에 제너릭으로 String 타입으로 만든다. 
		String data2 = null;                            //data2는 String 타입  지금 현재 같은 타입이다.
		while(all2.hasNext()) { 
			data2 = all2.next();                   //그래서 데이터 값을 넣을 수있다.
			System.out.println(data2);        //반환한다.

		}

	}
}
