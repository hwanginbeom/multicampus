package customer.view; //�Һ��ڰ� ������ �Կ� ���� ������ �͵��� ȣ���ϴ� �κ�

import customer.controller.CustomerController;
import customer.domain.CustomerDTO;

public class StartView {

	public static void main(String[] args) {
		//��� �˻� - null�� ��� ���� ��� �Ұ�
		System.out.println("*** ��� �˻� ***");
		CustomerController.all();
		
		
		//�˻� - id �� �˻�
		System.out.println("*** id�� �˻� ***");
		CustomerController.getOne("tester");
		CustomerController.getOne("a");

		//����
		CustomerDTO newOne = new CustomerDTO("man","������","77",26,"vip");
//		CustomerController.addOne(newOne);
		CustomerDTO newOne2 = new CustomerDTO("man","������","77",26,"vip");
//		CustomerController.addOne(newOne2);
		CustomerController.all();



		

		
		//��� �˻� 
		
		
		//���� - �����ϴ� ������ ���� ���� , �� �����ϴ� ������ ���� �� �Ұ� 
		/*id�� ����� ���� 
		 * �� , ���� ���� ?  �� ���� �������ο� ���� ��Ȳ�� �ݵ�� Ȯ�� �����ؾ��� 
		 */
		
		System.out.println("*** id�� �˻� ***");
//		CustomerController.updateOne("admin", "vvip");
//		CustomerController.updateOne("admin", "vip");
//		CustomerController.updateOne("admin1", "vvip");
		CustomerController.all();


		
		//�˻� 
		
		//���� -  �����ϴ� ������ ����,  �� �����ϴ� ������ �����õ�?
		
		System.out.println("*** ���� ***");
//		CustomerController.deleteOne("admin");
//		CustomerController.deleteOne("admin");
		CustomerController.all();


		
		
		//�˻�

	}

}
