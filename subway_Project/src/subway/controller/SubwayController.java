package subway.controller;

import java.util.ArrayList;

import subway.domain.SubwayDTO;
import subway.model.SubwayModel;
import subway.view.RunningEndView;

public class SubwayController {

	static SubwayModel subwayData = SubwayModel.getInstance();

	// ��ü ���
	public static void all() {

		RunningEndView.subwayListView(SubwayModel.getAllSubway()); // DTO��ü���� �����ͼ�
	}

	// �ϳ� ���
	public static void getSubway(String station) {
		SubwayDTO one = SubwayModel.getSubway(station);
		if (one != null) { // �˻� �� �����Ͱ� ���� �� ��� true
			RunningEndView.printOne(one);
		} else {
			RunningEndView.printMsg();
		}
	}

	// ������ �߰�
	public static void addSubway(SubwayDTO newDTO) {
		SubwayModel.subwayAdd(newDTO);
		RunningEndView.printMsg("�� ���� �߰� ������ ���� �Ϸ�");
	}

	// ����

	public static void subwayDelete(String station, int year, int month) {
		int result = SubwayModel.subwayDelete(station, year, month);
		if (result == 1) {
			RunningEndView.printMsg("���� ����");
		} else if (result == 2) {
			RunningEndView.printMsg("�Է��Ͻ�" + station + " ���� �������� �ʽ��ϴ�.");
		} else if (result == 3) {
			RunningEndView.printMsg("�Է��Ͻ�" + year + " �⵵�� �������� �ʽ��ϴ�.");
		} else if (result == 4) {
			RunningEndView.printMsg("�Է��Ͻ� " + month + "���� �������� �ʽ��ϴ�.");
		}
	}

	// ������Ʈ

	public static void subwayUpdate(String station, int year, int month, SubwayDTO subway) {
		int result = SubwayModel.subwayUpdate(station, year, month, subway);
		if (result == 1) {
			RunningEndView.printMsg("���� ����");
		} else if (result == 2) {
			RunningEndView.printMsg("�Է��Ͻ�" + station + " ���� �������� �ʽ��ϴ�.");
		} else if (result == 3) {
			RunningEndView.printMsg("�Է��Ͻ�" + year + " �⵵�� �������� �ʽ��ϴ�.");
		} else if (result == 4) {
			RunningEndView.printMsg("�Է��Ͻ� " + month + "���� �������� �ʽ��ϴ�.");
		}
	}
}
