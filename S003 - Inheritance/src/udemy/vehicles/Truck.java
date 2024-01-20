package udemy.vehicles;

import udemy.parent.Vehicle;

public class Truck extends Vehicle {

	private String steering;
	private String musicSystem;
	private String airConditioner;
	private int container;

	public Truck() // Default Constructor
	{
		super();
		steering = "Black";
		musicSystem = "JBL";
		airConditioner = "Tata";
		container = 3;

	}

//	Parameterized Constructor:
	public Truck(String steering, String musicSystem, String airConditioner, int container, String engine, int wheels,
			int seats, String fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.container = container;
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

	public int getContainer() {
		return container;
	}

}
