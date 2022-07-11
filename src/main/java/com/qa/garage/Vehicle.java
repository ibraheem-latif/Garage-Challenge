package com.qa.garage;

public class Vehicle {
	private String owner;
	private double bill;

	private int year;
	private int noOfWheels;
	
	public Vehicle() {}
	
	
	public Vehicle(int year, int noOfWheels, String owner, double bill ) {
		this.owner=owner;
		this.year = year;
		this.noOfWheels = noOfWheels;
		this.bill=bill;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getNoOfWheels() {
		return noOfWheels;
	}


	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	


	public double getBill() {
		return bill;
	}


	public void setBill(double bill) {
		this.bill = bill;
	}


	@Override
	public String toString() {
		return "Vehicle [owner=" + owner + ", bill=" + bill + ", year=" + year + ", noOfWheels=" + noOfWheels + "]";
	}


	



	
	
	

}
