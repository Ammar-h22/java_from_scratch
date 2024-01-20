package udemy;

public class Constructors {
	private String doors;
	private String engine;
	private String driver;
	private int speed;

	public Constructors() // This is a default constructor.
	{
		doors = "closed";
		engine = "on";
		driver = "seated";
		speed = 40;
	}

//	Another method of giving values to the variables using constructors.
	public Constructors(String doors, String engine, String driver, int speed)// Parameterized C...
	{
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	public void state() {
		if (doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0)

		{
			System.out.println("The car is ready to run.");
		} else {
			System.out.println("The car is not ready to run.");
		}
	}
}

// Important note:
// 1) Constructors are special methods in java that are used for initializing objects.
// 2) If we don't want to give values to the variables in the main class then we can 
//    define constructors and give values to the variables inside constructors. 
// 3) If there is no constructor in our class then java automatically injects a 
//    default constructor inside object.
