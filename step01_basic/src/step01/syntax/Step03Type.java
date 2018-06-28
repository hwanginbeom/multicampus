package step01.syntax;

import step01.domain.FriendVO;

public class Step03Type {
	
	//FrinedVO 반환 메소드

	FriendVO getInstance() {
		return new FriendVO();
	}
	// FriendVo 를 메소드 parameter 로 반영하는 메소드
	
	void m(FriendVO v) { // a.m(FriendVO 객체); 호출 할 떄는 값만 주면서 호출한다. 타입을 부를 필요가 없다.
		System.out.println(v.name ); 
		
		
	}

	public static void main(String[] args) {
		Step03Type s = new Step03Type();
		FriendVO v = s.getInstance();
		System.out.println(v.name);
		

	}

}
