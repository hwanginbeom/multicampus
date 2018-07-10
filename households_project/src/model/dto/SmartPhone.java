package model.dto;

public class SmartPhone extends Electronics{      //Electronics 상속받는다.  고로 Electronics 안에 있는 변수와 메소드 사용가능
	//네트워크
	private String network;//	Wi-Fi, 블루투스 4.0  // smartPhone 안에만 있는 멤버변수 

	public SmartPhone() {}                          //기본 생성자 생성 + super() 생성 Electronics 안에있는 변수와 메소드사용 
	
	public SmartPhone(String modelNum, String modelName, int price, String network) { //생성자 생성 / String /String /int  /String 타입의 매개변수를 받는 생성자를 만든다.
		super(modelNum, modelName, price);                                                          // 여기서 String modelNum, String modelName, int price, 에서 받은걸 	
																													// 부모에 있는 modelNum, modelName, price에 넣어준다.
		this.network = network;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String newwork) {
		this.network = newwork;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SmartPhone 정보 :");
		builder.append(" 모델번호 =");
		builder.append(getModelNum());
		builder.append(", 모델명 = ");
		builder.append(getModelName());
		builder.append(", 가격 = ");
		builder.append(getPrice());
		builder.append(", 네트워크 = ");
		builder.append(network);
		return builder.toString();
	}
}
