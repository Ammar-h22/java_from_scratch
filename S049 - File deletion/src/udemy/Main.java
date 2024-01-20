package udemy;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

//		File f1 = new File("studyeasy");
//		f1.mkdir();
//		f1 = new File("studyeasy\\practice.txt");
//		f1.createNewFile();

		File f2 = new File("studyeasy\\practice.txt");
		if (f2.delete()) {
			System.out.println("Deletion successful!");
		} else {
			System.out.println("Error occured while deletion");
		}
	}
}
