package step01.service;

import step01.domain.FriendVO;

public class FriendTest {
		public static void main(String [] a) {	//java program 의 start point 필수 메소드

			FriendVO p1 = new FriendVO(); //생성자 호출하고 대기 
			System.out.println(p1); //위치 출력  생성된 패키지 / 클래스 / + 위치명
			System.out.println(p1.name + " " + p1.cellphone + " "  + p1.age);
					
			FriendVO p2 = new FriendVO("서영상",  "000-0000-0000" ,  26); //생성자
//			p2.name = "서영상";
//			p2.age = 26;
//			p2.cellphone = "000-000-000";
			
			System.out.println(p2); //위치 출력  생성된 패키지 / 클래스 / + 위치명
			System.out.println(p2.name + " " + p2.cellphone + " "  + p2.age);
			
			FriendVO p3 = new FriendVO();
			p3.name = "서아영";
			p3.age =26;
			p3.cellphone = "000-000-000";
			System.out.println(p3); //위치 출력  생성된 패키지 / 클래스 / + 위치명
			System.out.println(p3.name + " " +p3.cellphone + " " + p3.age);
				

		}//end of main
}// end of class 
//객체는 3개 ! 
