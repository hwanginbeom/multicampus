package customer.controller;

import customer.domain.CustomerDTO;
import customer.model.CustomerModel;
import customer.view.EndView;

public class CustomerController {

	public static void all() {
		EndView.printAll(CustomerModel.getall());
	}

	public static void getOne(String id) {
		CustomerDTO one = CustomerModel.getOne(id);
		if(one != null) {
			EndView.printOne(one);
		}
		else {
			EndView.printMsg();
		}
	}
}
	
//	public static void addOne(CustomerDTO one) {
//		if()
//		EndView.printMsg("¾ÈµÊ ")
//	}
//	
//	public static void deleteOne
//	
//	public static void updateOne
//
//}
