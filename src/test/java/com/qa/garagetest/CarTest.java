package com.qa.garagetest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.qa.garage.Car;
import com.qa.garage.Garage;
import com.qa.garage.Vehicle;

public class CarTest {
	
	
	
	@Test
	public void testType() {
		Vehicle carOne = new Car(2022,4,"jeo", 123.4, "car", "Tesla");
		((Car) carOne).setType("automobile");
		assertEquals("automobile", ((Car) carOne).getType());
	}
		
	@Test
	public void testModel() {
		Vehicle carOne = new Car(2022,4,"jeo", 123.4, "car", "Tesla");
		((Car) carOne).setModel("BMW");
		assertEquals("BMW", ((Car) carOne).getModel());
		
		
	}
	
	@Test
	public void testToString() {
		Vehicle carOne = new Car(2022,4,"jeo", 123.4, "car", "Tesla");
		assertEquals("Car [type of vehicle = " + ((Car) carOne).getType() + ", model of car= " + ((Car) carOne).getModel() + 
				", owner= " + ((Car) carOne).getOwner() + ", year manufactured= " + ((Car) carOne).getYear()
				+ ", number of wheels= " + ((Car) carOne).getNoOfWheels() + "the bill is £ " 
				+ ((Car) carOne).getBill() + "]", ((Car) carOne).toString());
		
		
	}
		
		
	

}
