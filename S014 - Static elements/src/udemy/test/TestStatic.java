package udemy.test;

public class TestStatic {

	private static int staticVariable = 0;

	public static int getStaticVariable() {
		return staticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		TestStatic.staticVariable = staticVariable;
//		We can also write "this.staticVariable = staticVariable" like we always write, but it is recommended
//		to write "class_name" instead of "this" keyword, only when we define static variable.

	}

}

// Note:
// The advantage of using static method is that we can call the static method without 
// using/creating any object in the main method.
