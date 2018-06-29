/*학습내용 - 배열
 *  1. 다수의 데이터를 하나의 변수로 관리
 *  2. 각각의 데이터는 고유한 index로 구분
 *  	-첫번째 순번의 데이터 시작은 0
 *  3.모든 배열은 무조건 객체
 *  		-배열이 실제 사용 가능하게 생성 될 경우 어떤 메모리에 생성 되는가 ? 
 *  		:heap에 저장 
 * 	4.한번 생성한 배열의 크기는 변경 불가
 * 		-가변적인 데이터 표현을 위해서는 배열이 아닌 list 구조를 권장
 * 		-java.util package 학습 예정
 * 5. 생성 시킨 배열에는 배열 메모리 크기값을 보유한 length라는
 *     변수가 자동생성
 * 
 */

package step01.syntax;

import step01.domain.peopleDTO;

public class Step11Array1 {
	
	//int 배열
	public static int[] intArray() {
		int [] i =  {1,2,3}; // 여기에는 4가지를 가지는데 1,2,3 과 lenth를 가진다.
		return i;
	}
	
	//String 배열
	public static String[] stringArray() {
		String[] s = {"임성환" , "박창윤"};
		return s;
		}
	
	
	//PeopleDTO 배열 
	public static peopleDTO[] peopleArray() {
		peopleDTO[] all = { new peopleDTO("신동엽",30),
										new peopleDTO("이영자",31)};
		return all;
		}
		
	
	
	public static void main(String[] args) {
	
		//index 1번째 친구의 이름값만 출력해보기
		peopleDTO[] all = peopleArray();
		peopleDTO p = all[1];
		String name = p.getName();
		System.out.println(name);
		
		/*peopleArray():peopleDTO 배열 반환
		 * peopleArray()[1]:배열 내에 있는 index 1번째 객체인 peopleDTO 객체 반환
		 * peopleArray()[1].getName() : 객체의 getName() 호출
		 * 
		 */
		String p1 = peopleArray()[1].getName();
		
		
		
		int[] i = intArray();
		System.out.println(i[0]);
	
		int i2 = intArray()[2];	
		System.out.println(stringArray()[1]);
		
	}

}
