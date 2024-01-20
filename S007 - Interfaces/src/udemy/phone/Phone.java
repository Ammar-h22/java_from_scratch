package udemy.phone;

public interface Phone {
	public String processor();

	public String OS();

	public int spaceInGB();

//	OR, we can also declare all the methods without any access modifiers in interface.
//	String processor();
//	String OS();
//	int spaceInGB();

}

// Important Note:
// 1) Interfaces are very important in Java.
// 2) Interface is also called as "Complete Abstraction".
// 3) In interfaces we can just declare the methods (we cannot define them within interfaces).
//    In other words we can say that in interface there is only declaration and not implementation.
// 4) Using Interfaces there is a restriction applied in the classes and we must implement all the
// methods(functions) in the class that are declared in the interface.

// Two main advantages of using Interfaces is:
// 1) We can standardize the names & data-types of the methods.
// 2) We can apply the concept of Polymorphism through interfaces.
 
// Similar to interfaces, there is a concept of "abstract class" which is also used to achieve "abstraction".
// But in abstract class we can declare & define non-abstract methods as well as we can declare abstract methods.




