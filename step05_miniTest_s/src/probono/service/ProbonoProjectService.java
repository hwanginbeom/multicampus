/* 1. 서버 내부에 이 객체 수를 하나만 절대적으로 보장하는 구조
 * 2. singleton design pattern
 * 		1. 객체 수는 무조건 하나
 * 		2. 개발 구조
 * 			1. 생성자는 외부 클래스에게 은닉
 * 				-private 생성자([..]){[..]}
 * 			2. 동일한 클래스 내에서 생성자 호출 
 * 				-객체 생성
 * 			3. 생성된 객체를 외부 클래스에서 사용하게 하려면 ? 
 * 				-생성된 객체의 주소 값 반환
 * 				- 이 기능의 메소드는 public
 * 				-이 메소드의 호출 시점은 외부 클래스에서 객체 생성없이
 * 				호출 따라서 메소드 static
 * 
 *  instance 라는 객체와 getInstace라는 메소드가있으면 보통 singleton 이다
 *  이거 질문 한번더.
 */

package probono.service;

import probono.model.dto.Activist;
import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

public class ProbonoProjectService {

	private static ProbonoProjectService instance = new ProbonoProjectService();

	private ProbonoProject[] projectList = new ProbonoProject[10];
	private int index;

	private ProbonoProjectService() {
	}

	public static ProbonoProjectService getInstance() {
		return instance;
	}

	// 모든 Project 반환
	public ProbonoProject[] getAllProjects() {
		return projectList;
	}

	// Project 검색
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				project = projectList[i];
				break;
			}
		}
		return project;
	}

	// Project 추가
	public void projectInsert(ProbonoProject project) {
		projectList[index++] = project;
	}

	// ??? 다형성 적용 메소드로 확장하기
	// instanceof - 객체 타입 비교 연산자 활용
	// Project 수정 - 프로젝트 명으로 재능 기부자 수정
	public void projectUpdate(String projectName, People people) {
		if (people instanceof Activist) {
			Activist a = (Activist) people; // 형변환
			for (int i = 0; i < index; i++) { // index 값으로 어느 부분에서 프로젝트 네임 인지확인하고
				if (projectName.equals(projectList[i].getProbonoProjectName())) {
					projectList[i].setActivist(a); // 이 자체가 하나의 객체이고 객체 안에 객체가 들어간 거라 이렇게 해도 activist 부분을 고치는 거라 이름 보고
													// 프로젝트 맞추고 가면 된다.

				}

			}
		}

		else if (people instanceof Recipient) {
			Recipient b = (Recipient) people;
			for (int i = 0; i < index; i++) {
				if (projectName.equals(projectList[i].getProbonoProjectName())) {
					projectList[i].setReceive(b);

				}

			}
		} else {
			System.out.println("값을 수정 할 수 없습니다.");
		}
		// for (int i =0 ; i<projectList.length ; i++ ) {
		// System.out.println(i + " " + projectList);
		// System.out.println(i + " " + projectList[i]);
		//
		// if(projectList[i] != null &&
		// projectList[i].getProbonoProjectName().equals(projectName)) {
		//
		// if(people instanceof Activist ) {
		// Activist a = (Activist)people;
		// projectList[i].setActivist(a);
		// }
		// else if(people instanceof Recipient ) {
		// Recipient b = (Recipient)people;
		// projectList[i].setReceive(b);
		// }
		// else {
		// System.out.println("수정이 되지 않습니다.");
		// }
		// }
		//
		// }
		//
	}

	public void projectDelete(String projectName) {
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				projectList[i] = null;
				break;
			}
		}
	}

	// Project 개수
	public int projectListSize() {
		return index;
	}
}
