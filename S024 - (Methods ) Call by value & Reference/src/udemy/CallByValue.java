package udemy;

public class CallByValue {

	public static void main(String[] args) {
		int number = 5;

		System.out.println("Before change: " + number);
		new CallByValue().changeNumber(number);
		System.out.println("After change: " + number);

	}

	public void changeNumber(int number) {
		number = 50;
	}
}

// Note: 
// In Java, when you pass a primitive data type(int, float, double, boolean, etc.)
// as an argument to a method, it is passed by value. This means that a copy of the value 
// is created and passed to the method, and any changes made to the argument within the 
// method will not affect the original value outside the method.

