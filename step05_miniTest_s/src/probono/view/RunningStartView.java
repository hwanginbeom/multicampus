package probono.view;

import probono.model.dto.Activist;
import probono.model.dto.Probono;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;
import probono.service.ProbonoProjectService;

public class RunningStartView {
	
	public static void main(String[] args) {
		
		//기부자
		Activist audrey = new Activist("giver", "오드리", "pw1", "미용");
		//수혜자
		Recipient receive = new Recipient("receivePeople", "나문화", "pw2", "무상컷팅희망");
		//재능 기부 내용
		Probono audreyHepbun 
			= new Probono("audreyHepbun", "오드레햅번 프로젝트", "예술가, 문화관련 프로그램 제공, 전시ㆍ관람 등 기회제공, 미용,환경 캠페인 등 문화ㆍ예술관련 분야");
		//재능 기부 프로젝트
		ProbonoProject audreyHepbunPorject 
		= new ProbonoProject("오드"
				+ "리햅버 프로젝트", audreyHepbun, audrey, receive, "헤어미용분야");
			
		
		ProbonoProjectService service = ProbonoProjectService.getInstance();
		
		System.out.println("***** Project 생성 후 모든 Project 검색 *****");
		service.projectInsert(audreyHepbunPorject); // 생성후 삽입 
		ProbonoProject [] allProbonoProject = service.getAllProjects();	 // ProbonoProjectService service 에서 getAllprojects메소드를 호출 하는데 이건 projectList를 반환한다.
																								//이 반환한 값을 probonProject 타입에 배열 []에 allProbonoProject에 넣어준다. 그러면 여기에는 모든 projectList
																								//값이 들어가있고 이걸
		RunningEndView.projectListView(allProbonoProject);	            //RunningEndView 클래스 안에 있는 projectListView 메소드를 사용하는데 여기에는 타입을 
																								//public static void projectView(ProbonoProject project){ 이걸로 받고 이건 낵 ㅏ넣는 것 과 같은 형태고
																								// 그래서 이걸 넣어 저 메소드를 실행시켜 	System.out.println(project);	= > allProbonoProject를 출력한다.
	
		
		System.out.println("\n***** 기부자 수정 후 해당 Project 검색 *****");
		//새로운 기부자로 해당 project 변경
		Activist newAudrey = new Activist("newGiver", "나미용", "newPw3", "무상파마지원");
		service.projectUpdate("오드리햅버 프로젝트", newAudrey);		
		ProbonoProject project = service.getProbonoProject("오드리햅버 프로젝트");
		RunningEndView.projectView(project);
		

		System.out.println("\n***** 수혜자 수정 후 해당 Project 검색 *****");
		//새로운 수혜자로 해당 Project 변경
		Recipient newReceive = new Recipient("newReceivePeople", "나필요", "newPw4", "무상파마지원받길원함");
		service.projectUpdate("오드리햅버 프로젝트", newReceive);		
		ProbonoProject project2 = service.getProbonoProject("오드리햅버 프로젝트");
		RunningEndView.projectView(project2);
		
//		System.out.println("\n***** ***** *****");
//		//새로운 수혜자로 해당 Project 변경
//		Recipient newReceive1 = new Recipient("newReceivePeople", "나필요", "newPw4", "무상파마지원받길원함");
//		service.projectUpdate("바바바", newReceive1);		  // 프로젝트 이름이 안맞으면 그냥수정 안하고 끝이다.
//		ProbonoProject project3 = service.getProbonoProject("오드리햅버 프로젝트");
//		RunningEndView.projectView(project3);
		
	}
}





