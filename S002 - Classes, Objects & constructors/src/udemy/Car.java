package udemy;

public class Car {
	private String doors;
	private String engine;
	private String driver;
	private int speed;

//	We will access these above properties using getters and setters method:
	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getDoors() {
		return doors;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngine() {
		return engine;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getDriver() {
		return driver;
	}

//	Instead of taking the same name of the variable we can also 
//	set some another name in the parameter, For example:
	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

//	Now we will add a functionality in this class:
	public void state() {
		if (doors == "closed" && engine == "on" && driver == "seated" && speed > 0) {
			System.out.println("The car is ready to run.");
		} else {
			System.out.println("The car is not ready to run.");
		}
	}
}

// Important note:
// 1)'this keyword' is just simply used to resolve the ambiguity between 
//    the global variable and the local variable of a particular method.
// 2) Instead of writing [doors == "closed"] we can also write [doors.equals("closed")] ,
//    where equals() is a function in java which is used for the comparison between string data-types.
