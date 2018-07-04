package step01;

public class Child extends Parent{ // 지금 현재 Object 가 가지고 있는 메소드 11개에 Parent 가 가지고 있는 메소드 1개로 총 12개를 가지고있다.
	String job;
	
	Child(){
//		super(); // 여기서 부모 측에서 넘어간다. 
									//Object -> Parent(name,age) ->Child(job) 부모부터 생성
									//생성자 위치로 이동
		super("창윤",28);
		System.out.println("자식의 기본 생성자");
	}
	//재정의
	public void printAll() {
		super.printAll();
		System.out.println(job);

	}

	public static void main(String[] args) { //c가 스택부분에 있는데 로컬변수인가여 !?
		//step02 - 다형성
//		Parent p = new Child();  //up casting 업 캐스팅
//		p.name = "윤길";
////		p.job = "IT man"; 문법 오류
////		자식만의 멤버에 access를 위한 필수 문법 - 객체 간의 형변환
//		Child c2 = (Child)p;
//		c2.job = "IT man";
//		p.printAll();
//		c2.printAll();
//		
		
		System.out.println("----------------");
//		step01-상속 관계의 객체 생성 학습
		Child c = new Child();        //클래스를 낮춘다는 생각으로 다운캐스팅
//		System.out.println(c.name);
		c.name = "상만";
//		System.out.println(c.name);
		c.printAll();
	}

}
