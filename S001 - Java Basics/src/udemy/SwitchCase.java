package udemy;

public class SwitchCase {

	public static void main(String[] args) {

//		int y = 2;
//		if (y == 1) {
//			System.out.println("Value of y is 1");
//		} else if (y == 2) {
//			System.out.println("Value of y is 2");
//		} else if (y == 3) {
//			System.out.println("Value of y is 3");
//		} else {
//			System.out.println("Value of y is other than 1,2,3");
//		}

//		Instead of using this if-else block we can use switch case statements:

//		Integer type switch case statement:
		int y = 2;
		switch (y) {
		case 1:
			System.out.println("Value of y is 1");
			break;
		case 2:
			System.out.println("Value of y is 2");
			break;
		case 3:
			System.out.println("Value of y is 3");
			break;
		default:
			System.out.println("Value of y is other than 1,2,3");
			break;
		}

//		Character type switch case statement:
		char x = 'C'; 
		switch (x) {
		case 'a':
		case 'A':
			System.out.println("The value of x is a");
			break;
		case 'b':
		case 'B':
			System.out.println("The value of x is b");
			break;
		case 'c':
		case 'C':
			System.out.println("The value of x is c");
			break;
		default:
			System.out.println("The value of x is other than a,b,c");
			break;
		}

//		String type switch case statement:
		String name = "team";
//		Here if we enter "Team" as String then it will show 'Invalid entry' as names are 
//		case sensitive for for that problem we can use an inbuilt function.
		switch (name.toLowerCase()) {
		case "author":
			System.out.println("Ammar");
			break;
		case "team":
			System.out.println("Burhani foundation");
			break;
		case "editor":
			System.out.println("Abbas & Mufaddal");
			break;
		default:
			System.out.println("Invalid entry!");
			break;
		}

	}
}

// Note:
// We cannot use "float" datatype is switch-case statements, it is not permitted/allowed.


 