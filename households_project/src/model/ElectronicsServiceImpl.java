package model;

import java.io.FileReader;           //FileReader
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import exception.DuplicateException;    //강사님이 말씀해주신 예외처리 1 
import exception.InexistentException;   //강사님이 말씀해주신 예외처리 1 
import model.dto.Electronics;
import model.dto.NoteBook;
import model.dto.SmartPhone;


public class ElectronicsServiceImpl{                   
	private static ElectronicsServiceImpl instance = new ElectronicsServiceImpl();  //객체를 생성하는 부분으로써 싱글톤으로 만들기 위해 instance를 만들어준다. 
	
	//모든 전자제품 저장 객체
	private HashMap<String, HashMap> electronicsList = new HashMap<String, HashMap>();  // HashMap 사용하는데 타입은 String /HashMap 타입이다. 
	
	//제품 번호로 노트북 저장 객체
	private HashMap<String, Electronics> noteBookList = new HashMap<String, Electronics>();  // HashMap을 사용하는데 String 타입과 Electronics 타입을 쓴다.

	//제품 번호로 스마트폰 저장 객체
	private HashMap<String, Electronics> smartPhoneList = new HashMap<String, Electronics>();  // HashMap을 사용하는데 String 타입과 Electronics 타입을 쓴다.
	
	//properties파일로 부터 데이터 로딩(저장)해서 HashMap객체들에 저장
	/*1. properties 두가지
	 * 2. 노트북 / 스마트폰 정보를 개별 properties 파일로 구분
	 * 3. properties 로 부터 데이터를 read해서 key = value 구조로 자바 객체로 변환
	 * 		-properties API는 properties 파일의 구조처럼 데이터 관리
	 * 		-key = value 구조
	 * 		-HashMap과 흡사 , 
	 * 
	 */
	private ElectronicsServiceImpl(){             // 기본 생성자 부분 
		Properties productInfo = new Properties();            //기본생성자를 호출할 경우  Properties 타입에  productInfo라는 객체를 만든다.
		try {                                                                //오류가 날 수 있는 부분이니 try ,  catch  부분으로 만들어준다. 
			//noteBookInfo.propertiesdm 의 내용을 보유
			/*#modelNum		modelName 		price 		 os
				NT900X4D-A68S=NT900X4D-A68S,삼성센스,1300,Windows 8
				NT900X4D-A99S=NT900X4D-A99S,삼성센스,1700,Windows 8
			 * 
			 */
			productInfo.load(new FileReader("noteBookInfo.properties"));  //  load 는 2바이트 단위로 알아서 구동     //Properties타입의    productInfo객체는 load라는 메소드를 쓰고
																									//load라는 메소드는  2바이트 단위로 알아서 구동을 한다. 그리고 매개변수 부분에 들어가는건
																									//객체 부분이 들어가는데 이 부분은 FileReader 라는 생성자를 호출하고 그안에 받는 매개변수 
																									// "noteBookInfo.properties"를 받는다 라는 뜻 
			Iterator <String> keyAll = productInfo.stringPropertyNames().iterator(); ////////수정한 부분
																									// iterator로 넣어준다.   iterator는 데이터 입력 순서와 상관없이 데이터 순서대로 넣는다.
																									//Iterator 타입의  keyAll 은  productInfo 타입의 객체 productInfo 를 사용하는데 이 안에는
																									// 메소드가 있는데  .stringPropertyNames()이라는 메소드를 사용한다.
																									// 이메소드는   public Set<String> stringPropertyNames() {
																									// Map<String, String> h = new HashMap<>();
																									//enumerateStringProperties(h);
																									// return Collections.unmodifiableSet(h.keySet()); ek 
			
			String key = null;                                 
			String [] productValue = null;
			
			while(keyAll.hasNext()){ //hasNext 데이터 존재 확인가능 // 데이터 존재가  확인 될 경우  while 반복문을 실행한다.  
				key = keyAll.next();     // key에는 ketall에 있는 값을 반환한다.  // next는 반환 
//				System.out.println("===" + key);
				System.out.println("-----" + productInfo.getProperty(key));      //Properties 타입의 productInfo에 있는  getProperty라는 메소드를 쓰는데 매개변수로 key를 받는다.
																											// key 값을 토대로 value를 가져온다. 
				productValue = productInfo.getProperty(key).split(",");       //productValue라는 String 배열 타입을 만들고 이안에  key 값을 토대로 value를 가져오는 메소드를 사용하고
																									//.split(","); 을 써서 , 단위로 구분해준다. 
				noteBookList.put(key, new NoteBook(productValue[0], productValue[1], new Integer(productValue[2]), productValue[3])); //hashmap 에 있는 put으로 넣어준다.
			}														//String modelNum, String modelName,        int price,                       String os 만 노트북 멤버변수고 나머지는 상속받은 Electromics  부분
				
			electronicsList.put("noteBook", noteBookList); //electronicsList 라는 hashmap에 put 해주는데 여기서  electronicsList 는 String /  HashMap 타입을 넣어준다고 위에서 선언 해줌
			
			
			productInfo.clear();
			//smartPhone 데이터 로딩 
			productInfo.load(new FileReader("smartPhoneInfo.properties"));   //Properties 타입의 productInfo에 load라는 메소드를 사용한다. 여기서는 "smartPhoneInfo.properties이걸 매개변수로 받는
																									//FileReader 라는 생성자를 통해 객체를 만들고 이 객체를 load에 넣는다.
			keyAll = productInfo.stringPropertyNames().iterator();	  //하나씩 뽑을수 있는 상황으로 만들어 주는거 		
			
			while(keyAll.hasNext()){ //keyAll 에 있는값이 있을경우 while문을 돌린다 = > 값이 없을 떄 까지 돌린다.
				key = keyAll.next();     ///////////String 형변환 뺴줌 위에서 제너릭 해줘서 
				productValue = productInfo.getProperty(key).split(",");           //노트북에서 했던 부분 똑같이 한다.
				smartPhoneList.put(key, new SmartPhone(productValue[0], productValue[1], 
																			Integer.parseInt(productValue[2]),
																			productValue[3]));
			}
			electronicsList.put("smartPhone", smartPhoneList);
		} catch (Exception e) {                   //catch 로  오류를 잡는다. 
			e.printStackTrace();
		}
	}
	
	public static ElectronicsServiceImpl getInstance(){      //객체를 반환해준다. 그래서 ElectronicsServiceImpl 타입을 쓸수 있게 해준다.
		return instance;
	}
	
	//모든 전자 제품 반환
	public HashMap<String, HashMap> getElectronicsList() {    //hashmap 타입인데 제너릭은 String 과 HashMap 이다. 
		return electronicsList;                                                 //electronicsList 반환 
	}
	
	//모든 노트북 or 스마트 폰 반환  
	public HashMap<String, Electronics> getKindElectronics(String kind) throws InexistentException{ //오류가 났을 경우 throws에서 상위메소드로 던진다  InexistentException 이부분으로
		 // 해쉬맵에서 get은 이 값을 반환해라  
		if(electronicsList.get(kind) == null){
			throw new InexistentException("검색하고자 하는 품목들의 제품이 없습니다."); //InexistentException 타입에 객체생성  오류가 발생 했을경우에 객체를 생성하고  이걸 윗부분으로 던지고
		}
		return electronicsList.get(kind);  //return 값 kindProduct
	}
	
	//특정 제품 검색 
	public Electronics getElectronics(String kind, String modelNum) throws InexistentException{
		Electronics product = (Electronics)(electronicsList.get(kind).get(modelNum));  //종류와 넘버를 반환하고 그걸 Electronics product 에 넣는다 
																										//Electronics 타입의 객체 product에 Electronics으로 형변환한  
																										//electronicsList에서 입력받은 kind 와 이 종류에서 get을 해 입력받은 modelNum를 
																										// get에서 해준다 
		if(product == null){                                                  //product 부분이 null 이면 오류 이기 때문에 throw 부분을 만들고 InexistentException 객체를 생성하고
			throw new InexistentException();                 //throw로 윗부분 throws 던지고 이부분에서 다시 상위 메소드로 보낸다.
		}
		return product;                                               //그게아니면 return 값을 product을 만들어준다.
	}
	
	
	//제품 고유 번호로 제품 존재 유무 체크 메소드
	/* true - 존재할 경우 반환값
	 * false - 미존재할 경우 반환값	 */
	public boolean existElectronics(String kind, String modelNum){     //boolean 타입의 existElectronics 이라는 메소드는 String 값과 String값을 매개변수로 가진다.
		HashMap<String, Electronics> products = electronicsList.get(kind);  //해쉬맵을 쓰는데 이 제너럴 타입은 String , Electronics 를 쓰는 객체 products는 
																									//electronicsList리스트를 반환하는데 입력받은 kind를 반환하는 것을 products 부분에 넣는다.
		return products.containsKey(modelNum);									//해쉬맵 타입의 products의 하위 메소드인  	containsKey 에 매개변수 	modelNum 를 넣는다.
	}
	
	/* 저장
	 * 새로운 전자 제품 저장 
	 */
	public void insertElectronics(String kind, Electronics product) throws DuplicateException{
		if(!existElectronics(kind, product.getModelNum())){            // !existElectronics는 true의 반대이므로 반환값이 false일 경우 넣는다 
			electronicsList.get(kind).put(product.getModelNum(), product);
		}else{
			throw new DuplicateException();
		}
	}
	
	/* 수정
	 * kind, 모델로 모델 가격 수정하기 
	 */
	public void updateElectronics(String kind, String modelNum, int newPrice) throws InexistentException{
		if(getElectronics(kind, modelNum) != null){
			getElectronics(kind, modelNum).setPrice(newPrice);
		}else {
			throw new InexistentException();
		}
	}
	
	
	/* 삭제
	 * kind, modelNum으로 제품 삭제 
	 */
	public void deleteElectronics(String kind, String modelNum) throws InexistentException{
		if(getElectronics(kind, modelNum) != null){
		getKindElectronics(kind).remove(modelNum);
		}else {
			throw new InexistentException();
		}
		
	}
}