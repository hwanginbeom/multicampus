package people.view;

import people.Model.PeopleModel;
import people.controller.PeopleController;
import people.domain.FareDTO;
import people.domain.PeopleDTO;

public class RunningStartView {

	public static void main(String[] args) {
		System.out.println("*** ��� �˻� ***");
		System.out.println("                   �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		PeopleModel.fareDTOadd();
		PeopleController.all();

		System.out.println("                   �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("                           �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		PeopleController.allFare();
		System.out.println("                           �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

		
		//�˻� - id �� �˻�
		
		System.out.println("*** year�� �˻� ***");
//		PeopleController.getpeople(2020);
		
		PeopleController.getFare(2020);
		
		

//		//����
//		PeopleDTO newOne = new PeopleDTO(2100,2020200,303,3030303,4040,1010101,40404,10101010);
//		PeopleController.addpeople(newOne);
//		PeopleController.all();
		System.out.println("*** ���� ���� ������ �߰� ***");

		
		FareDTO newOne = new FareDTO(2045,1000435436,800002345,500234500,300004545);
		PeopleController.addFare(newOne);
		PeopleController.allFare();

//
////
////		//���� - �����ϴ� ������ ���� ���� , �� �����ϴ� ������ ���� �� �Ұ� 
////		/*id�� ����� ���� 
////		 * �� , ���� ���� ?  �� ���� �������ο� ���� ��Ȳ�� �ݵ�� Ȯ�� �����ؾ��� 
//////		 */
////		
//		System.out.println("***yea�� �˻� ***");
//		PeopleDTO newOne3 = new PeopleDTO(21030,2020200,303,3030303,4040,1010101,40404,10101010);
//
//		PeopleController.peopleUpdate(2100, newOne3);
//		PeopleController.all();
		System.out.println("*** ���� �� �����͸� year�� �˻� ***");
		FareDTO newOne2 = new FareDTO(2045,154115141,222222223,343434343,45454545);
		PeopleController.fareUpdate(2045, newOne2);
		PeopleController.allFare();

		
		
////
////		
////		//���� -  �����ϴ� ������ ����,  �� �����ϴ� ������ �����õ�?
//		System.out.println("*** ���� ***");
//		PeopleController.peopleDelete(21030);
//		PeopleController.all();
//

		
		System.out.println("*** ���� �� �⵵�� �Է��ϼ��� ***");
		PeopleController.fareDelete(2045);
		PeopleController.allFare();
		
		
	}

}
