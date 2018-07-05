package subway.model;

import java.util.ArrayList;

import subway.domain.SubwayDTO;

public class SubwayModel {

	static SubwayModel instance = new SubwayModel();

	static ArrayList<SubwayDTO> subwayList = new ArrayList<SubwayDTO>();
	
	public static SubwayModel getInstance() {
		return instance;
	}

	 SubwayModel() {
	}

	// ��� subway ��ȯ
	public static ArrayList<SubwayDTO> getAllSubway() { // <ProbonoProject>�� ���ʸ��� �� �� ��� �Ǳ������� ProbonoProject Ÿ���� ����� �̻��Ѱ� �ȴ�.
		return subwayList;
	}

	// subway �˻�
	public static SubwayDTO getSubway(String station) {
		SubwayDTO subway = null;
		for (int i = 0; i < subwayList.size(); i++) { // size��
			if ((subwayList.get(i).getStation()).equals(station)) {
				subway = subwayList.get(i);
				break;
			}
		}
		return subway;
	}
	
	
	
	//�߰�
	public static void subwayAdd(SubwayDTO one) {
		subwayList.add(one);		
		}

	// Subway ���� - �� / ���� / ���� ���� ��� ����
	// lineName / year / month �� �¾ƾ� ��������

	public static boolean subwayUpdate(String station, int year, int month, SubwayDTO subway) {
		for (int i = 0; i < subwayList.size(); i++) { // index ������ ��� �κп��� ������Ʈ ���� ����Ȯ���ϰ�
			if (station.equals(subwayList.get(i).getStation())) {
				if (year == subwayList.get(i).getYear()) {
					if (month == subwayList.get(i).getMonth()) {
						subwayList.get(i).setSubwayDTO(subway);
					} else {
//						System.out.println("�Է��Ͻ� " + month + "���� �������� �ʽ��ϴ�.");
						return true;
					}
				} else {
//					System.out.println("�Է��Ͻ�" + year + " �⵵�� �������� �ʽ��ϴ�.");
					return true;

				}
			} else {
//				System.out.println("�Է��Ͻ�" + station + " ���� �������� �ʽ��ϴ�.");
				return true;

			}

		}
		return false;
	}

	//���� �κ� 
	public static boolean subwayDelete(String station, int year, int month) {
		int count = subwayList.size(); // projectList.size()�̰� ������ �����ؼ� ���� projectList.size()�� �� ������ ��� �ӵ��� ��������.
		for (int i = 0; i <count; i++) { // index ������ ��� �κп��� ������Ʈ ���� ����Ȯ���ϰ�
			if (station.equals(subwayList.get(i).getStation())) {
				if (year == subwayList.get(i).getYear()) {
					if (month == subwayList.get(i).getMonth()) {
						subwayList.remove(i);
					} else {
//						System.out.println("�Է��Ͻ� " + month + "���� �������� �ʽ��ϴ�.");
						return true;
					}
				} else {
//					System.out.println("�Է��Ͻ�" + year + " �⵵�� �������� �ʽ��ϴ�.");
					return true;

				}
			} else {
//				System.out.println("�Է��Ͻ�" + station + " ���� �������� �ʽ��ϴ�.");
				return true;

			}

		}
		return false;
	}
	
	// Project ����
	public static int subwayListSize() {
		return subwayList.size();
	}
	
	
	

}// ������ �κ�
