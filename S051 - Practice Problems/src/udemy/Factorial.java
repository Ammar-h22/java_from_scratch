package udemy;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Which numbers's factorial: ");
		int num = sc.nextInt();
		sc.close();

		if (num > 0) {
			System.out.println("The factorial of " + num + " = " + factorial(num));
		} else {
			System.out.println("Invalid entry!, Please enter a positive number.");

		}
	}

	static int factorial(int n) {

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
}
