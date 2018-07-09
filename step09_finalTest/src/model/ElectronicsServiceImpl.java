package model;

import java.io.FileReader;           //FileReader
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

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
			Iterator keyAll = productInfo.stringPropertyNames().iterator(); // iterator로 넣어준다.   iterator는 데이터 입력 순서와 상관없이 데이터 순서대로 넣는다.
																									//Iterator 타입의  keyAll 은  productInfo 타입의 객체 productInfo 를 사용하는데 이 안에는
																									// 메소드가 있는데  .stringPropertyNames()이라는 메소드를 사용한다.
			
			String key = null;
			String [] productValue = null;
			
			while(keyAll.hasNext()){ // 가지고 있으면 줘라 
				key = (String)keyAll.next();
//				System.out.println("===" + key);
				System.out.println("-----" + productInfo.getProperty(key));
				
				productValue = productInfo.getProperty(key).split(",");
				
				noteBookList.put(key, new NoteBook(productValue[0], productValue[1], new Integer(productValue[2]), productValue[3]));
			}			
			electronicsList.put("noteBook", noteBookList);
			
			//smartPhone 데이터 로딩 
			productInfo.load(new FileReader("smartPhoneInfo.properties"));
			keyAll = productInfo.stringPropertyNames().iterator();			
			
			while(keyAll.hasNext()){
				key = (String)keyAll.next();
				productValue = productInfo.getProperty(key).split(",");
				smartPhoneList.put(key, new SmartPhone(productValue[0], productValue[1], 
																			Integer.parseInt(productValue[2]),
																			productValue[3]));
			}
			electronicsList.put("smartPhone", smartPhoneList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static ElectronicsServiceImpl getInstance(){
		return instance;
	}
	
	//모든 전자 제품 반환
	public HashMap<String, HashMap> getElectronicsList() {
		return electronicsList;
	}
	
	//모든 노트북 or 스마트 폰 반환  
	public HashMap<String, Electronics> getKindElectronics(String kind) throws InexistentException{
		HashMap kindProduct = electronicsList.get(kind);
		if(kindProduct == null){
			throw new InexistentException("검색하고자 하는 품목들의 제품이 없습니다.");
		}
		return kindProduct;
	}
	
	//특정 제품 검색 
	public Electronics getElectronics(String kind, String modelNum) throws InexistentException{
		Electronics product = (Electronics)(electronicsList.get(kind).get(modelNum));
		if(product == null){
			throw new InexistentException();
		}
		return product;
	}
	
	
	//제품 고유 번호로 제품 존재 유무 체크 메소드
	/* true - 존재할 경우 반환값
	 * false - 미존재할 경우 반환값	 */
	public boolean existElectronics(String kind, String modelNum){
		HashMap<String, Electronics> products = electronicsList.get(kind);
		return products.containsKey(modelNum);
	}
	
	/* 저장
	 * 새로운 전자 제품 저장 
	 */
	public void insertElectronics(String kind, Electronics product) throws DuplicateException{
		if(!existElectronics(kind, product.getModelNum())){
			electronicsList.get(kind).put(product.getModelNum(), product);
		}else{
			throw new DuplicateException();
		}
	}
	
	/* 수정
	 * kind, 모델로 모델 가격 수정하기 
	 */
	public void updateElectronics(String kind, String modelNum, int newPrice) throws InexistentException{
		Electronics product = getElectronics(kind, modelNum);
		if(product != null){
			product.setPrice(newPrice);
		}
	}
	
	
	/* 삭제
	 * kind, modelNum으로 제품 삭제 
	 */
	public void deleteElectronics(String kind, String modelNum) throws InexistentException{
		getKindElectronics(kind).remove(modelNum);
	}
}