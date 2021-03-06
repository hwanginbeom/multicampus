/*학습 
 * 1.기본 syntax 복습
 * 2.변수 생성(선언) , 변수 초기화(값 대입)
 * 	     메소드 생성(구현),메소드 호출
 * 		생성자 구현, 생성자 호출
 * 3.각 구성 요소의 용도
 * 		1.변수 - 데이터 표현
 * 		2.메소드 - 다양한 처리기능 구현
 * 			반환 타입 메소드명 ([]) {[..]}
 * 		3.생성자 - 객체 생성시 호출되는 필수 구성 요소
 * 		
 */

package step01.syntax;

public class Step02Type {
	//황인범 , 27 
	String name;
	int age;
	
	public Step02Type() {}// 기본 생성자
	

	//Step02 Type 객체 반환 메소드
	Step02Type getObject() {
		Step02Type s = new Step02Type(); // 객체 생성 문법  s가 가지는건 생성된 객체의 주소값
		return s;
	}
	
	Step02Type getObject2() {
		return new Step02Type(); //  new new Step02Type() 이 1번으로 시작 되고 2번이 return
	}
	
	public static void main(String[] args) {
		//step02 - 메소드 호출해서 객체 받아오기 
		//클래스 내에 존재하는 변수 , 메소드 들을 실제 실행하기 위해서는 
		//반드시 변수 , 메소드를 보유한 객체 생성이 우선 
		// getObject() 호출해보기 
		
		Step02Type s = new Step02Type(); // 객체 만들기 위해 생성자를 호출하는 부분 
		//s가 가진 모든 메소드 호출할수 있다. 이것 보단 Step02Type이 가지고 있는 메소드를 호출 가능케함
		System.out.println(s); // 이 s 의 주소와 v 의 주소는 다르다.  s2는 0x라 가정 
		//이 객체 생성이 기본이다 이걸 해야 다른 것을 불러올수 있다. 객체가 있어야 메소드를 사용 할수 있다.
		// 이 s 라는 객체를 이용해서 v 라는 새로운 객체를 만든다.
		//호출 하는 관점에서 s
		Step02Type v = s.getObject(); // 객체를 메소드 안에 있는 생성자를 이용해 객체를 받아온다.
		//s안에 있는 Step02Type 에 메소드를 사용하는데 getObject의 메소드는 생성자를 호출하여 만드는
		//메소드 이다. 그래서 v 라는 것에 대해 새로운 객체가 형성 된다. 
		// 이 때 v 는 Step02Type의 타입의 v 라는 객체인데 
		//
		
		
		Step02Type z = s.getObject(); // 객체를 메소드 안에 있는 생성자를 이용해 객체를 받아온다.
		System.out.println(z); // 여기서 v 는 s 라는 객체를 통해 메소드를 호출하기 위해 이용했을 뿐 다른 객체다.
		System.out.println(v); // 여기서 v 는 s 라는 객체를 통해 메소드를 호출하기 위해 이용했을 뿐 다른 객체다.
		//v 는 0x 주소값? 0x 가 아닐까요? 주소값은 다르다 !
		//new 개수만큼 새로운 주소를 만든다고 생각하면 된다.
		System.out.println(v.name);


		
		
		//정보를 각 변수에 저장 , 화면 콘솔창에 출력
		/* 1. 객체 생성 - new 생성자()
		 * 2. 생성한 객체를 참조하는 변수로 각각의 name,age 변수에 값을 대입
		 * 3. 각 변수값 호출해서 출력
		 */
		
		s.name = "황인범";
		s.age = 27;
		System.out.print(s.name);
		System.out.println(s.age);


	}

}
