package udemy.person;

public class Person implements IsAlive, LiveLife {

	@Override
	public void message() {
		System.out.println("Always keep moving in life!");

	}

	@Override
	public void breathe() {
		System.out.println("You are alive till you are breathing!");
	}
//	
}

// Here we have implemented the concept of multiple inheritance using interfaces:
// We have created two interfaces and then one class which implements those two interfaces, means there are 
// two parent class(interface) and one child class, and this is nothing but multiple inheritance.
