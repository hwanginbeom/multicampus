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
	static {		
		all[0] = new CustomerDTO("tester" , "�̻�� ", "11" , 26, "vip");
		all[1] = new CustomerDTO("admin" , "��â�� ", "22" , 28, "vvip");
		all[2] = new CustomerDTO("master" , "��泲 ", "33" , 28, "vvip");
		all[3] = new CustomerDTO("ldh" , "�̵��� ", "55" , 27, "vip");
	}
	
	//���� ���� ��� �˻� 
	public static CustomerDTO[] getall() { //�޼ҵ�� ȣ�������� ���� �ȵȴ�. !! static�� ���̰�����
		return all;
	}
	

}
