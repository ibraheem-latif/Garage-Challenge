package com.qa.garagetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.garage.Motorbike;

import com.qa.garage.Vehicle;

public class MotorbikeTest {
	@Test
	public void testToString() {
		Vehicle mbOne = new Motorbike(2022,2,"jeo", 123.4, 0.4,"white");
		assertEquals("Motorbike [engine size is= " + ((Motorbike)mbOne).getEngineSize() + ", this colour is= " + ((Motorbike)mbOne).getColour() +
				", owner is= " + ((Motorbike)mbOne).getOwner() + ", year of manufacturing= " +
				((Motorbike)mbOne).getYear() + ", number of wheels= " + ((Motorbike)mbOne).getNoOfWheels() + "the bill is £ " + ((Motorbike)mbOne).getBill() + "]",((Motorbike)mbOne).toString());
		
	}

}
