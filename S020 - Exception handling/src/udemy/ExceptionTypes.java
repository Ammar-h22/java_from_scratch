package udemy;

import java.io.FileReader;

public class ExceptionTypes {

	public static void main(String[] args) {

//		This is an "Unchecked exception":
		int x = 5, y;
		y = x / 0;
		System.out.println(y);

//		This is a "Checked exception":
		try {
			FileReader f1 = new FileReader("file.txt");
		} catch (Exception e) {
			System.out.println("FileNotFoundException!");
		}

	}

}

// Note:
// There are 2 main types of exceptions:
// 1) Unchecked exception
// 2) Checked exception

// 1) Unchecked: 
//    The unchecked exceptions are not so serious exceptions and hence java don't show
//    any type of problem during the implementation, but while the execution of the program
//    it will give the run-time error/exception.

// 2) Checked:
//    The checked exceptions are so serious exceptions that the java immediately
//    complains during the implementation itself and hence we have to handle 
//    those exception before the execution of the program.
