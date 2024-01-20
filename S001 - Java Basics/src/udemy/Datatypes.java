package udemy;

import java.math.*; // Used for BigDecimal class

public class Datatypes {

	public static void main(String[] args) {

//		There are total four types of integer variables (int , short, byte, long):
//		Range of int variable:
		int intMax = 2147483647;
		int intMin = -2147483648;
		System.out.println(intMax);

//		Small version of int variable is short:
//		Range of short variable is:
		short shortMax = 32767;
		short shortMin = -32768;

//		Range of long variable:
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;

//		Range of byte variable:
		byte byteMax = 127;

		byte byteMin = -128;

//		Floating point numbers in Java (float, double):
		float value1 = 10f / 6f;
		double value2 = 10d / 6d;
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);

		int prime = 100;
		double percentage = prime * 0.46f;
		System.out.println("percentage: "+ percentage);

//		A Boolean variable can only be assigned either true or false.
		boolean var1 = true;
		boolean var2 = false;
		System.out.println(var1);

		char var = '&';
		char variable = '\u00C6'; // This is a unicode number which will print a unicode character.
		System.out.println(variable);

		BigDecimal d1 = new BigDecimal("12.33");
		BigDecimal d2 = new BigDecimal("6.44");
		System.out.println(d1.add(d2)); // Here in BigDecimal class we cannot do (d1+d2).

		String s = "Rajdhani Paints \u00AE";
		System.out.println(s);
		
		String S = new String("Hello world");
		System.out.println(S);
	}

}
