/*학습내용
 * 1. 배열 타입을 이용한 응용력 향상
 * 2.	String 데이터 값 비교하기
 * 			-public boolean equals(String v){문자열 비교}
 * 3. 동등 비교 연산자
 * 		==
 * 		1.기본 타입 : 순수 값 비교
 * 		2.객체 타입 : 주소 값(위치) 비교
 */
package step01.syntax;

import step01.domain.peopleDTO;

public class Step12Array2 {
	//문자열 비교 
	
	public static void equalsTest(String v) {
		String id = "tester";
		System.out.println(id.equals(v));// tester 면 true 아니면 false
	}
	
	// == 동등 비교 연산자로 기본 타입 비교
	
	public static void operator(int i ) {
		int data = 10 ;
		System.out.println(data==i);
	}
	
	//== 객체 타입 비교 : 주소 값 비교
	/*p.getName().equals(dto.getName()) 실행순서
	 * p: peopleDTO
	 * p.getName() : peopleDTO의 name String 값 반환 된 로직
	 * p.getName().equals() : String의 equals() 호출만
	 * dto.getName() : dto의 getName() 즉 name 변수 값 획득
	 * dto.getName() 의 결과 값이 확실히 반환되면 equals() 실행
	 * 
	 */
	
	public static void operator(peopleDTO dto) {
		peopleDTO p = new peopleDTO("name" ,10);
		System.out.println(p==dto);                    //주소값
		System.out.println(p);                    //배열이 나온다
		System.out.println(dto);                    //주소값
		System.out.println(p.hashCode());                    //주소값 697960108
		System.out.println(dto.hashCode());                    //주소값 943010986
		System.out.println(p.getName().equals(dto.getName())); // 값 
		
		//p.getName().equals(dto.getName())
		String name = p.getName();
		String name2 = dto.getName();
		name.equals(name2);    //name은 String 이고 String 클래스 안에는 equals 메소드가 있다 이걸 쓸수가 있다.
												// peopleDTO 안에있는 메소드를 쓰는거라고 생각하면 된다.
		
		
	}
	
	//배열의 length 변수 사용 연습 - 5개를 반복문을 써서 출력
	public static void lenghtTest() {
		int[] i = {1,4,5,6,8,9};
		for(int index = 0 ; index<i.length ; index++) {  //length 는 배열을 만들면 자동으로 생긴다.
			System.out.print(i[index]	+ 10 + "\t"); // int 형이라 더하기가 가능 	
			System.out.println(i[2]);
//			System.out.print("갸갸" +3);                  //가능 11	갸갸314	갸갸315	갸갸316	갸갸318	갸갸319	갸갸3
		}
	}
	
	//String[] 여러명의 ID 값을 저장 후 하나의 id 값을 주면서 존재 여부를 반환 해주는 기능 
	//존재 여부 반환 
	

	public static void main(String[] args) {
		equalsTest("tester"); //true
		equalsTest("test"); // false
		operator(10);         //true
		operator(15);         //false
		operator(new peopleDTO("name" , 10)); // 값이 같아도 new로 새로운 객체를 만드는 것이기 때문에 다르다
//		lenghtTest();


	}

}
