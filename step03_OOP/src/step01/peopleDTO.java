/*Data Transfer Object = Value Object = Java Bean
 * 1. ��� ��Ģ
 * 		-������ DTO.java/������VO.java / ������ Bean.java / ������ .java
 * 2. ����
 * 		-��� ���� : private (�� ����� �����Ͱ� �Ѿ� ���� �ȵǱ� ������)
 * 		-��� �޼ҵ� : ���� �� ������ �� ��ȯ , ������ �� ���� �������θ� ����
 * 						 ������ ���� �޼ҵ忡�� ���� ��ȿ�� ���� ����
 * 		-������ : �⺻ ������ , ��� ������ �ʱ�ȭ ������
 * 		-toString() : ��� ������ �� �����ؼ� ��ȯ�ϴ� �޼ҵ�
 */

package step01;

public class peopleDTO {

	private String name; // �������
	private int age; // ��� ����

	public peopleDTO() {
	} // �⺻ ������

	public peopleDTO(String newName, int newAge) { // ������ / ���� ����
		name = newName; // ���⼭ ��� �� name ���� �ٲٸ� null �� ���. �̰� �ٷ� 21������ name
		age = newAge; // ���� ���� �����̴�.
	} // ������� ���ú��� ���

	public String getName() { // name ���� ��ȯ�Ѵ�.
		return name;
	}

	public void setName(String name) { // ���� ������ �ְ� �����ϰ� �Ѵ�.
		this.name = name; // this �� ��Ȯ�� ������ ���� ������ش�. �ڱ� �ڽ��� ȣ��
	}

	public int getAge() { //
		return age;
	}

	public void setAge(int age) { // ���� ����
		this.age = age;
	} // ���� ���� ���

	/*
	 * Override -�ּ� ���� �� ���� ������� ��ɾ� -�ش� ���忡 �°� ������ ���ϸ� ���� ������ �߻�
	 * 
	 * @��ɾ� -@Override : �� �޼ҵ�� �ݵ�� ������ �ϼ��� ��� ���
	 * 
	 * @ : ��
	 */

	// @Override
	// public String toString() {
	// return "peopleDTO [name=" + name + ", age=" + age + "]";
	// }
	//

	// @Override //������ ����
	// public String toString(int i) {
	// return "peopleDTO [name=" + name + ", age=" + age + "]";
	// }
	//

	@Override // ����ӵ��� �� �� ������
	public String toString() {
		StringBuilder builder = new StringBuilder(); // ��ü�� �ϳ� !
		builder.append("peopleDTO [name="); // �����ǰ� ��������. String�� ��� ��ü�� ����鼭 ������ �ؼ� ������.
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	public boolean equals(Object o) {
		if (o instanceof peopleDTO) {
			peopleDTO a = (peopleDTO) o;
			if (name.equals(a.getName()) && age == a.age) {
				// name == a.getName() String �� ��ü ���̱� ������ �ּҰ��� ���ع����� �׷��� �ȵȴ�.
				return true;
			}
		}
		return false;

	}
}