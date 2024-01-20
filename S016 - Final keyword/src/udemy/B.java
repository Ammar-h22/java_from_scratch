package udemy;

public class B extends A {
	private final int x = 50;

	public int getX() {
		return x;
	}

	@Override
	public void India() {
		System.out.println("Hello India, what's up?");
	}

//	We cannot override the method "USA" here in "class B" because it is declared as a 
//	final method in "class A". (We can check in class A)
	
	
	
}

// Note:
// If a variable is a final variable then there should not be a setter method for it.
// Any final keyword entity cannot be re-assigned.
// Means, we cannot change the value of any final entity(variable, method,...) once it is assigned.

// If we are assigning the value of a variable in the starting while its declaration then there should 
// not be a parameterized constructor, 
// and if we are not assigning the value then there should not be a default constructor.

// If a method is assigned with a final keyword then we cannot override that method.

// Now if we want that each and every method in the class should be restricted from overridden then we can 
// directly assign the final keyword to the class, instead of writing final keyword to each and every 
// method again and again.

// Also very important point to note is that as soon as we make a particular class as a final class then 
// after that we cannot use that class as a parent class. Hence inheritance is not applicable for final classes.






