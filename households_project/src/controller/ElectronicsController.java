package controller;

import java.util.HashMap;

import view.FailView;
import view.SuccessView;
import exception.DuplicateException;
import exception.InexistentException;
import model.ElectronicsServiceImpl;
import model.dto.Electronics;

public class ElectronicsController {
	private static ElectronicsServiceImpl electroService = ElectronicsServiceImpl.getInstance();
	
	//Ư�� ��ǰ ���� ���� üũ ����
	public static void existElectorincs(String kind, String modelNum){
		if(electroService.existElectronics(kind, modelNum)){
			SuccessView.successMessage(kind +"ǰ�� " + modelNum + "�� �ش��ϴ� ��ǰ�� �����մϴ�");
		}else{
			FailView.errorMessage("�ش� ��ǰ�� �� �����մϴ�.");
		}
	}
	
	//ǰ�� ���о��� ��� ��ǰ �˻� ����
	public static void getAllElectronics(){
		SuccessView.allProductPrint(electroService.getElectronicsList());	
	}
	
	//ǰ�� ��� ��ǰ �˻�
	public static void getKindElectronics(String kind){
		try {
			HashMap<String, Electronics> kindProduct = electroService.getKindElectronics(kind);
			SuccessView.allProductPrint(kindProduct);
		} catch (InexistentException e) {
			FailView.errorMessage("��û�Ͻ� ǰ�� �ش��ϴ� ��ǰ���� �� �����մϴ�.");
			e.printStackTrace();
		}
	}

	
	//Ư�� ��ǰ �˻�
	public static void getElectronics(String kind, String modelNum){
		try {
			SuccessView.productPrint(electroService.getElectronics(kind, modelNum));
		} catch (InexistentException e) {
			//e.printStackTrace();
			FailView.errorMessage("�ش� ��ǰ�� �� �����մϴ�.");
		}
	}
	
	//��ǰ ����
	public static void insertElectronics(String kind, Electronics product){
		try {
			electroService.insertElectronics(kind, product);
		} catch (DuplicateException e) {
			//e.printStackTrace();
			FailView.errorMessage("�̹� �����ϴ� ǰ���Դϴ�.");
		}
		SuccessView.successMessage(kind + "ǰ�� " + product.getModelNum() + "��ȣ ��ǰ�� ���Ӱ� �����Ͽ����ϴ�.");
	}
	
	//��ǰ ����
	public static void updateElectronics(String kind, String modelNum, int newPrice){
		try {
			electroService.updateElectronics(kind, modelNum, newPrice);
		} catch (InexistentException e) {
			e.printStackTrace();
			FailView.errorMessage("�� �����ϴ� ��ǰ���� ���� �Ұ��Դϴ�.");
		}
		SuccessView.successMessage(kind + "ǰ���� " + modelNum + "��ȣ ��ǰ�� ������ �����߽��ϴ�.");
	}
	
	//��ǰ ����
	public static void deleteElectonics(String kind, String modelNum){
		try {
			electroService.deleteElectronics(kind, modelNum);
		} catch (InexistentException e) {
			e.printStackTrace();
			FailView.errorMessage("�� �����ϴ� ��ǰ���� ���� �Ұ��Դϴ�.");
		}
		SuccessView.successMessage(kind + "ǰ���� " + modelNum + "��ȣ ��ǰ�� �����߽��ϴ�.");
	}
}