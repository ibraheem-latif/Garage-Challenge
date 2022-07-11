package com.qa.garage;

import java.util.ArrayList;
import java.util.List;


public class Garage {
	
	List<Vehicle> vehicles = new ArrayList();
	
	public Garage() {}

	public Garage(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
		
	}
	
	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
		
	}
	
	public void emptyGarage(Vehicle vehicle) {
		this.vehicles.removeAll(vehicles);
	}
	
	// remove type:year
	
	public void removeYear(int year) {
		List<Vehicle> toRemove = new ArrayList<Vehicle>();
		
		for(Vehicle v : vehicles) {
			if(v.getYear() == year) {
				toRemove.add(v);
				
			}
		}for(Vehicle v: toRemove) {
			vehicles.remove(v);
		}
		
	}
	
	
	// bill
	
	public double bill(String name) {
		for(Vehicle v: vehicles) {
			if(v.getOwner().equalsIgnoreCase(name)) {
				System.out.println("the bill for "+ v.getOwner()+" is:");
				return v.getBill();
				
			}
		}
		return 0 ;
		
	}
	
	// all
	
	public void all() {
		for(Vehicle v: vehicles) {
			System.out.println(v);
		}
		
		
	}
	
	
	
	
	
	

}
