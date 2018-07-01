/*�н�����
 * 1. �迭 Ÿ���� �̿��� ����� ���
 * 2.	String ������ �� ���ϱ�
 * 			-public boolean equals(String v){���ڿ� ��}
 * 3. ���� �� ������
 * 		==
 * 		1.�⺻ Ÿ�� : ���� �� ��
 * 		2.��ü Ÿ�� : �ּ� ��(��ġ) ��
 */
package step01.syntax;

import step01.domain.peopleDTO;

public class Step12Array2 {
	//���ڿ� �� 
	
	public static void equalsTest(String v) {
		String id = "tester";
		System.out.println(id.equals(v));// tester �� true �ƴϸ� false
	}
	
	// == ���� �� �����ڷ� �⺻ Ÿ�� ��
	
	public static void operator(int i ) {
		int data = 10 ;
		System.out.println(data==i);
	}
	
	//== ��ü Ÿ�� �� : �ּ� �� ��
	/*p.getName().equals(dto.getName()) �������
	 * p: peopleDTO
	 * p.getName() : peopleDTO�� name String �� ��ȯ �� ����
	 * p.getName().equals() : String�� equals() ȣ�⸸
	 * dto.getName() : dto�� getName() �� name ���� �� ȹ��
	 * dto.getName() �� ��� ���� Ȯ���� ��ȯ�Ǹ� equals() ����
	 * 
	 */
	
	public static void operator(peopleDTO dto) {
		peopleDTO p = new peopleDTO("name" ,10);
		System.out.println(p==dto);                    //�ּҰ�
		System.out.println(p);                    //�迭�� ���´�
		System.out.println(dto);                    //�ּҰ�
		System.out.println(p.hashCode());                    //�ּҰ� 697960108
		System.out.println(dto.hashCode());                    //�ּҰ� 943010986
		System.out.println(p.getName().equals(dto.getName())); // �� 
		
		//p.getName().equals(dto.getName())
		String name = p.getName();
		String name2 = dto.getName();
		name.equals(name2);    //name�� String �̰� String Ŭ���� �ȿ��� equals �޼ҵ尡 �ִ� �̰� ������ �ִ�.
												// peopleDTO �ȿ��ִ� �޼ҵ带 ���°Ŷ�� �����ϸ� �ȴ�.
		
		
	}
	
	//�迭�� length ���� ��� ���� - 5���� �ݺ����� �Ἥ ���
	public static void lenghtTest() {
		int[] i = {1,4,5,6,8,9};
		for(int index = 0 ; index<i.length ; index++) {  //length �� �迭�� ����� �ڵ����� �����.
			System.out.print(i[index]	+ 10 + "\t"); // int ���̶� ���ϱⰡ ���� 	
//			System.out.print("����" +3);                  //���� 11	����314	����315	����316	����318	����319	����3
		}
	}
	
	//String[] �������� ID ���� ���� �� �ϳ��� id ���� �ָ鼭 ���� ���θ� ��ȯ ���ִ� ��� 
	//���� ���� ��ȯ 
	

	public static void main(String[] args) {
		equalsTest("tester"); //true
		equalsTest("test"); // false
		operator(10);         //true
		operator(15);         //false
		operator(new peopleDTO("name" , 10)); // ���� ���Ƶ� new�� ���ο� ��ü�� ����� ���̱� ������ �ٸ���
		lenghtTest();


	}

}