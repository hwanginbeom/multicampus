/* 학습내용
 *  1. 변수의 타입
 *  	타입 변수명; 
 *  2. 메소드의 타입
 *   	반환타입 , argument에 선언된 변수 타입 
 *   	반환타입 메소드명([타입 변수명 , ...]){}

 *  3. 타입으로 사용 가능한 타입의 수는? -제한이 없다
 *  	1.int 와 같은 기본타입  - 8가지
 *  	2.String 처럼 JDK 내부에 class 로 제공 해주는 타입
 *  	3.사용자가 직접 개발하는 클래스 
 */

package step01.test;

import step01.domain.FriendVO;

public class Test2 {
	//String을 argument로 받는 메소드구현
	void m1(String v) {}
	
	//String 을 반환하는 메소드 구현
	String m2() {
		return "ee";
	}
	
	//FrinedVO
	void m3(FriendVO v) {}

	

	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println(t.m2());
		t.m1("문");
		
		
		t.m3(new FriendVO());        //둘다 가능 
		FriendVO v = new FriendVO(); //이 부분이 바로 들어가는게 가능 
		t.m3(v);

	}

}
