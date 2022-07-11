package com.qa.garage;

public class Van extends Vehicle {
	private String size;
	
	public Van() {}

	public Van(int year, int noOfWheels, String owner, double bill, String size) {
		super(year, noOfWheels, owner,bill);
		this.size=size;
		
		// TODO Auto-generated constructor stub
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Van [Size of van= " + size + ", owner is = " + getOwner() + 
				", year of manufacture= " + getYear() + ", number of wheels= "
				+ getNoOfWheels() + "the bill is £ " + getBill() + "]";
	}


	
	
	

	
}
