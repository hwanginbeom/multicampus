package subway.controller;

import java.util.ArrayList;

import subway.domain.SubwayDTO;
import subway.model.SubwayModel;
import subway.view.RunningEndView;

public class SubwayController {
	
	static SubwayModel subwayData = SubwayModel.getInstance();
	
	//전체 출력
	public static void all() {
		
		RunningEndView.subwayListView(SubwayModel.getAllSubway()); //DTO객체들을 가져와서 
	}

	
	//데이터 추가
	public static void getSubway(SubwayDTO newDTO) {
		SubwayModel.subwayAdd(newDTO);
			RunningEndView.printMsg("역 관련 추가 데이터 삽입 완료");
	}
	
	
	//삭제
	
	public static void subwayDelete(String station, int year, int month) {
		 boolean result=SubwayModel.subwayDelete(station, year, month);
		if(result) {
			RunningEndView.printMsg("삭제 성공");
		}
		else {
			RunningEndView.printMsg("삭제 실패");
		}
	}
	

		
	// 업데이트

	public static void subwayupdate(String station, int year, int month ,SubwayDTO subway ) {
		boolean result = SubwayModel.subwayUpdate(station, year, month, subway);
		if(result) {
			RunningEndView.printMsg("역 데이터를 성공적으로 수정하였습니다.");
		}
		else {
			RunningEndView.printMsg("수정 실패하였습니다.");
		}
	}
}
