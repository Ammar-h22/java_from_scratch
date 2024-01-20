package udemy;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	private int vehicleId;

	public Vehicle(int vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "vehicle [vehicleId=" + vehicleId + "]";
	}
}

class Car extends Vehicle {
	private String carModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	@Override
	public String toString() {
		return "Car [vehicleId=" + getVehicleId() + ", carModel=" + carModel + "]";
	}
}

public class App {

	public static void main(String[] args) {
		List<Vehicle> list1 = new ArrayList<>();
		list1.add(new Vehicle(1012));
		list1.add(new Vehicle(1013));
		list1.add(new Vehicle(1014));
		list1.add(new Vehicle(1015));
		list1.add(new Car(1016, "Asta"));
		list1.add(new Car(1017, "Mini"));
		display3(list1);
	}

//	This '?' means, we don't know that which class to specify either Vehicle or Car class,
//	So because of this confusion we can specify a wild-card i.e '?'
	public static void display1(List<?> list) {
		for (Object i : list) {
			System.out.println(i);
		}
	}

	public static void display2(List<? extends Vehicle> list) {
		for (Vehicle i : list) {
			System.out.println(i);
		}
	}
// '? extends Vehicle' indicates the "upper bound" where we apply the bound to the 
// upper limit, and Vehicle class is the upper limit as it is the parent class.
// So the objects of the Vehicle class & the Car class (child class) will work properly
// through this method.
// Usually upper bound is more useful than lower bound. 	

	public static void display3(List<? super Car> list) {
		for (Object i : list) {
			System.out.println(i);
		}
	}
//	'? super Car' indicates the "lower bound"
}

//Note:
//In Java, wildcards are a feature of generics that allow you to specify an unknown type. 
//They're represented by the "?" symbol and can be used in a variety of ways. 
//There are two types of wildcards: Upper Bounded Wildcards and Lower Bounded Wildcards.
//Upper Bounded Wildcards are specified using the "? extends"
//Lower Bounded Wildcards are specified using the "? super" 
