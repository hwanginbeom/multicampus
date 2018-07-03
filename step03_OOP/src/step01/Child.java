package step01;

public class Child extends Parent{ // 지금 현재 Object 가 가지고 있는 메소드 11개에 Parent 가 가지고 있는 메소드 1개로 총 12개를 가지고있다.
	String job;
	
	Child(){
		super();
		System.out.println("자식의 기본 생성자");
	}

	public static void main(String[] args) {
		Child c = new Child();

	}

}
