package udemy;

import java.io.FileNotFoundException;
//import java.io.FileReader;

public class ThrowNThrows {
	public static void main(String[] args) {

		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("catch block of main method");
		} catch (Exception e) {
			System.out.println("catch block of main method (Exception)");
		}
	}

	public static void someMethod() throws FileNotFoundException { // We can also write "Exception" class
//		FileReader f1 = new FileReader("file.txt");
		System.out.println("Message from someMethod!");
		throw new FileNotFoundException();
//		throw new Exception();
	}
}

// Example:
// In Java, "throw" and "throws" are used to handle exceptions, which are events that
// occur during the execution of a program that disrupt the normal flow of instructions.

// The "throws" keyword is used in a method declaration to specify that the method
// may throw one or more exceptions.
// The method declaring throws does not handle the exception itself; instead, 
// it lets the caller of the method to handle it.

// Example: 
// Whenever we are using the "FileReader class",  java will explicitly throw a
// "FileNotFoundException" exception and we can handle that by either writing that statement
// in the "try-catch block" or by declaring a "throws" statement.
// ("FileNotFoundException" is a child class of the class "Exception")

// The "throw" keyword is used to throw an exception explicitly in a program.
// When we want to throw an exception explicitly then we make use of "throw keyword".
// For example, if you want to throw an exception when a certain condition is not met, 
// you can use the throw keyword to throw a specific exception, such as 
// IllegalArgumentException, with an error message.
// Any statement after the throw statement is an unreachable code.

// Where to write:
// "throws" keyword is always used after the method name declaration.
// "throw" keyword is always used inside in the method.

// How to write:
// method_declaration throws exception_type1, exception_type2, ....
// throw new exception_type()	



