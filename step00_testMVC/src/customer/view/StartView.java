package customer.view; //소비자가 무엇을 함에 따라 나오는 것들을 호출하는 부분

import customer.controller.CustomerController;
import customer.domain.CustomerDTO;

public class StartView {

	public static void main(String[] args) {
		//모든 검색 - null인 경우 절대 출력 불가
		System.out.println("*** 모두 검색 ***");
		CustomerController.all();
		
		
		//검색 - id 로 검색
		System.out.println("*** id로 검색 ***");
		CustomerController.getOne("tester");
		CustomerController.getOne("a");

		//가입
		CustomerDTO newOne = new CustomerDTO("man","허윤길","77",26,"vip");
//		CustomerController.addOne(newOne);
		CustomerDTO newOne2 = new CustomerDTO("man","허윤길","77",26,"vip");
//		CustomerController.addOne(newOne2);
		CustomerController.all();



		

		
		//모든 검색 
		
		
		//수정 - 존재하는 데이터 수정 가능 , 미 존재하는 데이터 수정 시 불가 
		/*id로 등급을 수정 
		 * 단 , 정상 수정 ?  비 정상 수정여부에 대한 상황은 반드시 확인 가능해야함 
		 */
		
		System.out.println("*** id로 검색 ***");
//		CustomerController.updateOne("admin", "vvip");
//		CustomerController.updateOne("admin", "vip");
//		CustomerController.updateOne("admin1", "vvip");
		CustomerController.all();


		
		//검색 
		
		//삭제 -  존재하는 데이터 삭제,  미 존재하는 데이터 삭제시도?
		
		System.out.println("*** 삭제 ***");
//		CustomerController.deleteOne("admin");
//		CustomerController.deleteOne("admin");
		CustomerController.all();


		
		
		//검색

	}

}
