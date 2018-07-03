package customer.model;


import customer.domain.CustomerDTO;

public class CustomerModel {
	
	static CustomerDTO[] all = new CustomerDTO[5]; 
	
	static {
		all[0] = new CustomerDTO( "abc" , "123" , "이나리" , 25 ,"vvip");
		all[1] = new CustomerDTO( "bcd" , "123" , "김혜연" , 25 ,"vip");
		all[2] = new CustomerDTO( "cde" , "123" , "배현주" , 25 ,"vvip");
		all[3] = new CustomerDTO( "def" , "123" , "김경남" , 27 ,"vip");

	}
	//검색
	
	public static CustomerDTO[] getall() { //메소드는 호출전에는 실행 안된다. !! static도 차이가있음
		return all;
	}

	
	//하나 검색
	public static  CustomerDTO getOne(String id) {
		CustomerDTO dto =null;
		for(int i=0 ; i<all.length ; i++) {
			dto= all[i];
			if(dto != null && dto.getId().equals(id)) {
				break;
			}
			else {
				dto=null;
			}
		}

		return dto;
		
	}
	
	
	//가입
	
	public static int addOne(CustomerDTO one) {
		int index = all.length; 
		for(int i=0; i<all.length ; i++) {
			if(all[i] == null) {
				all[i] = one;
				index = i;
			}
		}
		return index;
	}
	
	//삭제
	
	public static boolean deleteOne(String id) {
		for(int i=0 ; i<all.length ; i++) {
			if(all[i].getId().equals(id)&&all[i]!=null) {    // 어차피 같을 때는 널값이 아닌데 왜 널일때를 생각해야되는지
				all[i] = null;
				return true;
			}
		}
		return false;
	}
	
	//수정
	public static boolean updateOne(String id, String grade) {
		for(int i=0 ; i<all.length ; i++) {
			if(all[i]==null&&all[i].getId().equals(id) && !(all[i].getGrade().equals(grade))) {
				all[i].setGrade(grade);
				return true;
			}
		}
		return false;
	}
	

}
