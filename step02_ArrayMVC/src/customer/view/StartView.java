package customer.view;

import customer.controller.CustomerController;

public class StartView {

	public static void main(String[] args) {
		//��� �˻� - null�� ��� ���� ��� �Ұ�
		System.out.println("*** ��� �˻� ***");
		CustomerController.all();
		
		//���� - id�� �ߺ� �Ǹ� ���� �Ұ�
		System.out.println("*** id�� �˻� ***");
		CustomerController.getOne("tester");
		CustomerController.getOne("a");

		
		//��� �˻� 
		
		//���� - �����ϴ� ������ ���� ���� , �� �����ϴ� ������ ���� �� �Ұ� 
		
		//�˻� 
		
		//���� -  �����ϴ� ������ ����,  �� �����ϴ� ������ �����õ�?
		
		//�˻�

	}

}
