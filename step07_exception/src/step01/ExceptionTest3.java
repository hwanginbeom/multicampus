package step01;

public class ExceptionTest3 {
	// id값의 검증 - tester
	// if조건식으로
	static void idCheck1(String id) {
		if("tester".equals(id)) {
			System.out.println("회원");
		}else {
			System.out.println("비회원");
		}
	}
	
	// exception 처리
	// 상황에 맞게 개발자가 직접 예외를 발생 -> 처리
	static void idCheck2(String id) throws Exception{
		if(!"tester".equals(id)) {//true인 경우 if블록만
			throw new Exception("비회원");
		}
		System.out.println("회원"); //if에서 true면 여기로 못온다
	}
	
	public static void main(String[] args) {
		idCheck1("tester");
		try {
		idCheck2("test");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

