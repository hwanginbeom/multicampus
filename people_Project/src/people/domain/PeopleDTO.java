package people.domain;


public class PeopleDTO {
	
	private int year;
	private int totalPeople;
	private int totalRate;
	private int young;
	private int senior;
	private int YoungRate;
	private int SeniorRate;
	private int totalSenior;
	
	public PeopleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PeopleDTO(int year, int totalPeople, int totalRate, int young, int senior, int youngRate, int seniorRate,
			int totalSenior) {
		super();
		this.year = year;
		this.totalPeople = totalPeople;
		this.totalRate = totalRate;
		this.young = young;
		this.senior = senior;
		YoungRate = youngRate;
		SeniorRate = seniorRate;
		this.totalSenior = totalSenior;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTotalPeople() {
		return totalPeople;
	}

	public void setTotalPeople(int totalPeople) {
		this.totalPeople = totalPeople;
	}

	public int getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(int totalRate) {
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

	public int getYoungRate() {
		return YoungRate;
	}

	public void setYoungRate(int youngRate) {
		YoungRate = youngRate;
	}

	public int getSeniorRate() {
		return SeniorRate;
	}

	public void setSeniorRate(int seniorRate) {
		SeniorRate = seniorRate;
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
		builder.append("PeopleDTO [year=");
		builder.append(year);
		builder.append(", totalPeople=");
		builder.append(totalPeople);
		builder.append(", totalRate=");
		builder.append(totalRate);
		builder.append(", young=");
		builder.append(young);
		builder.append(", senior=");
		builder.append(senior);
		builder.append(", YoungRate=");
		builder.append(YoungRate);
		builder.append(", SeniorRate=");
		builder.append(SeniorRate);
		builder.append(", totalSenior=");
		builder.append(totalSenior);
		builder.append("]");
		return builder.toString();
	}


}
