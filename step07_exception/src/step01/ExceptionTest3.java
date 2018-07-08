package step01;

public class ExceptionTest3 {
	// id���� ���� - tester
	// if���ǽ�����
	static void idCheck1(String id) {
		if("tester".equals(id)) {
			System.out.println("ȸ��");
		}else {
			System.out.println("��ȸ��");
		}
	}
	
	// exception ó��
	// ��Ȳ�� �°� �����ڰ� ���� ���ܸ� �߻� -> ó��
	static void idCheck2(String id) throws Exception{
		if(!"tester".equals(id)) {//true�� ��� if��ϸ�
			throw new Exception("��ȸ��");
		}
		System.out.println("ȸ��"); //if���� true�� ����� ���´�
	}
	
	public static void main(String[] args) {
		idCheck1("tester");
		try {
		idCheck2("test");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

