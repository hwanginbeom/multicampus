package step03.apply;

public class PolyTest extends Object{ //Object �ڵ�����
	//���ڿ� ��ü ������ Object(�ֻ���) Ÿ������ ��ȯ 
	
	public PolyTest() { // �ڵ� ����
		super();
	}
	
	public static Object getData() {
		return "���ڿ�"; // String ��ü ���� - > ��ȯ
	}

	public static void main(String[] args) {
//		String data = (String)getData();
//		System.out.println(data.charAt(0));
		
		//���� : Object �� ��� ��Ű�� ���� ���� , �޼ҵ�� Object
		//Ÿ���� access(ȣ��) �Ұ�
		//���� ���� : getData() -> getData()charAt(0) ->(String)
		// �켱������ ��ȣ�� ��� �ش�.
		
		System.out.println(((String) getData()).charAt(0));
		

	}

}
