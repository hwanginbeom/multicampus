package test5;

import step01.domain.peopleDTO;

public class tete0702 {
	
	public static peopleDTO[] peopleArray() {
		peopleDTO[] all = {new peopleDTO("신동엽",30),
				new peopleDTO("이영자",31),new peopleDTO("서영상",26)};
		return all;
		
	}

	public static void main(String[] args) {
		int p1 = peopleArray()[2].getAge();
		System.out.println(p1);

	}

}
