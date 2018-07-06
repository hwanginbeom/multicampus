package subway.view;

import subway.controller.SubwayController;
import subway.domain.SubwayDTO;

public class RunningStartView {

	public static void main(String[] args) {
		System.out.println("*** 모두 검색 ***");
		SubwayController.all();
		
		//검색 - id 로 검색
		System.out.println("*** id로 검색 ***");
		SubwayController.getSubway("제기동");

		//가입
		SubwayDTO newOne = new SubwayDTO(1 , 4, "12" ,"abc", 21, 31,191);
		SubwayController.addSubway(newOne);
		SubwayDTO newOne2 = new SubwayDTO(1 , 4, "12" ,"abc", 21, 31,191);
		SubwayController.addSubway(newOne2);
		SubwayController.all();


		//수정 - 존재하는 데이터 수정 가능 , 미 존재하는 데이터 수정 시 불가 
		/*id로 등급을 수정 
		 * 단 , 정상 수정 ?  비 정상 수정여부에 대한 상황은 반드시 확인 가능해야함 
//		 */
		
		System.out.println("*** staion / year / month 로 검색 ***");
		SubwayDTO newOne3 = new SubwayDTO(3 , 141, "가나다라" ,"abc", 21, 31,191);

		SubwayController.subwayUpdate("제기동", 2,3, newOne3);
		SubwayController.subwayUpdate("admin",3,2, newOne);
		SubwayController.all();
//
//		
//		//삭제 -  존재하는 데이터 삭제,  미 존재하는 데이터 삭제시도?
		System.out.println("*** 삭제 ***");
		SubwayController.subwayDelete("강남", 1,4 );
		SubwayController.all();
//

		
		
	}

}
