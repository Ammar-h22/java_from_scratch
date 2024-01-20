package udemy;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
//		System.out.println("What's your name?");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		System.out.println("Hello, " + name);
//		sc.close();

		System.out.println("What's your age?");
		Scanner s1 = new Scanner(System.in);
		int age = s1.nextInt();
		System.out.println("Your age is " + age);
		s1.close();
	}

}
