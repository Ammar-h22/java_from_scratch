package udemy;

public class FinallyBlock {

	public static void main(String[] args) {

		int x;
		try {
			x = 10 / 0;
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception!");
		} finally {
			System.out.println("This will always be printed!");
		}

	}
}
// Finally block:
// Whenever we use "finally block", then it is optional to use the "catch block".
// (But if we are using the catch block then it should always be placed before finally block)
// Note that "finally block" always gets executed whether there is a "catch block" or not.
