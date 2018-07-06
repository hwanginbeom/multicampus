package subway.domain;

public class PeopleDTO {
	private int yearPeople;
	private int totalPeople;
	private float totalRate;
	private int young;
	private int senior;
	private float youngRate;
	private float seniorRate;
	private int totalSenior;
	public PeopleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PeopleDTO(int yearPeople, int totalPeople, float totalRate, int young, int senior, float youngRate,
			float seniorRate, int totalSenior) {
		super();
		this.yearPeople = yearPeople;
		this.totalPeople = totalPeople;
		this.totalRate = totalRate;
		this.young = young;
		this.senior = senior;
		this.youngRate = youngRate;
		this.seniorRate = seniorRate;
		this.totalSenior = totalSenior;
	}
	public int getYearPeople() {
		return yearPeople;
	}
	public void setYearPeople(int yearPeople) {
		this.yearPeople = yearPeople;
	}
	public int getTotalPeople() {
		return totalPeople;
	}
	public void setTotalPeople(int totalPeople) {
		this.totalPeople = totalPeople;
	}
	public float getTotalRate() {
		return totalRate;
	}
	public void setTotalRate(float totalRate) {
		this.totalRate = totalRate;
	}
	public int getYoung() {
		return young;
	}
	public void setYoung(int young) {
		this.young = young;
	}
	public int getSenior() {
		return senior;
	}
	public void setSenior(int senior) {
		this.senior = senior;
	}
	public float getYoungRate() {
		return youngRate;
	}
	public void setYoungRate(float youngRate) {
		this.youngRate = youngRate;
	}
	public float getSeniorRate() {
		return seniorRate;
	}
	public void setSeniorRate(float seniorRate) {
		this.seniorRate = seniorRate;
	}
	public int getTotalSenior() {
		return totalSenior;
	}
	public void setTotalSenior(int totalSenior) {
		this.totalSenior = totalSenior;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PeopleDTO [yearPeople=");
		builder.append(yearPeople);
		builder.append(", totalPeople=");
		builder.append(totalPeople);
		builder.append(", totalRate=");
		builder.append(totalRate);
		builder.append(", young=");
		builder.append(young);
		builder.append(", senior=");
		builder.append(senior);
		builder.append(", youngRate=");
		builder.append(youngRate);
		builder.append(", seniorRate=");
		builder.append(seniorRate);
		builder.append(", totalSenior=");
		builder.append(totalSenior);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
