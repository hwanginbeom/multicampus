package step01;

public class InstanceofTest {

	public static void main(String[] args) {
		// String 객체의 내용값 비교
		System.out.println("data".equals("data"));

		// Integer 객체의 내용 값 비교
		Integer i = new Integer("3");
		Integer i2 = new Integer("32");
		System.out.println(i.equals(i2));

		// 서로 다른 타입이긴 하나 equals()의 parameter가 Object
		/*
		 * java.lang.Object는 모든 객체 타입의 최상위 기본 타입 8가지를 제외한 모든 타입 다 수용 가능
		 */

		System.out.println(i.equals("문자열"));

		// 1 타입이 다르면 비교 자체가 안됨
		System.out.println(i.equals("3")); // false
		// 2
		System.out.println("3".equals(i)); // false
		// 사용자 정의 객체의 내용 값 비교

		// Object의 자식 String
		/*
		 * 객체 타입 비교 연산자 1.instanceof 2.제약조건 : 상속 관계에서만 비교가능
		 */
		System.out.println("string" instanceof Object); // true
		System.out.println("string" instanceof String); // ture
		// String 과 Integer은 상속관계가 아님 따라서 비교불가
		// System.out.println("string" instanceof Integer); //문법 오류

		System.out.println("---- 재정의");
		AA a = new AA(5);
		AA a2 = new AA(5);
//		BB a3 = ne w BB(10); 다른 타입으로 instanceof는 불가
		System.out.println(a.equals(a2));// 객체의 타입 같아도 다른 객체이기 떄문에
											// 주소값 비교를 하고 false 가 나온다.
//		System.out.println(a2.equals(a3));

	}
}



class AA extends Object {
	int data;

	AA() {
	}

	AA(int d) {
		data = d;
	}

	// 객체의 주소값 비교했던 메소드를 내용 값 비교로 재정의
	/*
	 * AA 객체들 비교 1. AA타입 여부 비교 2. AA타입이 일치된다면 AA객체들이 보유한 멤버 변수값 비교 Object 타입의 변수는
	 * 상속시킨 메소드만 호출이 가능하고 자식만의 멤버를 호출하기 위해서는 형변환 필수
	 */
	
//	System.out.println(a.equals(a2));// 객체의 타입 같아도 다른 객체이기 떄문에

	public boolean equals(Object o) { // 오브젝트는 기본 8가지를 제외하고 모든것 상속가능
		if (o instanceof AA) {
			AA a = (AA) o; // data 멤버 변수 비교를 위한 형변환
			// 이 메소드를 보유한 객체의 data 변수와
			// parameter로 유입된 객체의 data 변수 비교
			if (data == a.data) {
				return true;
			}
		}
		return false;

	}

}

//class BB extends Object {
//	int data;
//
//	BB() {
//	}
//
//	BB(int d) {
//		data = d;
//	}
//
//	// 객체의 주소값 비교했던 메소드를 내용 값 비교로 재정의
//	/*
//	 * AA 객체들 비교 1. AA타입 여부 비교 2. AA타입이 일치된다면 AA객체들이 보유한 멤버 변수값 비교 Object 타입의 변수는
//	 * 상속시킨 메소드만 호출이 가능하고 자식만의 멤버를 호출하기 위해서는 형변환 필수
//	 */
//	public boolean equals(Object o) { // 오브젝트는 기본 8가지를 제외하고 모든것 상속가능
////		if (o instanceof AA) {
//			AA a = (AA) o; // data 멤버 변수 비교를 위한 형변환
//			// 이 메소드를 보유한 객체의 data 변수와
//			// parameter로 유입된 객체의 data 변수 비교
//			if (data == a.data) {
//				return true;
//			}
//		
//		return false;
//
//	}
//
//}
//
