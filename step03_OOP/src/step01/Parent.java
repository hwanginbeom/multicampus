package step01;

public class Parent extends Object{ //Object 클래스를 상속하는 parent  Object는 모든 조상 ! 
	 String name;
	 int age;
	
	public Parent() { //기본 생성자
		super(); // Object 객체가 생성
		System.out.println("부모의 기본 생성자");
	} // name , age 변수 공간이 사용가능하게 heap 객체 내부에 생성
		//Parent 객체 생성 완료
	
	public Parent(String name, int age) { //생성자
		super();
		this.name = name;
		this.age = age;
		System.out.println("부모의 생성자");

	}
	public void printAll() {
		System.out.println(name);
		System.out.println(age);
	}

}
