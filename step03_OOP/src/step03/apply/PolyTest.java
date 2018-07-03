package step03.apply;

public class PolyTest extends Object{ //Object 자동생성
	//문자열 객체 생성후 Object(최상위) 타입으로 반환 
	
	public PolyTest() { // 자동 생성
		super();
	}
	
	public static Object getData() {
		return "문자열"; // String 객체 생성 - > 반환
	}

	public static void main(String[] args) {
//		String data = (String)getData();
//		System.out.println(data.charAt(0));
		
		//오류 : Object 가 상속 시키지 않은 변수 , 메소드는 Object
		//타입이 access(호출) 불가
		//실행 순서 : getData() -> getData()charAt(0) ->(String)
		// 우선순위를 괄호로 묶어서 준다.
		
		System.out.println(((String) getData()).charAt(0));
		

	}

}
