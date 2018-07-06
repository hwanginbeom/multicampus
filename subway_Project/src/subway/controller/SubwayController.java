package subway.controller;

import java.util.ArrayList;

import subway.domain.SubwayDTO;
import subway.model.SubwayModel;
import subway.view.RunningEndView;

public class SubwayController {

	static SubwayModel subwayData = SubwayModel.getInstance();

	// 전체 출력
	public static void all() {

		RunningEndView.subwayListView(SubwayModel.getAllSubway()); // DTO객체들을 가져와서
	}

	// 하나 출력
	public static void getSubway(String station) {
		SubwayDTO one = SubwayModel.getSubway(station);
		if (one != null) { // 검색 된 데이터가 존재 할 경우 true
			RunningEndView.printOne(one);
		} else {
			RunningEndView.printMsg();
		}
	}

	// 데이터 추가
	public static void addSubway(SubwayDTO newDTO) {
		SubwayModel.subwayAdd(newDTO);
		RunningEndView.printMsg("역 관련 추가 데이터 삽입 완료");
	}

	// 삭제

	public static void subwayDelete(String station, int year, int month) {
		int result = SubwayModel.subwayDelete(station, year, month);
		if (result == 1) {
			RunningEndView.printMsg("삭제 성공");
		} else if (result == 2) {
			RunningEndView.printMsg("입력하신" + station + " 역은 존재하지 않습니다.");
		} else if (result == 3) {
			RunningEndView.printMsg("입력하신" + year + " 년도는 존재하지 않습니다.");
		} else if (result == 4) {
			RunningEndView.printMsg("입력하신 " + month + "월은 존재하지 않습니다.");
		}
	}

	// 업데이트

	public static void subwayUpdate(String station, int year, int month, SubwayDTO subway) {
		int result = SubwayModel.subwayUpdate(station, year, month, subway);
		if (result == 1) {
			RunningEndView.printMsg("수정 성공");
		} else if (result == 2) {
			RunningEndView.printMsg("입력하신" + station + " 역은 존재하지 않습니다.");
		} else if (result == 3) {
			RunningEndView.printMsg("입력하신" + year + " 년도는 존재하지 않습니다.");
		} else if (result == 4) {
			RunningEndView.printMsg("입력하신 " + month + "월은 존재하지 않습니다.");
		}
	}
}
