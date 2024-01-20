package udemy.demo;

public class Outer {

	public static class Inner {
		
		public static int x = 365;
		public static void testingInnerMethod() {
			System.out.println("Testing inner class method.");
		}
	}

}

// Note:
// A true static class is a class in which all the elements are static (variables, methods,...)
// Note that whenever we want to give static keyword to any element then it is mostly associated 
// with the "public" access modifier. 
// Example: (public static class ..., public static data-type..., public static void ...)

