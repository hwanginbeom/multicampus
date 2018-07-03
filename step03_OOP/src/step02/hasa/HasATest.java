/*학습내용
 * 1. 객체간에 멤버로 사용(포함) 되는 관계를 "has a" 관계
 * 2. 발음
 * 		has a[해즈어 , 해저]
 *3. 참고
 *		-상속은 is a[이즈어, 이저] 로 표현
 *		-즉 속성(데이터)들이 동일한 경우에만 상속 권장
 *		예시: 직원 클래스와 고객 클래스 간에는 상속 비추
 */

package step02.hasa;

public class HasATest {
	
	public static void printAll(Person a) {
		System.out.println("차주:" +a.getName());
		System.out.println("차 cc:"+a.myCar.engine.getCc());
		System.out.println("차 엔진이름:"+a.myCar.engine.getEngineName());
	}

	public static void main(String[] args) {
		//String -> Engine  -> Car ->person & String
		/* 두사람의 즉 개별 Person 객체 생성
		 *  ?엔진 이름 , cc , Person의 이름을 다 수정하시고 
		 *  출력
		 */
		Person p1 = new Person();
		p1.setName("한권열");
		p1.myCar.engine.setCc(1000);
		p1.myCar.engine.setEngineName("빠아워엔진");
		
		Person p2 = new Person();
		p2.setName("황인범");
		p2.myCar.engine.setCc(2000);
		p2.myCar.engine.setEngineName("고오오오급엔진");
		
		
		System.out.println(p1.getName());
		System.out.println(p1.myCar.engine.getCc());
		System.out.println(p1.myCar.engine.getEngineName());
		
		System.out.println("--------넘사벽-------");


		System.out.println(p2.getName());
		System.out.println(p2.myCar.engine.getCc());
		System.out.println(p2.myCar.engine.getEngineName());
		
		
		printAll(p1);
		System.out.println("--------넘사벽-------");
		printAll(p2);
	}
	

}
