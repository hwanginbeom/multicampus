package subway.controller;

import java.util.ArrayList;

import subway.domain.SubwayDTO;
import subway.model.SubwayModel;
import subway.view.RunningEndView;

public class SubwayController {
	
	static SubwayModel subwayData = SubwayModel.getInstance();
	
	//��ü ���
	public static void all() {
		
		RunningEndView.subwayListView(SubwayModel.getAllSubway()); //DTO��ü���� �����ͼ� 
	}

	
	//������ �߰�
	public static void getSubway(SubwayDTO newDTO) {
		SubwayModel.subwayAdd(newDTO);
			RunningEndView.printMsg("�� ���� �߰� ������ ���� �Ϸ�");
	}
	
	
	//����
	
	public static void subwayDelete(String station, int year, int month) {
		 boolean result=SubwayModel.subwayDelete(station, year, month);
		if(result) {
			RunningEndView.printMsg("���� ����");
		}
		else {
			RunningEndView.printMsg("���� ����");
		}
	}
	

		
	// ������Ʈ

	public static void subwayupdate(String station, int year, int month ,SubwayDTO subway ) {
		boolean result = SubwayModel.subwayUpdate(station, year, month, subway);
		if(result) {
			RunningEndView.printMsg("�� �����͸� ���������� �����Ͽ����ϴ�.");
		}
		else {
			RunningEndView.printMsg("���� �����Ͽ����ϴ�.");
		}
	}
}
