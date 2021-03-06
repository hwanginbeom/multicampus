package customer.view; //출력 단에 나오는 것을 보여준다.

import customer.domain.CustomerDTO;

public class EndView {
	//모든 고객 정보 출력
	public static void printAll(CustomerDTO[] all) {
		for(int i=0 ; i<all.length ; i++) {
			if(all[i] != null) {
			System.out.println(all[i].toString());
			}
		}
	}
	
	//데이터가 null인 경우 단순 메세지 출력
	
	//데이터가 CustomerDTO인 경우 해당 데이터 내용 출력
	public static void printOne(CustomerDTO one) {
		System.out.println(one.toString());
	}

	public static void printMsg() {
		System.out.println("요청하신 정보가 미 존재합니다.");
	}



	public static void printMsg(String  msg) {
		System.out.println(msg);
	}
	

	

	

}
