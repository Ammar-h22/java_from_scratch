package udemy;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
	
//		If we want to create a folder in the existing project, then just write the name 
//		of the folder(directory).
//		File d1 = new File("Rough folder");
//		d1.mkdir();  // make directory
//		System.out.println("Directory created!");
		
// Now if we want to create sub-folders inside a folder:
//		File d2 = new File("Rough folder\\Ammar\\Udemy");
//		d2.mkdirs();  // make directories
//		System.out.println("Directory created!");
		
		File d3 = new File("D:\\rough\\Ammar\\Rough");
		d3.mkdirs();  
		System.out.println("Directory created!");
//		we can also add a file in the folder that just we created:
		File d4 = new File("D:\\rough\\Ammar\\Rough\\file.txt");
		d4.createNewFile();  
		System.out.println("File created!");
	}

	
}
