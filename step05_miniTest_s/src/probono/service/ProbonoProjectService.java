
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

	// ��� Project ��ȯ
	public ProbonoProject[] getAllProjects() {
		return projectList;
	}

	// Project �˻�
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

	// Project �߰�
	public void projectInsert(ProbonoProject project) {
		projectList[index++] = project;
	}

	// ??? ������ ���� �޼ҵ�� Ȯ���ϱ�
	// instanceof - ��ü Ÿ�� �� ������ Ȱ��
	// Project ���� - ������Ʈ ������ ��� ����� ����
	public void projectUpdate(String projectName, People people) {
		if (people instanceof Activist) {
			Activist a = (Activist) people; // ����ȯ
			for (int i = 0; i < index; i++) { // index ������ ��� �κп��� ������Ʈ ���� ����Ȯ���ϰ�
				if (projectName.equals(projectList[i].getProbonoProjectName())) {
					projectList[i].setActivist(a); // �� ��ü�� �ϳ��� ��ü�̰� ��ü �ȿ� ��ü�� �� �Ŷ� �̷��� �ص� activist �κ��� ��ġ�� �Ŷ� �̸� ����
													// ������Ʈ ���߰� ���� �ȴ�.

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
			System.out.println("���� ���� �� �� �����ϴ�.");
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
		// System.out.println("������ ���� �ʽ��ϴ�.");
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

	// Project ����
	public int projectListSize() {
		return index;
	}
}
