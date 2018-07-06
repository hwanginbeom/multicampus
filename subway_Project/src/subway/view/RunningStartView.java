package subway.view;

import subway.controller.SubwayController;
import subway.domain.SubwayDTO;

public class RunningStartView {

	public static void main(String[] args) {
		System.out.println("*** ��� �˻� ***");
		SubwayController.all();
		
		//�˻� - id �� �˻�
		System.out.println("*** id�� �˻� ***");
		SubwayController.getSubway("���⵿");

		//����
		SubwayDTO newOne = new SubwayDTO(1 , 4, "12" ,"abc", 21, 31,191);
		SubwayController.addSubway(newOne);
		SubwayDTO newOne2 = new SubwayDTO(1 , 4, "12" ,"abc", 21, 31,191);
		SubwayController.addSubway(newOne2);
		SubwayController.all();


		//���� - �����ϴ� ������ ���� ���� , �� �����ϴ� ������ ���� �� �Ұ� 
		/*id�� ����� ���� 
		 * �� , ���� ���� ?  �� ���� �������ο� ���� ��Ȳ�� �ݵ�� Ȯ�� �����ؾ��� 
//		 */
		
		System.out.println("*** staion / year / month �� �˻� ***");
		SubwayDTO newOne3 = new SubwayDTO(3 , 141, "�����ٶ�" ,"abc", 21, 31,191);

		SubwayController.subwayUpdate("���⵿", 2,3, newOne3);
		SubwayController.subwayUpdate("admin",3,2, newOne);
		SubwayController.all();
//
//		
//		//���� -  �����ϴ� ������ ����,  �� �����ϴ� ������ �����õ�?
		System.out.println("*** ���� ***");
		SubwayController.subwayDelete("����", 1,4 );
		SubwayController.all();
//

		
		
	}

}
