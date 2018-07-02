/* test 데이터 표현 , DTO 객체들 저장 , 수정 , 삭제 , 검색(모든 검색 , id로 검색..)의 핵심 로직을 보유
 *  1. 각 기능은 개별 메소드로 구현
 *  2. 개별 메소드에서 하나의 데이터를 공유
 *  3. 데이터를 배열 활용 : DTO 객체들 CRUD
 */

package customer.model;

import customer.domain.CustomerDTO;

public class CustomerModel {
	//5개의 메모리가 있는 배열 생성 (index 0~4 , length 변수)
	static CustomerDTO[] all = new CustomerDTO[5];
	
	//byte code가 메모리에 로딩 시 무조건 자동 실행 되는 블록
	
	//임시 test 데이터 초기화에 적합
	static {		
		all[0] = new CustomerDTO("tester" , "이상록 ", "11" , 26, "vip");
		all[1] = new CustomerDTO("admin" , "박창윤 ", "22" , 28, "vvip");
		all[2] = new CustomerDTO("master" , "김경남 ", "33" , 28, "vvip");
		all[3] = new CustomerDTO("ldh" , "이동훈 ", "55" , 27, "vip");
	}
	
	//조건 없이 모든 검색 
	public static CustomerDTO[] getall() { //메소드는 호출전에는 실행 안된다. !! static도 차이가있음
		return all;
	}
	

}
