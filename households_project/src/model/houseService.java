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
import model.dto.houseHolds;
import model.dto.total;

public class houseService{
	
	private HashMap<String , total> totalList = new HashMap<String , total>();
	
	private HashMap<String,  houseHolds> houseList = new HashMap<String, houseHolds>();  // HashMap을 사용하는데 String 타입과 Electronics 타입을 쓴다.
	
	private houseService() {
		Properties productInfo = new Properties();            //기본생성자를 호출할 경우  Properties 타입에  productInfo라는 객체를 만든다.
		
		try {               
			productInfo.load(new FileReader("noteBookInfo.properties"));
			Iterator <String> keyAll = productInfo.stringPropertyNames().iterator();
		
			String key = null;                                 
			String [] productValue = null;
			while(keyAll.hasNext()){ //hasNext 데이터 존재 확인가능 // 데이터 존재가  확인 될 경우  while 반복문을 실행한다.  
				key = keyAll.next();     // key에는 ketall에 있는 값을 반환한다.  // next는 반환 
//				System.out.println("===" + key);
				System.out.println("-----" + productInfo.getProperty(key));      //Properties 타입의 productInfo에 있는  getProperty라는 메소드를 쓰는데 매개변수로 key를 받는다.
																											// key 값을 토대로 value를 가져온다. 
				productValue = productInfo.getProperty(key).split(",");       //productValue라는 String 배열 타입을 만들고 이안에  key 값을 토대로 value를 가져오는 메소드를 사용하고
																									//.split(","); 을 써서 , 단위로 구분해준다. 
				houseList.put(key, new NoteBook(productValue[0], productValue[1], new Integer(productValue[2]), productValue[3])); //hashmap 에 있는 put으로 넣어준다.
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
		
	}
	}
}
