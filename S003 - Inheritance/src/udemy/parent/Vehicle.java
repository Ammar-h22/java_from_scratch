package udemy.parent;

public class Vehicle {
	private String engine;
	private int wheels;
	private int seats;
	private String fuelTank;
	private String lights;

	public Vehicle() { // Default Constructor
		engine = "Diesel";
		wheels = 4;
		seats = 4;
		fuelTank = "35L";
		lights = "LED";

	}

//	Parameterized Constructor:
	public Vehicle(String engine, int wheels, int seats, String fuelTank, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;

	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public String getFuelTank() {
		return fuelTank;
	}

	public String getLights() {
		return lights;
	}

	public void run() {
		System.out.println("Running vehicle!");
	}

}
