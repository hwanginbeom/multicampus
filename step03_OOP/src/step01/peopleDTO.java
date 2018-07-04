/*Data Transfer Object = Value Object = Java Bean
 * 1. 명명 규칙
 * 		-도메인 DTO.java/도메인VO.java / 도메인 Bean.java / 도메인 .java
 * 2. 구조
 * 		-멤버 변수 : private (쓸 모없는 데이터가 넘어 오면 안되기 떄문에)
 * 		-멤버 메소드 : 변수 즉 데이터 값 반환 , 데이터 값 수정 로직으로만 구성
 * 						 데이터 수정 메소드에는 값의 유효성 검증 구현
 * 		-생성자 : 기본 생성자 , 멤버 변수들 초기화 생성자
 * 		-toString() : 멤버 변수들 값 결합해서 반환하는 메소드
 */

package step01;

public class peopleDTO {

	private String name; // 멤버변수
	private int age; // 멤버 변수

	public peopleDTO() {
	} // 기본 생성자

	public peopleDTO(String newName, int newAge) { // 생성자 / 로컬 변수
		name = newName; // 여기서 모든 걸 name 으로 바꾸면 null 이 뜬다. 이건 바로 21라인의 name
		age = newAge; // 으로 가기 때문이다.
	} // 여기까지 로컬변수 사용

	public String getName() { // name 값을 반환한다.
		return name;
	}

	public void setName(String name) { // 로컬 변수를 주고 수정하게 한다.
		this.name = name; // this 는 명확히 멤버라는 것을 언급해준다. 자기 자신을 호출
	}

	public int getAge() { //
		return age;
	}

	public void setAge(int age) { // 로컬 변수
		this.age = age;
	} // 여기 까지 사용

	@Override
	public String toString() {
		return "peopleDTO [name=" + name + ", age=" + age + "]";
	}

	public boolean equals(Object o) {
		if (o instanceof peopleDTO) {
			peopleDTO a = (peopleDTO) o;
			if (name.equals(a.getName())&&age == a.age) {
				//name == a.getName() String 은 객체 값이기 떄문에 주소값을 비교해버린다 그래서 안된다. 
				return true;
			}
		}
		return false;

	}

}
