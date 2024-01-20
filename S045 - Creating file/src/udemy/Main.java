package udemy;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

// Here in the below example we have not given any path, we have just given the file
// name, so the file will be created in this project itself:  	
//		File f1 = new File("rough.txt");
//		f1.createNewFile();
//		System.out.println("File created!!");

//	This will create a file in the src folder of this project: 
//	As we are not assigning a complete path, so it is known as relative path i.e 
//	"The path is relative to the current location".
//		File f2 = new File("src\\rough.txt");
//		f2.createNewFile();
//		System.out.println("File created!!");

// Now if we want to create a file at some particular specified location:
// The below example is known as complete path or absolute path:
		File f3 = new File("D:\\College work\\rough.txt");
		f3.createNewFile();
		System.out.println("File created!!");
	}

}

// One point to note is that the 'paths' are not case sensitive.

// In java streams are automatically created for us. All these streams are attached 
// with console.
// There are main 3 types:
// 1) System.out: Output stream
// 2) System.in: Input stream
// 3) System.err: error stream
