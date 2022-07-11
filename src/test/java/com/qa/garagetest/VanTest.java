package com.qa.garagetest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.qa.garage.Car;
import com.qa.garage.Van;
import com.qa.garage.Vehicle;

public class VanTest {
	
	@Test
	public void testSize() {
		Vehicle vanOne = new Van(2022,4,"jeo", 123.4, "big");
		((Van) vanOne).setSize("small");
		assertEquals("small", ((Van) vanOne).getSize());
	}
	
	@Test
	public void testToString() {
		Vehicle vanOne = new Van(2022,4,"jeo", 123.4, "small");
		assertEquals("Van [Size of van= " + ((Van) vanOne).getSize() + ", owner is = " + ((Van) vanOne).getOwner() + 
				", year of manufacture= " + ((Van) vanOne).getYear() + ", number of wheels= "
				+ ((Van) vanOne).getNoOfWheels() + "the bill is £ " + ((Van) vanOne).getBill() + "]", ((Van) vanOne).toString());
		
		
	}
	
	
	

}
