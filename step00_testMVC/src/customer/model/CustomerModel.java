package customer.model;


import customer.domain.CustomerDTO;

public class CustomerModel {
	
	static CustomerDTO[] all = new CustomerDTO[5]; 
	
	static {
		all[0] = new CustomerDTO( "abc" , "123" , "�̳���" , 25 ,"vvip");
		all[1] = new CustomerDTO( "bcd" , "123" , "������" , 25 ,"vip");
		all[2] = new CustomerDTO( "cde" , "123" , "������" , 25 ,"vvip");
		all[3] = new CustomerDTO( "def" , "123" , "��泲" , 27 ,"vip");

	}
	//�˻�
	
	public static CustomerDTO[] getall() { //�޼ҵ�� ȣ�������� ���� �ȵȴ�. !! static�� ���̰�����
		return all;
	}

	
	//�ϳ� �˻�
	public static  CustomerDTO getOne(String id) {
		CustomerDTO dto =null;
		for(int i=0 ; i<all.length ; i++) {
			dto= all[i];
			if(dto != null && dto.getId().equals(id)) {
				break;
			}
			else {
				dto=null;
			}
		}

		return dto;
		
	}
	
	
	//����
	
	public static int addOne(CustomerDTO one) {
		int index = all.length; 
		for(int i=0; i<all.length ; i++) {
			if(all[i] == null) {
				all[i] = one;
				index = i;
			}
		}
		return index;
	}
	
	//����
	
	public static boolean deleteOne(String id) {
		for(int i=0 ; i<all.length ; i++) {
			if(all[i].getId().equals(id)&&all[i]!=null) {    // ������ ���� ���� �ΰ��� �ƴѵ� �� ���϶��� �����ؾߵǴ���
				all[i] = null;
				return true;
			}
		}
		return false;
	}
	
	//����
	public static boolean updateOne(String id, String grade) {
		for(int i=0 ; i<all.length ; i++) {
			if(all[i]==null&&all[i].getId().equals(id) && !(all[i].getGrade().equals(grade))) {
				all[i].setGrade(grade);
				return true;
			}
		}
		return false;
	}
	

}
