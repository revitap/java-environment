package com.anthony.model;

public class FlyingVehicle extends Vehicle {
	private short wings;
	private Engine engine;
	
	public FlyingVehicle() {}
	
	// Define new constructor with two parameters - wings and Engine
	public FlyingVehicle(short wings, Engine engine) {
		this.wings = wings;
		this.engine = engine;
	}
	
	// Create getters and setters
	public short getWings() { return this.wings; }
	public void setWings(short wings) { this.wings = wings; }
	
	public Engine getEngine() { return this.engine; }
	public void setEngine(Engine engine) { this.engine = engine; }
	
	public void fly() {
		System.out.println("FlyingVehicle is flying...");
	}
	
	public void refuel() {
		System.out.println("FlyingVehicle is refueling");
	}
	
	public void liftOff() {
		System.out.println("FlyingVehicle is lifting of...");
	}
	
	public void land() {
		System.out.println("FlyingVehicle is landing...");
	}

}
