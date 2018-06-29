/*학습내용
 * 1. static 키워드
 * 2. 적용 문법
 * 		1.멤버 변수 선언구
 * 			-생성되는 모든 객체들이 공유하는 변수
 * 				:공유 자원이 아닌 변수들에 사용 금지 ex) 이름 , 비밀번호 이런거등등
 * 			-static 변수가 메모리에 실제 사용가능하게 생성되는 시점은?
 * 			-Run 하는 시점에서 static을 만날 때 생성한다.
 * 			
 * 			
 * 		2.메소드 선언구
 * 			-객체 생성없이 클래스명만으로 메소드 호출가능
 * 		3.static{}
 * 			-web server가 시작 될 떄 모든 user가 공유하는 자원이 있다면 
 * 			 단 한번 실행 보장을 할 수 있는 문법
 * 			 이름이 없음 따라서 코드로 호출 불가
 * 			-byte code 가 메모리에 로딩 될 떄 자동 실행
 * 
 * 		
 */

package step01.syntax;

public class Step06static {
	
	//step01 - static 변수
	static int no1 = 100; //프로그램이 런 하고 static 을 만나는 시점 
	static String msg1 = "문자열"; // 저장과 동시에 실행 
	//  코드를 전반적으로 한 번 읽고 실행 한다 . 그러므로 스태틱을 먼저 다하고 메인을 한다. 
	
	//instance 변수
	int no2 = 200;
	String msg2 = "문자열 2 ";
	
	
	void m1() {
		System.out.println("일반 메소드");
	}
	//객체 생성없이도 class명.m2() 또는 동일한 클래스라면 m2(); 호출가능
	static void m2() { // 스태틱 메소드는 호출해야 실행한다. 스태틱 변수와 다르다.  메소드가 있어야만 호출 할 수 있다
		System.out.println("static 메소드");
	}
	
	
	
	//>java Step06static  이게 실행 명령어 인데.      Step06static.main(); 
	//클래스명으로 메소드를 호출한다 이게 문법적으로 가능한 이유는 static이기 때문이다.
	public static void main (String[] args) {
		System.out.println(no1);
		System.out.println(msg1);
		m2(); 
		Step06static.m2();
		//     스태틱은 그냥 호출 할 수 있다.
//		m1();   일반 메소드는 객체를 사용해야 한다 하지만
//		System.out.println(no2);
//		System.out.println(msg2);
		System.out.println(Math.random());
		
		//java.lang.Integer의 메소드 호출
		//"3" -> int로 변환하는 메소드 호출해서 변환하기
		/*필요한 데이터 - int 로 변경할 문자열 데이터
		 * 결과 데이터 - int로 변환된 데이터
		 * 
		 * 이 로직을 어떤 클래스에서 제공할 것 인가? 
		 * 		String? Integer?
		 * 		혹 문자열 데이터를 제외한 메소드를 보유한 객체가 필요한가 ?
		 * 
		 * byte : Byte
		 *  - public static byte parseByte(String v){}
		 */
		int no3 = Integer.parseInt("3"); // integer라는 클래스 에 있는  메소드에 들어가서 찾는다. 
		int no4 = 4;
		
		System.out.println(no3+no4);
	}
	
	
	
//	static {
//		System.out.println(2);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("main");
//	}
//	
//	static {
//		System.out.println(1);
//	}
//	

}
