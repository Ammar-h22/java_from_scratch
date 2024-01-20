package udemy.vehicles;

import udemy.parent.Vehicle;

public class Car extends Vehicle {
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private int fridge;
	private String entertainmentSystem;

	public Car() { // Default Constructor
		super();
		steering = "brown";
		musicSystem = "JBL";
		airConditioner = "LG";
		fridge = 2;
		entertainmentSystem = "LCD display";
	}

//	Parameterized Constructor:
	public Car(String steering, String musicSystem, String airconditioner, int fridge, String entainmentSystem,
			String engine, int wheels, int seats, String fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airconditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entainmentSystem;
	}

	public String getSteering() {
		return steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public int getFridge() {
		return fridge;
	}

	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

}
