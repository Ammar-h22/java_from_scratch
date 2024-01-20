package udemy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		File f1 = new File("studyeasy");
		f1.mkdir();
		f1 = new File("studyeasy\\team.txt");
		try {
			f1.createNewFile();
			System.out.println("File created!");
		} catch (IOException e) {
			System.out.println("Error occurred while creating the file!");
		}

//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f1))) {
//		This will override all the content that is present in the file
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f1, true))) {
//		This will append, & not override the content

			bw.write("Ammar");
			bw.newLine();
			bw.write("Lubaina");
			bw.newLine();
			bw.write("Teena");
			bw.newLine();
			bw.write("Mufaddal");
			bw.newLine();
			System.out.println("Writing onto the file completed!");
			bw.close();// Even if we don't write this,the program will work,But is a good practice.

		} catch (IOException e) {
			System.out.println("Error occurred while writing onto the file!");
		}
	}
}

// Also one point to note that, by using this statement:
// try (BufferedWriter bw = new BufferedWriter(new FileWriter(f1, true))) {
// Even if the file is not created, it will not give error, it will create a file 
// and write the content in that file.
