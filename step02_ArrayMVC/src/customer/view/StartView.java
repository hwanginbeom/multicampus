package customer.view;

import customer.controller.CustomerController;

public class StartView {

	public static void main(String[] args) {
		//모든 검색 - null인 경우 절대 출력 불가
		System.out.println("*** 모두 검색 ***");
		CustomerController.all();
		
		//가입 - id가 중복 되면 가입 불가
		System.out.println("*** id로 검색 ***");
		CustomerController.getOne("tester");
		CustomerController.getOne("a");

		
		//모든 검색 
		
		//수정 - 존재하는 데이터 수정 가능 , 미 존재하는 데이터 수정 시 불가 
		
		//검색 
		
		//삭제 -  존재하는 데이터 삭제,  미 존재하는 데이터 삭제시도?
		
		//검색

	}

}
