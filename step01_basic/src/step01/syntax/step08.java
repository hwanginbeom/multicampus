package step01.syntax;

import step01.domain.peopleDTO;

public class step08 {
	
	public static peopleDTO[] peopleArray() {
		peopleDTO[] all = {new peopleDTO("�ŵ���",30),
				new peopleDTO("�̿���",31),new peopleDTO("������",26)};
		return all;
		
	}

	public static void main(String[] args) {
		int p1 = peopleArray()[2].getAge();
		System.out.println(p1);

	}

}
