package udemy;

import java.util.ArrayList;

class intWrapper {
	public int a;

	public intWrapper(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

public class App {

	public static void main(String[] args) {

//		In the below example java will automatically handle autoboxing and unboxing because 
//		"Integer" is already a defined Wrapper class in java.
		ArrayList<Integer> studentMarks = new ArrayList<>();
		studentMarks.add(125);// Autoboxing
		System.out.println(studentMarks.get(0)); // Unboxing

//		In the below example java will not automatically handle autoboxing and unboxing 
//		because "intWrapper" is a class that has been defined by us.
//		So as we have defined this class so we need to do the autoboxing & unboxing manually.
		ArrayList<intWrapper> marks = new ArrayList<>();
//		marks.add(12); // This will not work
		marks.add(new intWrapper(12)); // Boxing
		System.out.println(marks.get(0).getA()); // Unboxing

		
		
		
//		How the statements are executed in the background by the java:
		ArrayList<Double> demoList = new ArrayList<>();
		demoList.add(23.2);
		demoList.add(Double.valueOf(23.2)); // This is done will Autoboxing.
		System.out.println(demoList.get(0));
		System.out.println(demoList.get(0).doubleValue()); // This is done while Unboxing.

	}

}

// Important note:

// 1) The conversion of primitive data types into its equivalent Wrapper 
//    type object is known as boxing.
// 2) Autoboxing is the automatic conversion that the Java compiler makes between the 
//    primitive types and their corresponding object wrapper classes. 
//    For example, converting an int to an Integer, a double to a Double, and so on. 
// 3) If the conversion goes the other way, then it is called unboxing.
//    Unboxing on the other hand refers to converting an object of a wrapper type to 
//    its corresponding primitive value. For example conversion of Integer to int. 

// Primitive type ====> Wrapper Class
//3) int     ====> Integer 
//6) byte    ====> Byte
//7) long    ====> Long
//8) short   ====> Short
//2) float   ====> Float
//4) double  ====> Double
//1) boolean ====> Boolean
//5) char    ====> Character
