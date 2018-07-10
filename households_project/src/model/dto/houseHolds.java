package model.dto;

public class houseHolds {
	private double oneHousehold;
	private double twoHousehold;
	private double threeHousehold;
	private double fourHousehold;
	private double fiveHousehold;
	private double sixHousehold;
	public houseHolds() {
		super();
		// TODO Auto-generated constructor stub
	}
	public houseHolds(double oneHousehold, double twoHousehold, double threeHousehold, double fourHousehold,
			double fiveHousehold) {
		super();
		this.oneHousehold = oneHousehold;
		this.twoHousehold = twoHousehold;
		this.threeHousehold = threeHousehold;
		this.fourHousehold = fourHousehold;
		this.fiveHousehold = fiveHousehold;
		this.sixHousehold = sixHousehold;

	}
	public double getOneHousehold() {
		return oneHousehold;
	}
	public void setOneHousehold(double oneHousehold) {
		this.oneHousehold = oneHousehold;
	}
	public double getTwoHousehold() {
		return twoHousehold;
	}
	public void setTwoHousehold(double twoHousehold) {
		this.twoHousehold = twoHousehold;
	}
	public double getThreeHousehold() {
		return threeHousehold;
	}
	public void setThreeHousehold(double threeHousehold) {
		this.threeHousehold = threeHousehold;
	}
	public double getFourHousehold() {
		return fourHousehold;
	}
	public void setFourHousehold(double fourHousehold) {
		this.fourHousehold = fourHousehold;
	}
	public double getFiveHousehold() {
		return fiveHousehold;
	}
	public void setFiveHousehold(double fiveHousehold) {
		this.fiveHousehold = fiveHousehold;
	}
	public double getSixHousehold() {
		return sixHousehold;
	}
	public void setSixHousehold(double sixHousehold) {
		this.sixHousehold = sixHousehold;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("households [oneHousehold=");
		builder.append(oneHousehold);
		builder.append(", twoHousehold=");
		builder.append(twoHousehold);
		builder.append(", threeHousehold=");
		builder.append(threeHousehold);
		builder.append(", fourHousehold=");
		builder.append(fourHousehold);
		builder.append(", fiveHousehold=");
		builder.append(fiveHousehold);
		builder.append(", sixHousehold=");
		builder.append(sixHousehold);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	


}
