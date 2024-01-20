package udemy;

public class TypeCasting {

	public static void main(String[] args) {
		
//		Type-casting:
//		Implicit type casting (Automatic type casting) where 'short' datatype is converted into 'int' datatype.
		short x = 5;
		int y = x;
		System.out.println(y);
		
//		Explicit type casting:
		int m = 10;
		short n = (short)m;  // or (byte)a
		System.out.println(n);
		
//		Type casting cannot be done between String and int/float.
		
		int i = 10;
		float f = i;
		System.out.println(f);
		
		float f1 = 10.11f;
		int i1 = (int)f1;
		System.out.println(f1);
		
//		We can implicitly cast from (integer to float) but we cannot implicitly cast from (float to integer).
//		Because the range of float is very large.
		
//		Exercise:
		int a = 25;
		float b = 42.159f;
		double value = (a*a)+ 2*(a*b) + (b*b);
		System.out.println("Value of the equation is : " + value);       // Value will be displayed in decimal
		System.out.println("Value of the equation is : " + (int)value);  // Value will be displayed in integer
		
	}
	}

 
//  Note: 
//  There is no loss of information in Implicit type casting but there is loss of information in Explicit type casting.



