package udemy;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		int x = 0, y = 5;
		try {
			System.out.println("This statement will get executed!");

			x = 10 / 0; // Case 1
//			System.out.println("We don't know what will be the outcome " + x/0); // Case 2
//			x = (y = 10 * 10) / 0; // Case 3

			System.out.println("This statement will not get executed!");

		} catch (ArithmeticException e) { // Child for Runtime Exception class
			System.out.println("Arithmetic Exception occured!");

		} catch (RuntimeException e) { // Child for "Exception" & parent for ArithmeticException class
			System.out.println("Runtime Exception!");

		} catch (Exception e) { // Parent Exception class
			System.out.println("Inside the exception block!");
		}

//		System.out.println(y);
	}

}

// Note:
// Inside try block there can be 3 types of statements:
// Case 1:
// A simple statement that contains exception.

// Case 2:
// If there are different parts in the statement and one of the part is an exception, then 
// not only that exception part but the whole statement will not get executed.
// (There is no partial statement execution).

// Case 3:
// Also there can be a case where a particular statement gets execute but only if it is a
// complete sub-statement inside a statement, which contains exception.
// (In the above example, "y" is a complete sub-statement which can be executed)

// Note that case 2 & case 3 types of scenarios are not so used unless we are doing 
// high level programming, Usually simple statements are used inside the try block. 

// Catch block:
// There can be multiple catch blocks for a single try block.
// But note that only one catch block will be executed for one try block, even if 
// there are 100 of catch blocks.

// Also note that the sequence of catch blocks is very important, because we know that  
// there is a hierarchy of "Exceptions" and that is why always the child exception catch block
// should come first before the parent exception catch block.
// (We can check, which is child & which is parent exception type in the Oracle documentation).
