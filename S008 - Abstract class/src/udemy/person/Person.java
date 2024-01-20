package udemy.person;

public abstract class Person {
	
	public void speak()
	{
		System.out.println("Shares thoughts!");
		
	}
	
	public abstract void eat();   // This is an abstract class, which we can only declare and not define. 
	
	
}


// Note:
// In abstract class we can declare & define non-abstract methods as well as we can declare abstract methods.
// It is different from interfaces because in interfaces we cannot define the methods.
// Both abstract class and interface are used to achieve "Abstraction".

