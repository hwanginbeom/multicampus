/*문자열 클래스들
 * 1. String
 * 		1. 한번 생성된 문자열 객체의 내용은 절대 수정불가 //대입으로 수정 d1=d1
 * 		2. 기본 타입은 아니지만 " " 표현만으로 내부적으로 객체로 생성
 * 		3. 생성시키는 문법
 * 			" " or new String(" ")
 * 		4. 객체 생성 원리
 * 			1. "" 문법으로 생성시
 * 				-이미 동일하게 ""으로 생성된 문자열의 값이 같다면 재사용
 * 			2. new String()
 * 				-무조건 무조건 무조건 새로 객체 생성
 */
package step04.API;

public class Step01String {

	public static void main(String[] args) {
		//step01 - String
		String d1 = "이경준";
		String d2 = "이경준";
		String d3 = new String("이경준");
		String d4 = new String("이경준");
		
		System.out.println(d1==d2); //true
		System.out.println(d2==d3); //false
		System.out.println(d3==d4); //false
		
		//step02 - String 불변 test
		//String concat(String addValue){ 이 메소드를 보유한 객체의 내용에
		//parameter로 유입 된 문자열을 추가(add) 
		d1.concat("시험 출제자"); // 대입을 안하면 그자체로 쓰레기가 된다 주소값이 없어서 못찾는
		System.out.println(d1);
		System.out.println(d1.concat("남학생")); //이경준 남학생
		System.out.println(d1);
		
		d1=d1.concat("시험 출제자");
		System.out.println(d1);
		
		/*String 특징 중 불변 구조는 실시간 가변적인 문자열 조합에는 부적합
		 * 실행 속도 문제 발생
		 * 해결책 - java.lang.StringBuffer/ StringBuilder 제시
		 * 		-문자열 관련 API
		 * 		-가변적인 문자열 표현엔 적합
		 * 	참고 : jdk1.6부터는 String 자체의 실행 performance를 jdk 자체적으로 향상
		 *  향상
		 *  
		 *  
		 */
		
		
		}

}
