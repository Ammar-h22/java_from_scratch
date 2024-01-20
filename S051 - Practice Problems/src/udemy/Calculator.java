package udemy;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int no1 = sc.nextInt();

		System.out.println("Enter the second number: ");
		int no2 = sc.nextInt();

		System.out.println("Enter required operation [+, -, *, /]: ");
		char operator = sc.next().charAt(0);

		if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
			int result = calculate(no1, no2, operator);
			System.out.println(no1 + " " + operator + " " + no2 + " = " + result);
		} else {
			System.out.println("Invalid operator!, Choose from [+, -, *, /]");
		}
		sc.close();
	}

	static int calculate(int x, int y, int operator) {

		int result = 0;
		switch (operator) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;
		}
		return result;
	}
}
