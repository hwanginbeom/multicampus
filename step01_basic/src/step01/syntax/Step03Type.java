package step01.syntax;

import step01.domain.FriendVO;

public class Step03Type {
	
	//FrinedVO 반환 메소드

	FriendVO getInstance() {
		//FriendVO a = new FriendVO();
		// 이 줄을 빼고 바로 리턴값으로 받는다 
		//고로 생성자 호출해서 객체 만드는 메소드이다.
		return new FriendVO();
	}
	// FriendVo 를 메소드 parameter 로 반영하는 메소드
	
	void m(FriendVO v) { // a.m(FriendVO 객체); 호출 할 떄는 값만 주면서 호출한다. 타입을 부를 필요가 없다.
		System.out.println(v.name );  //0x 받고 내이름이 나온다.
		v.name = "손영정"; // v.name 으로 새롭게 지정을 한다. 이건 리턴값이 아니라 상관없고 
									//그냥 v.name 이 바뀐거다. 주소값에 있는 것을 바꾼것이니까 
		
		
	}

	public static void main(String[] args) {
		Step03Type s = new Step03Type();     //총 객체수 2 개 지만 Friend 에 대한 객체는 하나이다.
		//s는 참조변수 
		FriendVO v2 = s.getInstance(); //0x를 주소라 가정 
		//v라는 주소번지를 가지고 v를 통해 호출하면 된다.
		System.out.println(v2.name);
		
		//v2.m(s);
		s.m(v2); // 0x 
		
		// v2 는 FriendVO 라는 타입의 객체인데 이건 s 라는 객체를 통해 getInstance를 메소드를 호출하고
		//getInstance라는 메소드는 FriendVO라는 다른 클래스의 생성자를 호출해서 객체를 만드는 것이다.
		// 그러면 v2에는 FrienVO라는 클래스의 생성 된 객체 가 들어가게 된다. 
		//m에는 FriendVO 타입의 v 라는 객체가 들어가야 되는데 그래서 v2.m(s)를 하면 
		//s는 Step03Type의 객체 이기 때문에 사용 할 수 없다.
		//m이라는 메소드를 사용하기위해서는 객체가 필요한데 그래서 s 를 쓰고 
		//m은 void 이지만 값이 넣고 호출을 해야되는 메소드 이다. 
		//이때 값은 FriendVO의 타입이기 때문에 FriendVO 타입의 값을 넣어줌으로서 사용가능 하게끔 한다.
		
		System.out.println(v2.name); 
		// 여기서 v.name이 손영정으로 바뀌는 이유는
		// 주소값에 있는 v.name을 바꾼 것이기 때문에 이름자체가 다르게 출력이 된다.

	}

}
