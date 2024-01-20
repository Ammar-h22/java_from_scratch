package udemy;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {

//		Arithmetic operators (Binary operators):
		int a = 2;
		int b = 12 + a; // Addition
		int c = 12 - a; // Subtraction
		int d = 12 * a; // Multiplication
		int e = 12 / a; // Division
		int f = 12 % a; // Modulus
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

//		Increment and decrement operators: (These are also Arithmetic operators)
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);

//		Making decision with operators:
		int x = 5;
		if (x == 5) {
			System.out.println("The value of x is 5");
		} else {
			System.out.println("The value of x is not 5");
		}

		// OR
		int y = 5;
		if (y != 5) {
			System.out.println("The value of y is not 5");
		} else {
			System.out.println("The value of y is 5");
		}

		int m = 4, n = 5;
		if (m < n) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		/*
		 * Similarly there are many such operators such as: (> , < , <= , >= , && , || ,
		 * !)
		 * 
		 * Rule for && operator = If and only if all the operands are 'true' then only
		 * the condition will be true.
		 * 
		 * Rule for || operator = If any one of the operand is 'true' even then the
		 * condition will be true.
		 */

		int P = 5, Q = 10;
		if ((P < Q) || (P == Q)) {
			System.out.println("Condition is True");
		} else {
			System.out.println("Condition is False");
		}

//		Not operator: (Unary operator)
		int r = 12, s = 10;
//		if(r>s) {          // This will return True
		if (!(r > s)) { // This will return False because of not operator.
			System.out.println("Condition is True");
		} else {
			System.out.println("Condition is False");
		}

//		Exercise:
		int ageOfBoy = 24;
		int ageOfGirl = 20;

		if (ageOfBoy >= 21 && ageOfGirl >= 18) {
			System.out.println("You can get married.");
		} else {
			System.out.println("You can't get married.");
		}

//		Ternary operator:
//		There is only one ternary operator in Java i.e (?:)
//		Syntax: (operation ? value : value;)
		boolean p;
		p = (5 > 4) ? true : false;
		System.out.println(p);

		int X = 10;
		X = (12 == X) ? 1 : 0;
		System.out.println(X);

//		Assignment operators:
		int v = 5;
		v += 5; // v=v+5
		v -= 5; // v=v-5
		v *= 5; // v=v*5
		v /= 5; // v=v/5
		v %= 5; // v= v%5
		System.out.println(v);

//		(if/else if/else) block statements:
		int q = 12;
		if (q == 10) {
			System.out.println("Q is equal to 10");
		} else if (q > 10) {
			System.out.println("Q is greater than 10");
		} else {
			System.out.println("Q is smaller than 10");
		}

//		Modulo operator:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int str = sc.nextInt();
		if (str % 2 == 0) {
			System.out.println("The given number is even");
		} else {
			System.out.println("The given number is odd");
		}

	}

}

//  Note: 
//  There are two different uses of '+' operator: 
//  1) For addition (Ex: 1+2 = 3)
//  2) For concatenation (Ex: "Hello" + "World" = HelloWorld)
