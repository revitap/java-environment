package com.anthony.model;

public class Airplane extends FlyingVehicle {
	private short wheels;
	private short propellers;
	
	// Define new constructor with two parameters
	public Airplane(short wheels, short propellors) {
		
		this.wheels = wheels;
		this.propellers = propellors;
	}
	
	// Create getters and setters
	public short getWheels() { return this.wheels; }
	public void setWheels(short wheels) { this.wheels = wheels; }
	
	public short propellors() { return this.propellers; }
	public void setPropellors(short propellors) { this.propellers = propellors; }
	
	public void turn() {
		System.out.println("Turning...");
	}

}
