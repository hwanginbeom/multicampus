//���� ����Ǵ� ��� ��� ������Ʈ �������� Ŭ��
/* ����� , ������  , ������� , ��� �Ǵ� ���� ����
 * 
 * 
 */

package probono.model.dto;

public class ProbonoProject {

	private String probonoProjectName; // �� ������Ʈ �̸� //������Ʈ��  
	private Probono probono; // �������                           // ��ɱ�γ���
	private Activist activist;  // �����                              // ��� ����� ����
	private Recipient receive; // ������                             //������ ����
	private String projectContent; //�úεǴ� ��������         //������Ʈ ���� ����

	public ProbonoProject() { //�⺻ ������ 
		super();
	}

	public ProbonoProject(String probonoProjectName, Probono probono,  //�پ��� Ÿ���� �� ������
			Activist activist, Recipient receive, String projectContent) {
		super();
		this.probonoProjectName = probonoProjectName;
		this.probono = probono;                                              // Probono ��ü  /��� ��� ����
		this.activist = activist;                                                 // ��Ƽ��Ʈ ��ü   / ��Ƽ���� ���� ����
		this.receive = receive;                                                 // receive ��ü  / �����ڿ� ���� ����
		this.projectContent = projectContent;                           // String Ÿ�Կ� ������Ʈ ���� ���� 
	}

	public String getProbonoProjectName() {
		return probonoProjectName;
	}

	public void setProbonoProjectName(String probonoProjectName) {
		this.probonoProjectName = probonoProjectName;
	}

	public Probono getProbono() {
		return probono;
	}

	public void setProbono(Probono probono) {
		this.probono = probono;
	}

	public Activist getActivist() {
		return activist;
	}

	public void setActivist(Activist activist) { //��Ƽ��Ʈ ��ü�� ��ü�� �޾Ƽ� �ٲ��ش�.
		this.activist = activist;
	}

	public Recipient getReceive() {
		return receive;
	}

	public void setReceive(Recipient receive) {
		this.receive = receive;
	}

	public String getProjectContent() {
		return projectContent;
	}

	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. ������Ʈ�� : ");
		builder.append(probonoProjectName);
		builder.append("\n2. ��ɱ�γ��� : ");
		builder.append(probono);
		builder.append("\n3. ��� ����� ����: ");
		builder.append(activist);
		builder.append("\n4. ������ ����: ");
		builder.append(receive);
		builder.append("\n5. ������Ʈ�������� : ");
		builder.append(projectContent);
		return builder.toString(); 
	}
}