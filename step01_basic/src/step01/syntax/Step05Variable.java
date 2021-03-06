/*학습내용
 * 1. 변수 최기화
 * 		1.멤버 - 객체 생성시 자동 기본값으로 초기화
 * 		2.로컬 - 자동 초기화가 불가 , 따라서 사용전 초기화 필수
 * 2.기본 타입 변수간의 형변환
 * 		-타입이 다른 변수 들 간에도 "형변환" 문법으로 변환이 가능
 * 		-boolean은 절대 다른 타입으로 변환 불가
 * 		-실수는 무조건 내부적으로 정수보다 큰 메모리가 관리 
 * 
 */

package step01.syntax;

public class Step05Variable {
	
	int no; //멤버변수는 객체 생성하면 자동으로 0 이런식으로 자동 초기화 가된다.
	String msg;
	
	//로컬 변수 초기화 학습
	void localVar() {
		int no = 0; // 로컬변수는 사용하기전에 초기화를 꼭 해야한다.  초기화 하지 않으면 오류가 난다. 
		System.out.println(no);
	}
	
	//기본타입 형변환
	void typeCasting() {
		byte b = 8;  //byte 8bit
		int i = b;    //byte 32 bit  									upcasting
		byte b4 = (byte)i; // 형 변환   32bit - > 8bit 변환    downcasting
		char c= 'A'; // 16bit
		int i2 = c;
		System.out.println(c);
		System.out.println(i2);
		
		//정수의 사칙 연산시 무조건 int로 변환
		byte b1 = 8;
		byte b2 = 10; 
		byte b3 = (byte)(b1+b2);
		
	}
	

	public static void main(String[] args) {
		//객체 생성시 heap에 생성 된 no와 msg는 자동 초기화 
		

		
		Step05Variable s = new Step05Variable();
//		System.out.println(s.no);
//		System.out.println(s.msg);
		s.typeCasting();
	}

}
