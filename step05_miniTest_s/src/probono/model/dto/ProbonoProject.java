//실제 진행되는 재능 기부 프로젝트 정보보유 클랫
/* 기부자 , 수혜자  , 기부종류 , 기부 되는 실제 내용
 * 
 * 
 */

package probono.model.dto;

public class ProbonoProject {

	private String probonoProjectName; // 현 프로젝트 이름 //프로젝트명  
	private Probono probono; // 기부종류                           // 재능기부내용
	private Activist activist;  // 기부자                              // 재능 기부자 정보
	private Recipient receive; // 수혜자                             //수혜자 정보
	private String projectContent; //시부되는 실제내용         //프로젝트 제공 내용

	public ProbonoProject() { //기본 생성자 
		super();
	}

	public ProbonoProject(String probonoProjectName, Probono probono,  //다양한 타입이 들어간 생성자
			Activist activist, Recipient receive, String projectContent) {
		super();
		this.probonoProjectName = probonoProjectName;
		this.probono = probono;                                              // Probono 객체  /재능 기부 내용
		this.activist = activist;                                                 // 아티스트 객체   / 아티스에 대한 내용
		this.receive = receive;                                                 // receive 객체  / 수혜자에 대한 내용
		this.projectContent = projectContent;                           // String 타입에 프로젝트 제공 내용 
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

	public void setActivist(Activist activist) { //아티스트 전체를 객체로 받아서 바꿔준다.
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
		builder.append("1. 프로젝트명 : ");
		builder.append(probonoProjectName);
		builder.append("\n2. 재능기부내용 : ");
		builder.append(probono);
		builder.append("\n3. 재능 기부자 정보: ");
		builder.append(activist);
		builder.append("\n4. 수혜자 정보: ");
		builder.append(receive);
		builder.append("\n5. 프로젝트제공내용 : ");
		builder.append(projectContent);
		return builder.toString(); 
	}
}
