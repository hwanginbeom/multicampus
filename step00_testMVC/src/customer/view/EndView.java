package customer.view;

import customer.domain.CustomerDTO;

public class EndView {
	public static void printAll(CustomerDTO[] all) {
		for(int i=0 ; i<all.length ; i++) {
			if(all[i]!=null) {
			System.out.println(all[i].toString());
			}
		}
	}
	
	public static void printOne(CustomerDTO one) {
		System.out.println(one.toString());
		
	}
	
	public static void printMsg() {
		System.out.println("요청 하신 정보는 불가 합니다.");
		
	}
	

	public static void printMsg(String msg) {
		System.out.println(msg);
	}


	


}
