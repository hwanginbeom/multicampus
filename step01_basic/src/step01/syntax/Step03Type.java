package step01.syntax;

import step01.domain.FriendVO;

public class Step03Type {
	
	//FrinedVO ��ȯ �޼ҵ�

	FriendVO getInstance() {
		//FriendVO a = new FriendVO();
		// �� ���� ���� �ٷ� ���ϰ����� �޴´� 
		//���� ������ ȣ���ؼ� ��ü ����� �޼ҵ��̴�.
		return new FriendVO();
	}
	// FriendVo �� �޼ҵ� parameter �� �ݿ��ϴ� �޼ҵ�
	
	void m(FriendVO v) { // a.m(FriendVO ��ü); ȣ�� �� ���� ���� �ָ鼭 ȣ���Ѵ�. Ÿ���� �θ� �ʿ䰡 ����.
		System.out.println(v.name );  //0x �ް� ���̸��� ���´�.
		v.name = "�տ���"; // v.name ���� ���Ӱ� ������ �Ѵ�. �̰� ���ϰ��� �ƴ϶� ������� 
									//�׳� v.name �� �ٲ�Ŵ�. �ּҰ��� �ִ� ���� �ٲ۰��̴ϱ� 
		
		
	}

	public static void main(String[] args) {
		Step03Type s = new Step03Type();     //�� ��ü�� 2 �� ���� Friend �� ���� ��ü�� �ϳ��̴�.
		//s�� �������� 
		FriendVO v2 = s.getInstance(); //0x�� �ּҶ� ���� 
		//v��� �ּҹ����� ������ v�� ���� ȣ���ϸ� �ȴ�.
		System.out.println(v2.name);
		
		//v2.m(s);
		s.m(v2); // 0x 
		
		// v2 �� FriendVO ��� Ÿ���� ��ü�ε� �̰� s ��� ��ü�� ���� getInstance�� �޼ҵ带 ȣ���ϰ�
		//getInstance��� �޼ҵ�� FriendVO��� �ٸ� Ŭ������ �����ڸ� ȣ���ؼ� ��ü�� ����� ���̴�.
		// �׷��� v2���� FrienVO��� Ŭ������ ���� �� ��ü �� ���� �ȴ�. 
		//m���� FriendVO Ÿ���� v ��� ��ü�� ���� �Ǵµ� �׷��� v2.m(s)�� �ϸ� 
		//s�� Step03Type�� ��ü �̱� ������ ��� �� �� ����.
		//m�̶�� �޼ҵ带 ����ϱ����ؼ��� ��ü�� �ʿ��ѵ� �׷��� s �� ���� 
		//m�� void ������ ���� �ְ� ȣ���� �ؾߵǴ� �޼ҵ� �̴�. 
		//�̶� ���� FriendVO�� Ÿ���̱� ������ FriendVO Ÿ���� ���� �־������μ� ��밡�� �ϰԲ� �Ѵ�.
		
		System.out.println(v2.name); 
		// ���⼭ v.name�� �տ������� �ٲ�� ������
		// �ּҰ��� �ִ� v.name�� �ٲ� ���̱� ������ �̸���ü�� �ٸ��� ����� �ȴ�.

	}

}