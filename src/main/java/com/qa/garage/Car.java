package com.qa.garage;

public class Car extends Vehicle{
	private String type;
	private String model;
	
	public Car() {
	}

	public Car(int year, int noOfWheels, String owner, double bill,  String type, String model) {
		super(year, noOfWheels, owner, bill);
		this.type = type;
		this.model = model;
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [type of vehicle = " + type + ", model of car= " + model + 
				", owner= " + getOwner() + ", year manufactured= " + getYear()
				+ ", number of wheels= " + getNoOfWheels() + "the bill is £ " + getBill() + "]";
	}
	




	
	
	

	
	
	
	
	

}
