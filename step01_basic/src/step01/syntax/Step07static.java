package step01.syntax;

public class Step07static {

	static int no; //객체 생성 이전에 사용 가능
	int getNo() { // 객체 생성 이후에만 사용 가능
		return no;
	}
	
//	int no2; //객체 생성 이후에 사용가능
//	static int getNo2() { // 객체 생성 이전에 사용가능
//		return no2;  // 객체가 없는데 ?  no2 존재 여부 ?
//		// 이건 객체 생성하기전에 쓸 수있기 때문에 충돌이 난다 ! 
//	}
	
	public static void main(String[] args) {
//		getNo();
	

	}

}
