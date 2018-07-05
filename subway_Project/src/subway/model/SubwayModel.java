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

	// 모든 subway 반환
	public static ArrayList<SubwayDTO> getAllSubway() { // <ProbonoProject>로 제너릭을 안 쓸 경우 되긴하지만 ProbonoProject 타입이 사라져 이상한게 된다.
		return subwayList;
	}

	// subway 검색
	public static SubwayDTO getSubway(String station) {
		SubwayDTO subway = null;
		for (int i = 0; i < subwayList.size(); i++) { // size는
			if ((subwayList.get(i).getStation()).equals(station)) {
				subway = subwayList.get(i);
				break;
			}
		}
		return subway;
	}
	
	
	
	//추가
	public static void subwayAdd(SubwayDTO one) {
		subwayList.add(one);		
		}

	// Subway 수정 - 역 / 연도 / 월이 같을 경우 수정
	// lineName / year / month 가 맞아야 수정가능

	public static boolean subwayUpdate(String station, int year, int month, SubwayDTO subway) {
		for (int i = 0; i < subwayList.size(); i++) { // index 값으로 어느 부분에서 프로젝트 네임 인지확인하고
			if (station.equals(subwayList.get(i).getStation())) {
				if (year == subwayList.get(i).getYear()) {
					if (month == subwayList.get(i).getMonth()) {
						subwayList.get(i).setSubwayDTO(subway);
					} else {
//						System.out.println("입력하신 " + month + "월은 존재하지 않습니다.");
						return true;
					}
				} else {
//					System.out.println("입력하신" + year + " 년도는 존재하지 않습니다.");
					return true;

				}
			} else {
//				System.out.println("입력하신" + station + " 역은 존재하지 않습니다.");
				return true;

			}

		}
		return false;
	}

	//삭제 부분 
	public static boolean subwayDelete(String station, int year, int month) {
		int count = subwayList.size(); // projectList.size()이걸 변수로 저장해서 쓰면 projectList.size()를 쓸 때마다 계속 속도가 느려진다.
		for (int i = 0; i <count; i++) { // index 값으로 어느 부분에서 프로젝트 네임 인지확인하고
			if (station.equals(subwayList.get(i).getStation())) {
				if (year == subwayList.get(i).getYear()) {
					if (month == subwayList.get(i).getMonth()) {
						subwayList.remove(i);
					} else {
//						System.out.println("입력하신 " + month + "월은 존재하지 않습니다.");
						return true;
					}
				} else {
//					System.out.println("입력하신" + year + " 년도는 존재하지 않습니다.");
					return true;

				}
			} else {
//				System.out.println("입력하신" + station + " 역은 존재하지 않습니다.");
				return true;

			}

		}
		return false;
	}
	
	// Project 개수
	public static int subwayListSize() {
		return subwayList.size();
	}
	
	
	

}// 마지막 부분
