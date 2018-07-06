package subway.model;

import java.util.ArrayList;

import subway.domain.SubwayDTO;

public class SubwayModel {
	

	
	

	static SubwayModel instance = new SubwayModel();

	static ArrayList<SubwayDTO> subwayList = new ArrayList<SubwayDTO>();
	
	static {	 // �迭�� �ϳ��ϳ��� ��ü�� �����. / static��   �̷��� ���°��� / endview�� �ִ� �κ��� CustomerController��  �־�� �Ǵ°� �ƴ��� 
		subwayList.add(new SubwayDTO (1 , 4, "12" ,"bas", 21, 31,191));
		subwayList.add(new SubwayDTO (2 , 3, "13" ,"bcd", 22, 32,192));
		subwayList.add(new SubwayDTO (3 , 2, "14" ,"���⵿", 23, 33,193));
		subwayList.add(new SubwayDTO (4 , 1, "15" ,"����", 24, 34,194));
	}
	
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

	public static int subwayUpdate(String station, int year, int month, SubwayDTO subway) {
		for (int i = 0; i < subwayList.size(); i++) { // index ������ ��� �κп��� ������Ʈ ���� ����Ȯ���ϰ�
			if (station.equals(subwayList.get(i).getStation())) {
				if (year == subwayList.get(i).getYear()) {
					if (month == subwayList.get(i).getMonth()) {
						System.out.println("-----------------------------------------");
						subwayList.get(i).setMonth(subway.getMonth());
						subwayList.get(i).setYear(subway.getYear());
						subwayList.get(i).setlineName(subway.getlineName());
						subwayList.get(i).setStation(subway.getStation());
						subwayList.get(i).setFeePassenger(subway.getFeePassenger());
						subwayList.get(i).setFreePassenger(subway.getFreePassenger());
						subwayList.get(i).setTotalPassenger(subway.getTotalPassenger());

						
						return 1;
					} else {
//						System.out.println("�Է��Ͻ� " + month + "���� �������� �ʽ��ϴ�.");
						return 2;
					}
				} else {
//					System.out.println("�Է��Ͻ�" + year + " �⵵�� �������� �ʽ��ϴ�.");
					return 3;

				}
			}
		
		}
		return 4;
//		System.out.println("�Է��Ͻ�" + station + " ���� �������� �ʽ��ϴ�.");

	}

	//���� �κ� 
	public static int subwayDelete(String station, int year, int month) {
		int count = subwayList.size(); // projectList.size()�̰� ������ �����ؼ� ���� projectList.size()�� �� ������ ��� �ӵ��� ��������.
		for (int i = 0; i <count; i++) { // index ������ ��� �κп��� ������Ʈ ���� ����Ȯ���ϰ�
			if (station.equals(subwayList.get(i).getStation())) {
				if (year == subwayList.get(i).getYear()) {
					if (month == subwayList.get(i).getMonth()) {
						subwayList.remove(i);
						return 1;
					} else {
//						System.out.println("�Է��Ͻ� " + month + "���� �������� �ʽ��ϴ�.");
						return 2;
					}
				} else {
//					System.out.println("�Է��Ͻ�" + year + " �⵵�� �������� �ʽ��ϴ�.");
					return 3;

				}
			}
		
		}
		return 4;
//		System.out.println("�Է��Ͻ�" + station + " ���� �������� �ʽ��ϴ�.");

	}
	
	// subway ����
	public static int subwayListSize() {
		return subwayList.size();
	}
	
	
	

}// ������ �κ�
