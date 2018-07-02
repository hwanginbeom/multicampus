package customer.controller;

import customer.domain.CustomerDTO;
import customer.model.CustomerModel;
import customer.view.EndView;

public class CustomerController { //��û�ޱ�
	//���˻�
	public static void all() {
		EndView.printAll(CustomerModel.getall()); //DTO��ü���� �����ͼ� 
		
//		CustomerDTO[] all = CustomerModel.getall();
//		EndView.printAll(all);
	}
	
	//id�� �ش� �� ������ �˻�
	/* Model�� getOne()�� ��ȯ ��
	 * -CustomerDTO or null
	 * -EndView���� ����� ������ �� �� �ΰ��� �����͸� ��� ��� ��û ?
	 * ���� ����� ����� �� 
	 * 1. ����� �� 1 
	 * 		- EndView�� �޼ҵ忡 ������ ��� ����
	 * 			:EndView�� null ���� ����
	 * 2. ����� �� 2
	 * 		-Controller ���� null ����
	 * 		-null�� ��� �ٸ� ��� �޼ҵ� ȣ�� , null�� �ƴ� ��� �� �ٸ� �޼ҵ� ȣ��
	 */

	public static void getOne(String id ) {
		CustomerDTO one = CustomerModel.getOne(id);
		if(one != null) { // �˻� �� �����Ͱ� ���� �� ��� true
			EndView.printOne(one);
		}
		else {
			EndView.printMsg();
		}
	}
	
	//����
	public static void addOne(CustomerDTO newDTO) {
		int result = CustomerModel.addOne(newDTO);
		if(result !=5) {
			EndView.printMsg("ȸ������ �Ϸ�");
		}
		else {
			EndView.printMsg("�˼��մϴ�. ���� ���� ������ �Ұ��Դϴ�.");
		}
		
	}
	
	//����
	
	public static void deleteOne(String id) {
		boolean result = CustomerModel.deleteOne(id);
		if(result) {
			EndView.printMsg(id+"ȸ���� ���� ����");
		}
		else {
			EndView.printMsg("���� ����");
		}
	}

		

	public static void update(String id, String grade) {
		boolean result = CustomerModel.update(id, grade);
		if(result) {
			EndView.printMsg(id+"ȸ������ ����� " + grade +"�� ���� ���� �Ͽ����ϴ�");
		}
		else {
			EndView.printMsg("���� ����");
		}
	}
		
	

	//grade�� �ش� ��� �鸸 �˻�
	
	
	
	//���� - id�� ������� grade ����
	
	
	
	//���� - id

}
