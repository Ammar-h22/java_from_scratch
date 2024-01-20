package udemy;

public class Main {

	public static void main(String[] args) {
		String a = "Study";
		String b = "easy";
//		String c = a + b;
		String c = a.concat(b);
		System.out.println(c);

		if (c.equals("Studyeasy")) {
			System.out.println("The text is Studyeasy");
		} else {
			System.out.println("The text is not Studyeasy");
		}

	}
}

// In case of strings there are a lot of functions given by the java, so it is 
// recommended that instead of using the normal operators we should use the different 
// string functions.
// (We can also see some inconsistencies/wrong answers if we use the normal operators
// in case of strings.)
// Example:
// 1) Instead of "+" operator we should use, .concat() function.
// 2) Instead of "==" operator we should use, .equals() function.

// Which is more better between string literal and string object:
// String literal => String s = "Hello";
// String object => String s = new String("Hello");
// It is mostly recommended to use string literals.


