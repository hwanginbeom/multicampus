package people.view;

import people.controller.PeopleController;
import people.domain.PeopleDTO;

public class RunningStartView {

	public static void main(String[] args) {
		System.out.println("*** ��� �˻� ***");
		PeopleController.all();
		
		//�˻� - id �� �˻�
		System.out.println("*** id�� �˻� ***");
		PeopleController.getpeople(2020);

		//����
		PeopleDTO newOne = new PeopleDTO(2100,2020200,303,3030303,4040,1010101,40404,10101010);
		PeopleController.addpeople(newOne);
		PeopleController.all();

//
//		//���� - �����ϴ� ������ ���� ���� , �� �����ϴ� ������ ���� �� �Ұ� 
//		/*id�� ����� ���� 
//		 * �� , ���� ���� ?  �� ���� �������ο� ���� ��Ȳ�� �ݵ�� Ȯ�� �����ؾ��� 
////		 */
//		
		System.out.println("***yea�� �˻� ***");
		PeopleDTO newOne3 = new PeopleDTO(21030,2020200,303,3030303,4040,1010101,40404,10101010);

		PeopleController.peopleUpdate(2100, newOne3);
		PeopleController.all();
//
//		
//		//���� -  �����ϴ� ������ ����,  �� �����ϴ� ������ �����õ�?
		System.out.println("*** ���� ***");
		PeopleController.peopleDelete(21030);
		PeopleController.all();
//

		
		
	}

}
