package customer.controller;

import customer.domain.CustomerDTO;
import customer.model.CustomerModel;
import customer.view.EndView;

public class CustomerController { //요청받기
	//모든검색
	public static void all() {
		EndView.printAll(CustomerModel.getall()); //DTO객체들을 가져와서 
		
//		CustomerDTO[] all = CustomerModel.getall();
//		EndView.printAll(all);
	}
	
	//id로 해당 고객 정보만 검색
	/* Model의 getOne()의 반환 값
	 * -CustomerDTO or null
	 * -EndView에게 출력을 위임할 때 이 두가지 데이터를 어떻게 출력 요청 ?
	 * 개발 방법의 경우의 수 
	 * 1. 경우의 수 1 
	 * 		- EndView의 메소드에 무조건 출력 위임
	 * 			:EndView는 null 여부 검증
	 * 2. 경우의 수 2
	 * 		-Controller 에서 null 검증
	 * 		-null인 경우 다른 출력 메소드 호출 , null이 아닌 경우 또 다른 메소드 호출
	 */

	public static void getOne(String id ) {
		CustomerDTO one = CustomerModel.getOne(id);
		if(one != null) { // 검색 된 데이터가 존재 할 경우 true
			EndView.printOne(one);
		}
		else {
			EndView.printMsg();
		}
	}
	
	//grade로 해당 등급 들만 검색
	
	
	//가입
	
	//수정 - id를 기분으로 grade 수정
	
	//삭제 - id

}
