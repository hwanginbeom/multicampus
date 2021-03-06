/* 학습내용
 * 	1.메소드 구현 (개발 , 만들기)
 * 		-사칙연산 로직으로 test
 * 	2.메소드 호출(사용)
 * 	3.구현 위치
 * 		-class 영역 내에서만 개발 가능
 * 		-메소드 내부에 메소드 구현 불가
 * 		-메소드 내부에서 다른 메소드 호출 가능 
 * 	4.기본 문법(*)
 * 	  -반환타입 메소드명([ARGUMENTS]){[로직]}
 * 	  -반환값 타입에 맞게 반환 타입 설정
 * 	  -반환값 없는 메소드 인 경우 반환 타입에 void 로 선언
 *  5.참고
 *   -생성자와 문법 비교
 *   	생성자 문법 : 클래스명 ([ARGUMENTS]){[로직]}
 * 
 * 
 */

package step01.syntax;

public class Step01Method {
	public Step01Method() {} //생성자 
	/* 연산기능의 메소드 구현
	 * 개발 경우의 수
	 * 경우의 수 1 - 정적 데이터로 더해서 반환
	 * 경우의 수 2 - 동적 데이터로 더해서 반환
	 */
	
	public int sum(){ // 퍼블릭 타입에 인트형 메소드 
		return 3+5;
	}
	
	public int sum(int no1 , int no2 ){ // argument가 들어가는 메소드
		return no1+no2;
	}
	
	public void sum(int no1 , int no2 ,int no3){ //반환 타입이 없는 메소드 
		System.out.println(no1+no2+no3);
		
	}

	public static void main(String[] args) {
		Step01Method s = new Step01Method(); // 기본 생성자 호출 객체 생성 
	//  타입 
//		int v1 = s.sum();
		System.out.println(s.sum()); //기본 타입 생성자로 sum을 호출 한다. sum 메소드중에
									 //argument가 들어 가지 않는 메소드를 찾아서 호출한다.
		
//		int v2 = s.sum2(100,200);
		System.out.println(s.sum(100, 200)); // println은 다중 정의로 int / string 등등 다 가능하다.
		                                     //이 부분에서는 argument가 들어가고 그래서 argument 가들어간 
		System.out.println("eee");           //  메소드 부분이 호출된다.
		s.sum(100, 200, 300);                //이 부분에서는 argument 가 3개가 들어간 부분의 메소드를 호출한다.
		
		
		
		// TODO Auto-generated method stub
		//1단계 - 메소드 호출하기 위한 객체 생성
		//객체 생성 문법  : 타입 변수명 = new 생성자
	}
	

}

//void a() {}
//int i = t.a();  - 값 안나온다 void 이기 떄문이다. 값도 없고 타입도 없다.
//
//string a() {
//	s.o.p(t.a());

