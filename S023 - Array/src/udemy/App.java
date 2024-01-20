package udemy;

public class App {

	public static void main(String[] args) {

		int[] a;
		a = new int[10];
		a[0] = 20;
		a[1] = -44;
		a[9] = 76;
		System.out.println(a[1]);
		System.out.println(a); // This will print the location of array "a".

		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(b[5]);

		float[] c = { 1.2f, 2.2f, 3.2f, 4.2f };
		System.out.println(c[2]);
//
		String[] s = { "Ammar", "Ali", "Mufaddal", "Shakil", "Fatema", "Lubaina" };
		for (int i = 0; i <= 5; i++) {
			System.out.println(s[i]);
		}

//		Now in the above example it was a small array and hence we can easily count the 
//		number of elements, but in case if there is a very large array then how we
//		will get to know the number of elements in the array.
//		So, we will use the ".length function"
//		Note that while using ".length" function inside "for-loop" we have 
//		to specify only '<' sign & not '<='. 

		String[] x = { "Ammar", "Ali", "Mufaddal", "Shakil", "Fatema", "Lubaina", "Teena" };
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

//		We can also make use of the "for-each loop" in java:
//		Syntax : 
//		for(data-type temporary_variable : array_name)
//		The data-type inside the "for loop" should be similar to the data-type of array.
//		Example:

		String[] y = { "Ammar", "Ali", "Mufaddal", "Shakil", "Fatema", "Lubaina", "Raj" };
		for (String name : y) {
			System.out.println(name);
		}

	}

}

// Array:
// Array is an ordered sequence/collection used to store same data-type elements that are 
// stored in contiguous memory location.
