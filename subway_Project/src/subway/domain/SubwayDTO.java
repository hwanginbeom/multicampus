package subway.domain;


public class SubwayDTO {
	
	private int month;
	private int year;
	private String lineName;
	private String station;
	private int feePassenger;
	private int freePassenger;
	private int totalPassenger;

	public SubwayDTO() {
		super();
	}

	public SubwayDTO(int month, int year, String lineName, String station, int feePassenger, int freePassenger,
			int totalPassenger) {
		super();

		if (month > 0) {
			this.month = month;
		}
		if (year > 0) {
			this.year = year;
		}

		this.lineName = lineName;

		this.station = station;

		if (feePassenger > 0) {
			this.feePassenger = feePassenger;
		}
		if (freePassenger > 0) {
			this.freePassenger = freePassenger;
		}
		if (totalPassenger > 0) {
			this.totalPassenger = totalPassenger;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getlineName() {
		return lineName;
	}

	public void setlineName(String lineName) {
		this.lineName = lineName;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public int getFeePassenger() {
		return feePassenger;
	}

	public void setFeePassenger(int feePassenger) {
		this.feePassenger = feePassenger;
	}

	public int getFreePassenger() {
		return freePassenger;
	}

	public void setFreePassenger(int freePassenger) {
		this.freePassenger = freePassenger;
	}

	public int getTotalPassenger() {
		return totalPassenger;
	}

	public void setTotalPassenger(int totalPassenger) {
		this.totalPassenger = totalPassenger;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubwayDTO [month=");
		builder.append(month);
		builder.append(", year=");
		builder.append(year);
		builder.append(", lineName=");
		builder.append(lineName);
		builder.append(", station=");
		builder.append(station);
		builder.append(", feePassenger=");
		builder.append(feePassenger);
		builder.append(", freePassenger=");
		builder.append(freePassenger);
		builder.append(", totalPassenger=");
		builder.append(totalPassenger);
		builder.append("]");
		return builder.toString();
	}
	

	
	


	
	





}
