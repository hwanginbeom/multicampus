package customer.domain;

public class CustomerDTO {
	private String id;
	private String pw;
	private String name;
	private int age;
	private String grade;
	
	public CustomerDTO() {}
	public CustomerDTO(String id, String name, String pw, int age, String grade) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		
		if(age>0) {
			this.age = age;
			}
		
		this.grade = grade;
	}
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age>0) {
		this.age = age;
		}
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override //모든 요소를 출력하기위해 출력
	public String toString() {
		return "CustomerDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}



}
