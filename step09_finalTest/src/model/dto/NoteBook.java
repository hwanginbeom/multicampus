package model.dto;

public class NoteBook extends Electronics{ // notebook은 electronics 의 자식으로 electronics를 상속받는다.
	
	//메인보드
	private String os;

	public NoteBook() {           //기본생성자 생성
		super();                      //부모를 상속받는다.  /modelNum  /modelName /price 등의 멤버변수를 상속받고  안에있는 메소드를 사용 할 수있다.  
	}

	public NoteBook(String modelNum, String modelName, int price, String os) {   //생성자인데 매개변수를 String , String, int , String 타입의 매개변수를 받는다. 
		super(modelNum, modelName, price);													 // 여기서 String modelNum, String modelName, int price, 에서 받은걸 	
																													// 부모에 있는 modelNum, modelName, price에 넣어준다.
		this.os = os;                                                     //여기서 받은 os 는 위에서 String 타입의 os 값이 this를 통해 멤버변수가 바뀐다.
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NodeBook 정보 :");
		builder.append(" 모델번호 = ");
		builder.append(getModelNum());
		builder.append(", 모델명 = ");
		builder.append(getModelName());
		builder.append(", 가격 = ");
		builder.append(getPrice());
		builder.append(", 운영체제 = ");
		builder.append(os);
		return builder.toString();
	}
}
