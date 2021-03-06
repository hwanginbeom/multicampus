/*학습내용
 * 1. 변수
 * 		1.타입에 따른 구분
 * 			1.기본 타입(built-in)
 * 				-8가지 뿐, 다 소문자 
 * 				1.정수형 - byte(8bit) , short(16bit) , int(32bit),long(64비트)
 * 				2.실수형 - float(32bit) , double(64bit)
 * 				3.문자형 - char(16bit) 
 * 				4.논리형 - boolean(8bit , 단 1bit만 사용)
 * 
 * 			2.참조 타입 ( 객체 타입, 클래스 타입) # String 은 클래스 타입이다. 
 * 				-타입의 개수는 무한대
 * 				1.기본 타입을 제외한 모든 타입
 * 				2.오라클((구)sun)에서 제공하는 클래스와 인터페이스 타입
 * 				3.자바 개발자 즉 자바를 사용하는 사용자가 만드는 클래스와 인터페이스 타입
 * 		2.선언 위치에 따른 구분
 * 			1.멤버 변수
 * 				1.class{} 바로 하위에 선언된 변수 
 * 				2.instance(객체) 생성시 메모리에 사용 가능하게 실제 생성되는 변수
 * 				3.생성되는 위치는 
 * 					- heap 이라는 메모리 공간
 * 					-heap 에서 사용되지 않는 객체들의 회수는 
 * 						garbage collector[GC]가 실행 (객체수는 조절해야 한다.)
 * 			2.로컬 변수(stack 변수 , temporary, automatic)
 * 				1.생성자 , 메소드의 () 와 {} 내부에 선언되는 변수
 * 				2.이 변수들의 사용 영역은? 
 * 					-선언된 메소드 내에서만 또는 선언된 생성자 내에서만 사용 
 * 				3.생성되어 저장되는 메모리
 * 					-stack
 * 					-메소드 또는 생성자 실행시 메모리 점유 ~ 종료시 자동 반환(휘발)
 * 					  
 * 
 */

package test5;

public class test3 {
	int no; // 멤버 변수 
	
	void m1(int no) { // 로컬 변수 
		no = no+1;
		this.no= no;  //멤버 변수를  호출  
		//멤버변수와 로컬 변수가 같을 경우 멤버변수를 호출 할경우 this 를 사용한다.
	}
	
	int m2(int no) {
		no = no -1;
		m1(no);  // 멤버변수값이 10으로 바뀌었지만 이부분에서 로컬변수의 값은 아직 9이기 떄문에
		return no ; //9값을 준다 . 
	}
	
	int m3(int no) {
		no = no +1;
		m2(no);  // 멤버변수값이 10으로 바뀌었지만 이부분에서 로컬변수의 값은 아직 9이기 떄문에
		System.out.println(no);
		m1(no);
		System.out.println(no);
		return no ; //9값을 준다 . 
	}

	public static void main(String[] args) { //메인 메소드에 로컬변수는 args 하나이다.
		test3 s = new test3();
		s.no = s.m2(10); //멤버변수 
		System.out.println(s.no);
		s.m3(10);
		System.out.println(s.no);

		

	}

}
