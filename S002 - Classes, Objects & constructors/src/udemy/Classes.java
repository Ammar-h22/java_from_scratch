package udemy;

public class Classes {

	public static void main(String[] args) {

		Car c1 = new Car();

//		We can do this when 'speed variable' is defined in public access modifier.
//		c1.speed = 120;
//		System.out.println(c1.speed);

//		Here, we have accessed the 'variables' with the help of functions.
		c1.setDoors("closed");
		c1.setEngine("on");
		c1.setDriver("seated");
		c1.setSpeed(40);
		System.out.println("The doors are " + c1.getDoors());
		System.out.println("The engine is " + c1.getEngine());
		System.out.println("The driver is " + c1.getDriver());
		System.out.println("The speed of car is " + c1.getSpeed() + " Km/hr.");

		c1.state();
//		---------------------------------------------------------------------
		Constructors c2 = new Constructors();
		c2.state();

		Constructors c3 = new Constructors("closed", "on", "seated", 40);
		c3.state();
	}

}

// Important note:
// 1) Classes are nothing but the blueprint/template of objects.
// 2) Objects are members/instances of classes and they consist of
//    properties & functionalities. 
