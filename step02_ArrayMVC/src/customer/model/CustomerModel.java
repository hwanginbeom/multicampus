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
	

}
