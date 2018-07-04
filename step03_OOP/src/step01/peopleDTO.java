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

	/*
	 * Override -주석 보다 더 강한 명시적인 명령어 -해당 스펙에 맞게 구현을 안하면 문법 오류가 발생
	 * 
	 * @명령어 -@Override : 이 메소드는 반드시 재정의 하세요 라는 명령
	 * 
	 * @ : 엣
	 */

	// @Override
	// public String toString() {
	// return "peopleDTO [name=" + name + ", age=" + age + "]";
	// }
	//

	// @Override //문법적 오류
	// public String toString(int i) {
	// return "peopleDTO [name=" + name + ", age=" + age + "]";
	// }
	//

	@Override // 실행속도가 좀 더 빠르다
	public String toString() {
		StringBuilder builder = new StringBuilder(); // 객체는 하나 !
		builder.append("peopleDTO [name="); // 누적되고 지워진다. String은 계속 객체를 만들면서 저장을 해서 느리다.
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	public boolean equals(Object o) {
		if (o instanceof peopleDTO) {
			peopleDTO a = (peopleDTO) o;
			if (name.equals(a.getName()) && age == a.age) {
				// name == a.getName() String 은 객체 값이기 떄문에 주소값을 비교해버린다 그래서 안된다.
				return true;
			}
		}
		return false;

	}
}