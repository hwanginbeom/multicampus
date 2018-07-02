package customer.controller;

import customer.model.CustomerModel;
import customer.view.EndView;

public class CustomerController {
	//모든검색
	public static void all() {
		EndView.printAll(CustomerModel.getall());
		
//		CustomerDTO[] all = CustomerModel.getall();
//		EndView.printAll(all);
	}
	
	//grade로 해당 등급 들만 검색
	
	//id로 해당 고객 정보만 검색
	
	//가입
	
	//수정 - id를 기분으로 grade 수정
	
	//삭제 - id

}
