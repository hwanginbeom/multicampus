package people.domain;


public class PeopleDTO {
	
	private int year;
	private int totalPeople;
	private float totalRate;
	private int young;
	private int senior;
	private float YoungRate;
	private float SeniorRate;
	private int totalSenior;
	
	public PeopleDTO() {
		super();
	}

	public PeopleDTO(int year, int totalPeople, float totalRate, int young, int senior, float youngRate,
			float seniorRate, int totalSenior) {
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
		return YoungRate;
	}

	public void setYoungRate(float youngRate) {
		YoungRate = youngRate;
	}

	public float getSeniorRate() {
		return SeniorRate;
	}

	public void setSeniorRate(float seniorRate) {
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
		builder.append("  l  totalPeople=");
		builder.append(totalPeople);
		builder.append("  l  totalRate=");
		builder.append(totalRate/1000);
		builder.append("  l  young=");
		builder.append(young);
		builder.append("  l  senior=");
		builder.append(senior);
		builder.append("  l  YoungRate=");
		builder.append(YoungRate /1000);
		builder.append("  l  SeniorRate=");
		builder.append(SeniorRate/1000);
		builder.append("  l  totalSenior=");
		builder.append(totalSenior);
		builder.append("]");
		return builder.toString();
	}

	

}
