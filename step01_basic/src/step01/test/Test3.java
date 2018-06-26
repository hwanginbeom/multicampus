package step01.test;

public class Test3 {

	
	String message;
	int age;
	
	public Test() {}
	public Test(String a, int b) {
	//String message; //선언해서 String 빼라
		message = a;
		age = b;
		//객체 생성 없이 message, age 사용 가능한 방법이 없다
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub  객체는 instance
		Test t = new Test("오늘은 비가 오네요",46);
		System.out.println(t.message);
		System.out.println(t.age);

	}

}
