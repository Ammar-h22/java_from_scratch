package udemy;

import java.io.FileNotFoundException;

public class UserDefinedException extends Exception {

	public static void main(String[] args) {

		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("catch block of main method (FileNotFoundException)");
		} catch (UserDefinedException e) {
			System.out.println("catch block of main method (UserDefinedException)");
		} catch (Exception e) {
			System.out.println("catch block of main method (Exception)");

		}
	}

	public static void someMethod() throws Exception {
		int x = 3;
		switch (x) {
		case 1:
			throw new FileNotFoundException();
		case 2:
			throw new Exception();
		default:
			throw new UserDefinedException();
		}

	}
}
