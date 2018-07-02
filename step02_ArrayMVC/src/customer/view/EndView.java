package customer.view;

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

}
