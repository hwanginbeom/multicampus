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
 *  5.참고
 *   -생성자와 문법 비교
 *   	생성자 문법 : 클래스명 ([ARGUMENTS]){[로직]}
 * 
 * 
 */

package step01.syntax;

public class Step01Method {
	public Step01Method() {}
	/* 연산기능의 메소드 구현
	 * 개발 경우의 수
	 * 경우의 수 1 - 정적 데이터로 더해서 반환
	 * 경우의 수 2 - 동적 데이터로 더해서 반환
	 */
	
	public int sum(){ // 퍼블릭 타입 메소드명 
		return 3+5;
	}
	public int sum2(int no1 , int no2 ){ // 퍼블릭 타입 메소드명 
		return no1+no2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
