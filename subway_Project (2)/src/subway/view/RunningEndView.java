package subway.view;

import java.util.ArrayList;

import subway.domain.SubwayDTO;

public class RunningEndView {

	// ��ü�� ���
	public static void subwayListView(ArrayList<SubwayDTO> all) {
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i) != null) {
				System.out.println(all.get(i).toString());
			}
		}
	}

	// �����Ͱ� null�� ��� �ܼ� �޼��� ���

	// �����Ͱ� SubwayDTO�� ��� �ش� ������ ���� ���
	public static void printOne(SubwayDTO one) {
		System.out.println(one.toString());
	}

	public static void printMsg() {
		System.out.println("��û�Ͻ� ������ �� �����մϴ�.");
	}

	public static void printMsg(String msg) {
		System.out.println(msg);
	}

}
