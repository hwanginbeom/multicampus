package people.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import people.domain.PeopleDTO;

public class PeopleModel {

	static PeopleModel instance = new PeopleModel();

	static ArrayList<PeopleDTO> peopleList = new ArrayList<PeopleDTO>();

	// static { // �迭�� �ϳ��ϳ��� ��ü�� �����. / static�� �̷��� ���°��� / endview�� �ִ� �κ���
	// CustomerController�� �־�� �Ǵ°� �ƴ���
	// peopleList.add(new peopleDTO (1 , 4, "12" ,"bas", 21, 31,191));
	// peopleList.add(new peopleDTO (2 , 3, "13" ,"bcd", 22, 32,192));
	// peopleList.add(new peopleDTO (3 , 2, "14" ,"���⵿", 23, 33,193));
	// peopleList.add(new peopleDTO (4 , 1, "15" ,"����", 24, 34,194));
	// }

	// step03 - file�κ��� read�ؼ� ���

	// split �޼ҵ带 �̿��ؼ�, data�� �ִ� �������� ������ ������ Ȯ���غ���

	// read ��ü
	static BufferedReader in = null;

	// data.txt ���Ͽ� 2byte�� ���
	static BufferedWriter out = null;
static {
	try
	{
		in = new BufferedReader(new FileReader("people3.csv"));
		out = new BufferedWriter(new FileWriter("peopledata1.txt")); // Buffering����� ���鼭 2byte ��� ���� ����(�ʱ�ȭ)
		String data = in.readLine();
		data = in.readLine();
		String[] splitData = data.split(",");
		while (data != null) {
			// System.out.println(data);
			splitData = data.split(",");
			data = in.readLine();
            peopleList.add(new PeopleDTO(Integer.parseInt(splitData[0]),Integer.parseInt(splitData[1]),
            		Integer.parseInt(splitData[2]),Integer.parseInt(splitData[3]),Integer.parseInt(splitData[4])
            				,Integer.parseInt(splitData[5]),Integer.parseInt(splitData[6]) , Integer.parseInt(splitData[7])  )) ;

			out.flush();// ������ �ս��� ���ؼ� �������� ������ ��� ����
		}

	}catch(
	IOException e)
	{
		e.printStackTrace();
	}finally
	{
		try {
			in.close();// ����ߴ� �ý��� �ڿ��� ��ȯ�ϱ�
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

	public static PeopleModel getInstance() {
		return instance;
	}

	PeopleModel() {
	}

	// ��� people ��ȯ
	public static ArrayList<PeopleDTO> getAllpeople() { // <ProbonoProject>�� ���ʸ��� �� �� ��� �Ǳ������� ProbonoProject Ÿ���� �����
														// �̻��Ѱ� �ȴ�.
		return peopleList;
	}

	// people �˻�
	public static PeopleDTO getpeople(int year) {
		PeopleDTO people = null;
		for (int i = 0; i < peopleList.size(); i++) { // size��
			if ((peopleList.get(i).getYear())==(year)) {
				people = peopleList.get(i);
				break;
			}
		}
		return people;
	}

	// �߰�
	public static void peopleAdd(PeopleDTO one) {
		peopleList.add(one);
	}

	// people ���� - �� / ���� / ���� ���� ��� ����
	// lineName / year / month �� �¾ƾ� ��������

	public static boolean peopleUpdate(int year, PeopleDTO people) {
		for (int i = 0; i < peopleList.size(); i++) { // index ������ ��� �κп��� ������Ʈ ���� ����Ȯ���ϰ�
			if (year == (peopleList.get(i).getYear())) {
						System.out.println("-----------------------------------------");
						peopleList.get(i).setYear(people.getYear());
						peopleList.get(i).setTotalPeople(people.getTotalPeople());
						peopleList.get(i).setTotalRate(people.getTotalRate());
						peopleList.get(i).setYoung(people.getYoung());
						peopleList.get(i).setSenior(people.getSenior());
						peopleList.get(i).setYoungRate(people.getYoungRate());
						peopleList.get(i).setSeniorRate(people.getSeniorRate());
						peopleList.get(i).setTotalSenior(people.getTotalSenior());

						

						return true;
			
		}
		// System.out.println("�Է��Ͻ�" + station + " ���� �������� �ʽ��ϴ�.");

	}
		return false;

	}

	// ���� �κ�
	public static boolean peopleDelete( int year) {
		int count = peopleList.size(); // projectList.size()�̰� ������ �����ؼ� ���� projectList.size()�� �� ������ ��� �ӵ��� ��������.
		for (int i = 0; i < count; i++) { // index ������ ��� �κп��� ������Ʈ ���� ����Ȯ���ϰ�
			if (year==(peopleList.get(i).getYear())) {
				peopleList.remove(i);

						return true;
		
		}
		// System.out.println("�Է��Ͻ�" + station + " ���� �������� �ʽ��ϴ�.");

	}
		return false;

	}

	// people ����
	public static int peopleListSize() {
		return peopleList.size();
	}

}// ������ �κ�
