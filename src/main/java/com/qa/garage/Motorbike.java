package com.qa.garage;

public class Motorbike extends Vehicle{
	private double engineSize;
	private String colour;
	
	public Motorbike() {}

	public Motorbike(int year, int noOfWheels, String owner,double bill,  double engineSize, String colour) {
		super(year, noOfWheels, owner, bill);
		this.engineSize=engineSize;
		this.colour=colour;
		
		// TODO Auto-generated constructor stub
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Motorbike [engine size is= " + engineSize + ", this colour is= " + colour +
				", owner is= " + getOwner() + ", year of manufacturing= " +
				getYear() + ", number of wheels= " + getNoOfWheels() + "the bill is £ " + getBill() + "]";
	}
	
	
	
	
	

}
