package people.view;

import people.Model.PeopleModel;
import people.controller.PeopleController;
import people.domain.FareDTO;
import people.domain.PeopleDTO;

public class RunningStartView {

	public static void main(String[] args) {
		System.out.println("*** 모두 검색 ***");
		System.out.println("                   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		PeopleModel.fareDTOadd();
		PeopleController.all();

		System.out.println("                   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("                           ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		PeopleController.allFare();
		System.out.println("                           ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		
		//검색 - id 로 검색
		
		System.out.println("*** year로 검색 ***");
//		PeopleController.getpeople(2020);
		
		PeopleController.getFare(2020);
		
		

//		//가입
//		PeopleDTO newOne = new PeopleDTO(2100,2020200,303,3030303,4040,1010101,40404,10101010);
//		PeopleController.addpeople(newOne);
//		PeopleController.all();
		System.out.println("*** 세금 관련 데이터 추가 ***");

		
		FareDTO newOne = new FareDTO(2045,1000435436,800002345,500234500,300004545);
		PeopleController.addFare(newOne);
		PeopleController.allFare();

//
////
////		//수정 - 존재하는 데이터 수정 가능 , 미 존재하는 데이터 수정 시 불가 
////		/*id로 등급을 수정 
////		 * 단 , 정상 수정 ?  비 정상 수정여부에 대한 상황은 반드시 확인 가능해야함 
//////		 */
////		
//		System.out.println("***yea로 검색 ***");
//		PeopleDTO newOne3 = new PeopleDTO(21030,2020200,303,3030303,4040,1010101,40404,10101010);
//
//		PeopleController.peopleUpdate(2100, newOne3);
//		PeopleController.all();
		System.out.println("*** 수정 할 데이터를 year로 검색 ***");
		FareDTO newOne2 = new FareDTO(2045,154115141,222222223,343434343,45454545);
		PeopleController.fareUpdate(2045, newOne2);
		PeopleController.allFare();

		
		
////
////		
////		//삭제 -  존재하는 데이터 삭제,  미 존재하는 데이터 삭제시도?
//		System.out.println("*** 삭제 ***");
//		PeopleController.peopleDelete(21030);
//		PeopleController.all();
//

		
		System.out.println("*** 삭제 할 년도를 입력하세요 ***");
		PeopleController.fareDelete(2045);
		PeopleController.allFare();
		
		
	}

}
