package model.dto;


public class Electronics implements java.io.Serializable{ // Serializable는 객체를 직렬화 한다. 직렬화를 함으로써 데이터가  
																				//타고타고 들어가는 구조에서 데이터 손실이 발생할수 있는데 그 부분을 객체를  byte단위로 잘게 구분 관리해 손실이 일어나지 않게 한다.
	// 모델번호 
	private String modelNum;       
	// 모델명 
	private String modelName;	
	// 가격 
	private int price;

	public Electronics() {	} //기본 생성자 

	public Electronics(String modelNum, String modelName, int price) { //생성자 인데 String,String ,int 타입의 매개변수를 받는 생성자이다.
		super();
		this.modelNum = modelNum;
		this.modelName = modelName;
		this.price = price;
	}

	public String getModelNum() {   //getModelNum 메소드 
		return modelNum;
	}

	public void setModelNum(String modelNum) { //setModelNum 메소드
		this.modelNum = modelNum;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {                             //출력했을때 이형식으로 builder 값 안에 append 로 하나씩 넣어서 객체 하나로 출력을 할 수 있게 한다.
		StringBuilder builder = new StringBuilder();
		builder.append("전자제품 정보 [모델번호=");
		builder.append(modelNum);
		builder.append(", 모델명=");
		builder.append(modelName);
		builder.append(", 가격=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
}
