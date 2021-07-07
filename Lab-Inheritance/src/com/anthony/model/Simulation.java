package com.anthony.model;

public class Simulation {
	
	public static void main(String[] args) {
		FlyingVehicle fv = new FlyingVehicle((short)4, new Engine()); // create new instance of FlyingVehicle 		
		fv.setName("A New Flying Vehicle"); // setName is inherited from Vehicle.java
		
		System.out.println(fv.getName()); // getName is inherited from Vehicle.java
		
		Airplane boeing = new Airplane((short)4, (short)5);
		boeing.move(15);
	}

}
