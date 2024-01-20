package udemy.vehicles;

import udemy.parent.Vehicle;

public class Bike extends Vehicle {
	private String handle;

	public Bike() // Default Constructor
	{
		super();
		handle = "short";
	}

//	Parameterized Constructor:
//	Here we need to give all the variable names of parent class inside the parameter of 
//	parameterized constructor in order to access them in the main class.
//	Also we have to give the names inside the super method. (Excluding data-types)
	public Bike(String handle, String engine, int wheels, int seats, String fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ "]";
	}

	public void run() {
		System.out.println("Running bike!");
	}

}
// Important note:
// 1)We can either use default constructor or we can use parameterized constructor(any 1 out of them)
// 2)Super keyword: super is used as a reference variable to invoke the immediate parent class 
//   variables, methods or constructors.
// 3)If there is a common function name that is present in the parent class as well as in the child class then priority will
//   always be given to the child class function.

// 4)The best approach of initializing and printing the values on the console is:
// 1) First declare the variables as private and not as public.
// 2) Then create a default constructor and initialize the variable inside it.
//	         OR
// 2) Create a parameterized constructor and then initialize the variables in the main class 
//    with the help of objects.
// 3) Then after creating a constructor, create getters method and inside that
//    return the variables.
