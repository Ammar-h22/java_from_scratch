package udemy;

public class CallByReference {

	public static void main(String[] args) {

		StringBuilder name = new StringBuilder("Ammar");
		System.out.println("Before change: " + name);
		new CallByReference().display(name);
		System.out.println("After change: " + name);

	}

	public void display(StringBuilder name) {
		name.append(" Husain");

	}
}

// Note:
// In Java, when you pass an object as an argument to a method, it is passed
// by reference. This means that the method will receive a reference to the object, 
// and any changes made to the object within the method will be reflected in the original
// object outside the method.
