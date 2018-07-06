package people.controller;

import java.util.ArrayList;

import people.Model.PeopleModel;
import people.domain.PeopleDTO;
import people.view.RunningEndView;

public class PeopleController {

	static PeopleModel peopleData = PeopleModel.getInstance();

	// ��ü ���
	public static void all() {

		RunningEndView.peopleListView(PeopleModel.getAllpeople()); // DTO��ü���� �����ͼ�
	}

	// �ϳ� ���
	public static void getpeople(int year) {
		PeopleDTO one = PeopleModel.getpeople(year);
		if (one != null) { // �˻� �� �����Ͱ� ���� �� ��� true
			RunningEndView.printOne(one);
		} else {
			RunningEndView.printMsg();
		}
	}

	// ������ �߰�
	public static void addpeople(PeopleDTO newDTO) {
		PeopleModel.peopleAdd(newDTO);
		RunningEndView.printMsg("�� ���� �߰� ������ ���� �Ϸ�");
	}

	// ����

	public static void peopleDelete( int year) {
		boolean result = PeopleModel.peopleDelete(year);
		if (result) {
			RunningEndView.printMsg("���� ����");
		}
		else {
			RunningEndView.printMsg("���� ����");

		}
		
	}

	// ������Ʈ

	public static void peopleUpdate( int year ,PeopleDTO people) {
		boolean result = PeopleModel.peopleUpdate(year,people);
		if (result) {
			RunningEndView.printMsg("���� ����");
		}
		else {
			RunningEndView.printMsg("���� ����");

		}
	}
}
