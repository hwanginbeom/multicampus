/* 1. ���� ���ο� �� ��ü ���� �ϳ��� ���������� �����ϴ� ����
 * 2. singleton design pattern
 * 		1. ��ü ���� ������ �ϳ�
 * 		2. ���� ����
 * 			1. �����ڴ� �ܺ� Ŭ�������� ����
 * 				-private ������([..]){[..]}
 * 			2. ������ Ŭ���� ������ ������ ȣ�� 
 * 				-��ü ����
 * 			3. ������ ��ü�� �ܺ� Ŭ�������� ����ϰ� �Ϸ��� ? 
 * 				-������ ��ü�� �ּ� �� ��ȯ
 * 				- �� ����� �޼ҵ�� public
 * 				-�� �޼ҵ��� ȣ�� ������ �ܺ� Ŭ�������� ��ü ��������
 * 				ȣ�� ���� �޼ҵ� static
 * 
 *  instance ��� ��ü�� getInstace��� �޼ҵ尡������ ���� singleton �̴�
 *  �̰� ���� �ѹ���.
 */

package probono.service;

import java.util.ArrayList;

import probono.model.dto.Activist;
import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

public class ProbonoProjectService {

	private static ProbonoProjectService instance = new ProbonoProjectService();

//	private ProbonoProject[] projectList = new ProbonoProject[10];
	ArrayList<ProbonoProject> projectList =new ArrayList<ProbonoProject>();
	ArrayList <ProbonoProject> projectList1 = new ArrayList<ProbonoProject>(); 
																												//ProbonoProject Ÿ���� ArrayList �� ����µ� �� �̸��� project �̴� . 
																												// ProbonoProjcet ���� ��� �͵��� ��Ƴ���. �ű⿡ 
//	private int index; //? �ʿ伺 ���ε� Ȯ�� ��� �� �� 

	private ProbonoProjectService() {
	}
	

	public static ProbonoProjectService getInstance() {
		return instance;
	}

	// ��� Project ��ȯ
	public ArrayList<ProbonoProject> getAllProjects() {
		return projectList;
	}

	// Project �˻�
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;
		for (int i = 0; i < projectList.size(); i++) {            //size�� 
			if ((projectList.get(i).getProbonoProjectName()).equals(projectName)) {
				project = projectList.get(i);
				break;
			}
		}
		return project;
	}

	// Project �߰�
	public void projectInsert(ProbonoProject project) {
		projectList.add(project);
	}

	// ??? ������ ���� �޼ҵ�� Ȯ���ϱ�
	// instanceof - ��ü Ÿ�� �� ������ Ȱ��
	// Project ���� - ������Ʈ ������ ��� ����� ����
	public void projectUpdate(String projectName, People people) {
		if (people instanceof Activist) {
			Activist a = (Activist) people; // ����ȯ
			for (int i = 0; i < projectList.size(); i++) { // index ������ ��� �κп��� ������Ʈ ���� ����Ȯ���ϰ�
				if (projectName.equals(projectList.get(i).getProbonoProjectName())) {
					projectList.get(i).setActivist(a); // �� ��ü�� �ϳ��� ��ü�̰� ��ü �ȿ� ��ü�� �� �Ŷ� �̷��� �ص� activist �κ��� ��ġ�� �Ŷ� �̸� ����
													// ������Ʈ ���߰� ���� �ȴ�.

				}

			}
		}

		else if (people instanceof Recipient) {
			Recipient b = (Recipient) people;
			for (int i = 0; i < projectList.size(); i++) {
				if (projectName.equals(projectList.get(i).getProbonoProjectName())) {
					projectList.get(i).setReceive(b);

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
		int count = projectList.size(); //  projectList.size()�̰� ������ �����ؼ� ���� projectList.size()�� �� ������ ��� �ӵ��� ��������.
		for (int i = 0; i < count; i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}
	
	/* ArrayList�� ������ ������ ��ȯ���ִ� size() ȣ���
	 * ������ ���� ���� �� �� ������ ������ ���� �Ŀ� ���� ��� ����
	 * �޼ҵ� ȣ��� ��ɸ� ���� �ȵǰ� ���� performance�� ��� ! 
	 * 
	 */

	// Project ����
	public int projectListSize() {
		return projectList.size();
	}
}
