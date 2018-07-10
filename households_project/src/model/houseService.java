package model;

import java.io.FileReader;           //FileReader
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import exception.DuplicateException;    //������� �������ֽ� ����ó�� 1 
import exception.InexistentException;   //������� �������ֽ� ����ó�� 1 
import model.dto.Electronics;
import model.dto.NoteBook;
import model.dto.SmartPhone;
import model.dto.houseHolds;
import model.dto.total;

public class houseService{
	
	private HashMap<String , total> totalList = new HashMap<String , total>();
	
	private HashMap<String,  houseHolds> houseList = new HashMap<String, houseHolds>();  // HashMap�� ����ϴµ� String Ÿ�԰� Electronics Ÿ���� ����.
	
	private houseService() {
		Properties productInfo = new Properties();            //�⺻�����ڸ� ȣ���� ���  Properties Ÿ�Կ�  productInfo��� ��ü�� �����.
		
		try {               
			productInfo.load(new FileReader("noteBookInfo.properties"));
			Iterator <String> keyAll = productInfo.stringPropertyNames().iterator();
		
			String key = null;                                 
			String [] productValue = null;
			while(keyAll.hasNext()){ //hasNext ������ ���� Ȯ�ΰ��� // ������ ���簡  Ȯ�� �� ���  while �ݺ����� �����Ѵ�.  
				key = keyAll.next();     // key���� ketall�� �ִ� ���� ��ȯ�Ѵ�.  // next�� ��ȯ 
//				System.out.println("===" + key);
				System.out.println("-----" + productInfo.getProperty(key));      //Properties Ÿ���� productInfo�� �ִ�  getProperty��� �޼ҵ带 ���µ� �Ű������� key�� �޴´�.
																											// key ���� ���� value�� �����´�. 
				productValue = productInfo.getProperty(key).split(",");       //productValue��� String �迭 Ÿ���� ����� �̾ȿ�  key ���� ���� value�� �������� �޼ҵ带 ����ϰ�
																									//.split(","); �� �Ἥ , ������ �������ش�. 
				houseList.put(key, new NoteBook(productValue[0], productValue[1], new Integer(productValue[2]), productValue[3])); //hashmap �� �ִ� put���� �־��ش�.
			}														//String modelNum, String modelName,        int price,                       String os �� ��Ʈ�� ��������� �������� ��ӹ��� Electromics  �κ�
				
			electronicsList.put("noteBook", noteBookList); //electronicsList ��� hashmap�� put ���ִµ� ���⼭  electronicsList �� String /  HashMap Ÿ���� �־��شٰ� ������ ���� ����
			
			
			productInfo.clear();
			//smartPhone ������ �ε� 
			productInfo.load(new FileReader("smartPhoneInfo.properties"));   //Properties Ÿ���� productInfo�� load��� �޼ҵ带 ����Ѵ�. ���⼭�� "smartPhoneInfo.properties�̰� �Ű������� �޴�
																									//FileReader ��� �����ڸ� ���� ��ü�� ����� �� ��ü�� load�� �ִ´�.
			keyAll = productInfo.stringPropertyNames().iterator();	  //�ϳ��� ������ �ִ� ��Ȳ���� ����� �ִ°� 		
			
			while(keyAll.hasNext()){ //keyAll �� �ִ°��� ������� while���� ������ = > ���� ���� �� ���� ������.
				key = keyAll.next();     ///////////String ����ȯ ���� ������ ���ʸ� ���༭ 
				productValue = productInfo.getProperty(key).split(",");           //��Ʈ�Ͽ��� �ߴ� �κ� �Ȱ��� �Ѵ�.
				smartPhoneList.put(key, new SmartPhone(productValue[0], productValue[1], 
																			Integer.parseInt(productValue[2]),
																			productValue[3]));
			}
			electronicsList.put("smartPhone", smartPhoneList);
		} catch (Exception e) {                   //catch ��  ������ ��´�. 
			e.printStackTrace();
		}
	}
	
	public static ElectronicsServiceImpl getInstance(){      //��ü�� ��ȯ���ش�. �׷��� ElectronicsServiceImpl Ÿ���� ���� �ְ� ���ش�.
		return instance;
	}
	
	//��� ���� ��ǰ ��ȯ
	public HashMap<String, HashMap> getElectronicsList() {    //hashmap Ÿ���ε� ���ʸ��� String �� HashMap �̴�. 
		return electronicsList;                                                 //electronicsList ��ȯ 
	}
		
	}
	}
}
