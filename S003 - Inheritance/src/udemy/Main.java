package udemy;

import udemy.vehicles.Bike;
import udemy.vehicles.Car;
import udemy.vehicles.Truck;

public class Main {

	public static void main(String[] args) {

//		Accessing the variables with default constructor:
		Bike b1 = new Bike();
		System.out.println(b1.getHandle());
		System.out.println(b1.getEngine());
		System.out.println(b1.getLights());

//		Accessing the variables with parameterized constructor.
		Bike b2 = new Bike("very short", "Petrol", 2, 1, "5L", "LED");
		System.out.println("Handle type: " + b2.getHandle());
		System.out.println("Engine type: " + b2.getEngine());
		System.out.println("No. of wheels: " + b2.getWheels());
		System.out.println("No. of seats: " + b2.getSeats());
		System.out.println("Fuel tank capacity: " + b2.getFuelTank());
		System.out.println("Lights: " + b2.getLights());
//		System.out.println(b2);
		b2.run();

//		---------------------------------------------------------------------------------------------
		Car c1 = new Car();
//		System.out.println(c1.getMusicSystem());
//		System.out.println(c1.getEntertainmentSystem());
//		System.out.println(c1.getFridge());

		Car c2 = new Car("Brown", "JBL", "LG", 2, "LCD display", "CNG", 4, 5, "20L", "LED");
//		System.out.println(c2.getSeats());
//		System.out.println(c2.getFuelTank());

//		---------------------------------------------------------------------------------------------
		Truck t1 = new Truck();
//		System.out.println(t1.getContainer());
//		System.out.println(t1.getAirConditioner());

		Truck t2 = new Truck("Black", "JBL", "Tata", 3, "Diesel", 8, 4, "55L", "LED");
//		System.out.println(t2.getEngine());
//		System.out.println(t2.getFuelTank());
	}

}
	
