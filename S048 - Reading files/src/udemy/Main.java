package udemy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

// Method 1: 
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\rough\\hello.txt"));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException occured!");
		} catch (IOException e) {
			System.out.println("IOException occured!");
		}

// Method 2:
		try {
			Scanner sc = new Scanner(new File("D:\\rough\\hello.txt"));
			String s;
			while (sc.hasNext()) {
				s = sc.nextLine();
				System.out.println(s);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error occured while reading the file!");
		}

	}
}

// Note:
// 1) BufferedReader class has a larger buffer size as compared to Scanner class.
// 2) BufferedReader class is a bit faster as compared to Scanner class.
// 3) Whenever we deal with files then prefer BufferedReader class and when there is 
//    need of user-input then we should use Scanner class as it is easier to use.
