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
	static {	 // 배열을 하나하나의 객체를 만든다. / static을   이렇게 쓰는건지 / endview에 있는 부분이 CustomerController에  있어야 되는거 아닌지 
		all[0] = new CustomerDTO("tester" , "이상록 ", "11" , 26, "vip");
		all[1] = new CustomerDTO("admin" , "박창윤 ", "22" , 28, "vvip");
		all[2] = new CustomerDTO("master" , "김경남 ", "33" , 28, "vvip");
		all[3] = new CustomerDTO("ldh" , "이동훈 ", "55" , 27, "vip");
	}
	//삭제
	/*id로 해당 고객 삭제하기 ( 배열의 해당 index 에 null대입 )
	 * 1.필요한 데이터 : id
	 * 2.반환 타입 : boolean
	 * 
	 */
	public static boolean deleteOne(String id){
		for(int i=0 ; i<all.length ; i++) {
			if(all[i] != null && all[i].getId().equals(id)) {
				all[i] = null;
				return true;
			}
		}
		return false ;
	}
	
	
	//가입
	/*[1]구현 관점에만
	 * 1. 경우의 수 1 - 마지막 배열 영역에 단순 저장(all[4] = DTO 객체변수)
	 *2. 경우의 수 2 - null일 수 도 있는 즉 delete로 삭제한 메모리 영역이 있다면 
	 *						해당 index에 저장
	 *[2] 호출 관점
	 *1.null이 존재할 경우 해당 위치에 새로운 CustomerDTO 저장
	 *2.null이 없음 .. 이 경우 호출한 곳에서는 상황 판단이 어렵다.
	 *		-반환 값이 5(배열의 전체 크기) 인 경우 데이터 저장 실패
	 *		-반환 값이 5가 아닌 경우 데이터 저장 성공
	 */
	public static int addOne(CustomerDTO one) {
		int index = all.length; // 5 
		for(int i=0 ; i< all.length ; i++) {
			if(all[i] == null) {
				all[i] = one;
				index = i; //5인 index 변수 값을 저장시킨 배열의 index갑스로 대입
				break;
			}
		}
		return index; //5또는 저장 된 배열의 index 값이 반환
	}
	
	
	//조건 없이 모든 검색 
	public static CustomerDTO[] getall() { //메소드는 호출전에는 실행 안된다. !! static도 차이가있음
		return all;
	}
	
	/*id 값으로 해당 고객의 모든 정보 반환 
	 * 1. parameter - Stirng id 
	 * 2. 반환 타입 - CustomerDTO
	 * 
	 * 값 비교시 필요한 API - equals()
	 *비교 - 조건식
	 *배열에는 여러개의 DTO 객체들 - 반복
	 *
	 *데이터가 존재하면 해당 DTO 객체 반환 
	 *해당 데이터가 미 존재시 null 값 반환 
	 */
	public static CustomerDTO getOne(String id ) { 
		CustomerDTO dto = null ;  // return 반환하기 위해 처음 부분에 초기홯나다.
		for(int i=0 ; i<all.length; i++) {
			dto = all[i];
			if(dto != null && dto.getId().equals(id)) { //tester
				break; //반복문 종료하는 제어문자
			}
			else {
				dto = null;
			}
		}
		return dto;
	}
	
	public static void main(String[] args) {
//		System.out.println(getOne("tester"));
//		System.out.println(getOne("testers"));
		System.out.println(all[4]);
		System.out.println(all.length);
		
	}


	public static boolean update(String id , String grade) {
		CustomerDTO dto = null ;  // return 반환하기 위해 처음 부분에 초기홯나다.
		for(int i=0 ; i<all.length; i++) {
			dto = all[i];
			if(dto != null && dto.getId().equals(id) && !(dto.getGrade().equals(grade))) { //tester
				dto.setGrade(grade);
				return true;
			}
		}
		return false;
	}
	

}
