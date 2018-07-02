/* test ������ ǥ�� , DTO ��ü�� ���� , ���� , ���� , �˻�(��� �˻� , id�� �˻�..)�� �ٽ� ������ ����
 *  1. �� ����� ���� �޼ҵ�� ����
 *  2. ���� �޼ҵ忡�� �ϳ��� �����͸� ����
 *  3. �����͸� �迭 Ȱ�� : DTO ��ü�� CRUD
 */

package customer.model;

import customer.domain.CustomerDTO;

public class CustomerModel {
	//5���� �޸𸮰� �ִ� �迭 ���� (index 0~4 , length ����)
	static CustomerDTO[] all = new CustomerDTO[5];
	
	//byte code�� �޸𸮿� �ε� �� ������ �ڵ� ���� �Ǵ� ���
	
	//�ӽ� test ������ �ʱ�ȭ�� ����
	static {	 // �迭�� �ϳ��ϳ��� ��ü�� �����. / static��   �̷��� ���°��� / endview�� �ִ� �κ��� CustomerController��  �־�� �Ǵ°� �ƴ��� 
		all[0] = new CustomerDTO("tester" , "�̻�� ", "11" , 26, "vip");
		all[1] = new CustomerDTO("admin" , "��â�� ", "22" , 28, "vvip");
		all[2] = new CustomerDTO("master" , "��泲 ", "33" , 28, "vvip");
		all[3] = new CustomerDTO("ldh" , "�̵��� ", "55" , 27, "vip");
	}
	//����
	/*id�� �ش� �� �����ϱ� ( �迭�� �ش� index �� null���� )
	 * 1.�ʿ��� ������ : id
	 * 2.��ȯ Ÿ�� : boolean
	 * 
	 */
	public static boolean deleteOne(String id){
		for(int i=0 ; i<all.length ; i++) {
			if(all[i] != null && all[i].getId().equals(id)) {
				all[i] = null;
				return true;
			}
		}
		return false ;
	}
	
	
	//����
	/*[1]���� ��������
	 * 1. ����� �� 1 - ������ �迭 ������ �ܼ� ����(all[4] = DTO ��ü����)
	 *2. ����� �� 2 - null�� �� �� �ִ� �� delete�� ������ �޸� ������ �ִٸ� 
	 *						�ش� index�� ����
	 *[2] ȣ�� ����
	 *1.null�� ������ ��� �ش� ��ġ�� ���ο� CustomerDTO ����
	 *2.null�� ���� .. �� ��� ȣ���� �������� ��Ȳ �Ǵ��� ��ƴ�.
	 *		-��ȯ ���� 5(�迭�� ��ü ũ��) �� ��� ������ ���� ����
	 *		-��ȯ ���� 5�� �ƴ� ��� ������ ���� ����
	 */
	public static int addOne(CustomerDTO one) {
		int index = all.length; // 5 
		for(int i=0 ; i< all.length ; i++) {
			if(all[i] == null) {
				all[i] = one;
				index = i; //5�� index ���� ���� �����Ų �迭�� index������ ����
				break;
			}
		}
		return index; //5�Ǵ� ���� �� �迭�� index ���� ��ȯ
	}
	
	
	//���� ���� ��� �˻� 
	public static CustomerDTO[] getall() { //�޼ҵ�� ȣ�������� ���� �ȵȴ�. !! static�� ���̰�����
		return all;
	}
	
	/*id ������ �ش� ���� ��� ���� ��ȯ 
	 * 1. parameter - Stirng id 
	 * 2. ��ȯ Ÿ�� - CustomerDTO
	 * 
	 * �� �񱳽� �ʿ��� API - equals()
	 *�� - ���ǽ�
	 *�迭���� �������� DTO ��ü�� - �ݺ�
	 *
	 *�����Ͱ� �����ϸ� �ش� DTO ��ü ��ȯ 
	 *�ش� �����Ͱ� �� ����� null �� ��ȯ 
	 */
	public static CustomerDTO getOne(String id ) { 
		CustomerDTO dto = null ;  // return ��ȯ�ϱ� ���� ó�� �κп� �ʱ��l����.
		for(int i=0 ; i<all.length; i++) {
			dto = all[i];
			if(dto != null && dto.getId().equals(id)) { //tester
				break; //�ݺ��� �����ϴ� �����
			}
			else {
				dto = null;
			}
		}
		return dto;
	}
	
	public static void main(String[] args) {
//		System.out.println(getOne("tester"));
//		System.out.println(getOne("testers"));
		System.out.println(all[4]);
		System.out.println(all.length);
		
	}


	public static boolean update(String id , String grade) {
		CustomerDTO dto = null ;  // return ��ȯ�ϱ� ���� ó�� �κп� �ʱ��l����.
		for(int i=0 ; i<all.length; i++) {
			dto = all[i];
			if(dto != null && dto.getId().equals(id) && !(dto.getGrade().equals(grade))) { //tester
				dto.setGrade(grade);
				return true;
			}
		}
		return false;
	}
	

}
