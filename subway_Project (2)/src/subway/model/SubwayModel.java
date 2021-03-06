package subway.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import subway.domain.SubwayDTO;

public class SubwayModel {

	static SubwayModel instance = new SubwayModel();

	static ArrayList<SubwayDTO> subwayList = new ArrayList<SubwayDTO>();

	// static { // 배열을 하나하나의 객체를 만든다. / static을 이렇게 쓰는건지 / endview에 있는 부분이
	// CustomerController에 있어야 되는거 아닌지
	// subwayList.add(new SubwayDTO (1 , 4, "12" ,"bas", 21, 31,191));
	// subwayList.add(new SubwayDTO (2 , 3, "13" ,"bcd", 22, 32,192));
	// subwayList.add(new SubwayDTO (3 , 2, "14" ,"제기동", 23, 33,193));
	// subwayList.add(new SubwayDTO (4 , 1, "15" ,"강남", 24, 34,194));
	// }

	// step03 - file로부터 read해서 출력

	// split 메소드를 이용해서, data에 있는 정보들을 나눠서 개수를 확인해봐라

	// read 객체
	static BufferedReader in = null;

	// data.txt 파일에 2byte로 출력
	static BufferedWriter out = null;
static {
	try
	{
		in = new BufferedReader(new FileReader("subwaydata.csv"));
		out = new BufferedWriter(new FileWriter("subwaydata1.txt")); // Buffering기능을 쓰면서 2byte 출력 가능 생성(초기화)
		String data = in.readLine();
		data = in.readLine();
		String[] splitData = data.split(",");
		while (data != null) {
			// System.out.println(data);
			splitData = data.split(",");
			data = in.readLine();
            subwayList.add(new SubwayDTO(Integer.parseInt(splitData[0]),Integer.parseInt(splitData[1]),
            		(splitData[2]),(splitData[3]),Integer.parseInt(splitData[4])
            				,Integer.parseInt(splitData[5]),Integer.parseInt(splitData[6]))) ;

			out.flush();// 데이터 손실을 위해서 목적지에 데이터 출력 보장
		}

	}catch(
	IOException e)
	{
		e.printStackTrace();
	}finally
	{
		try {
			in.close();// 사용했던 시스템 자원을 반환하기
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

	public static SubwayModel getInstance() {
		return instance;
	}

	SubwayModel() {
	}

	// 모든 subway 반환
	public static ArrayList<SubwayDTO> getAllSubway() { // <ProbonoProject>로 제너릭을 안 쓸 경우 되긴하지만 ProbonoProject 타입이 사라져
														// 이상한게 된다.
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

	// 추가
	public static void subwayAdd(SubwayDTO one) {
		subwayList.add(one);
	}

	// Subway 수정 - 역 / 연도 / 월이 같을 경우 수정
	// lineName / year / month 가 맞아야 수정가능

	public static int subwayUpdate(String station, int year, int month, SubwayDTO subway) {
		for (int i = 0; i < subwayList.size(); i++) { // index 값으로 어느 부분에서 프로젝트 네임 인지확인하고
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
						// System.out.println("입력하신 " + month + "월은 존재하지 않습니다.");
						return 2;
					}
				} else {
					// System.out.println("입력하신" + year + " 년도는 존재하지 않습니다.");
					return 3;

				}
			}

		}
		return 4;
		// System.out.println("입력하신" + station + " 역은 존재하지 않습니다.");

	}

	// 삭제 부분
	public static int subwayDelete(String station, int year, int month) {
		int count = subwayList.size(); // projectList.size()이걸 변수로 저장해서 쓰면 projectList.size()를 쓸 때마다 계속 속도가 느려진다.
		for (int i = 0; i < count; i++) { // index 값으로 어느 부분에서 프로젝트 네임 인지확인하고
			if (station.equals(subwayList.get(i).getStation())) {
				if (year == subwayList.get(i).getYear()) {
					if (month == subwayList.get(i).getMonth()) {
						subwayList.remove(i);
						return 1;
					} else {
						// System.out.println("입력하신 " + month + "월은 존재하지 않습니다.");
						return 2;
					}
				} else {
					// System.out.println("입력하신" + year + " 년도는 존재하지 않습니다.");
					return 3;

				}
			}

		}
		return 4;
		// System.out.println("입력하신" + station + " 역은 존재하지 않습니다.");

	}

	// subway 개수
	public static int subwayListSize() {
		return subwayList.size();
	}

}// 마지막 부분
