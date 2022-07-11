package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage g = new Garage();
		
		Vehicle vone = new Car(2022,4,"Juan",400,"Car", "Audi");
		Vehicle vtwo = new Car(2019,4,"Liam",1899, "Car", "BMW");
		Vehicle vthree = new Motorbike(2022,2,"Jeff",250,0.6, "White");
		Vehicle vfour = new Van(2022,4,"Bill",2549,"Big");
		
		g.addVehicle(vone);
		g.addVehicle(vtwo);
		g.addVehicle(vthree);
		g.addVehicle(vfour);
		
		System.out.println(g.bill("liam"));
		
		System.out.println("=========================");
		
		g.all();
		
		System.out.println("=========================");
		
		g.removeYear(2022);
		g.all();
		
		
		
		
		
		

	}

}
