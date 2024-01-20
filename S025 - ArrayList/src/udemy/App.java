
// From this project, this is the starting of the Java Collection Frameworks:
package udemy;

import java.util.ArrayList;

public class App {

	static ArrayList<String> listNames = new ArrayList<>();

	public static void main(String[] args) {

		listNames.add("Ammar");
		listNames.add("Lubaina");
		listNames.add("Fatema");
		listNames.add("Shakil");
		listNames.add("Ali");
		listNames.add("Mufaddal");
		listNames.add("Teena");

		System.out.println(listNames.get(0));
		System.out.println(listNames); // This will display all the names in the list

		App a1 = new App();
		a1.display(listNames);

//		a1.removeNameByPosition(0);
//		System.out.println("****************");
//		a1.display(listNames);
//		System.out.println();
//		System.out.println(listNames.get(0));

//		a1.removeNameByString("Mufaddal");
//		System.out.println("****************");
//		a1.display(listNames);
//		System.out.println();
//		System.out.println(listNames.get(5));

		System.out.println("****************");
		a1.modifyName(2, "Sakina");
		a1.display(listNames);

		System.out.println("****************");
		a1.search("Ali");
	}

	void display(ArrayList<String> names) {
//		for (String n : names) {
//			System.out.println(n);
//		}
		System.out.println(names);

	}

//	This method will delete an element
	void removeNameByPosition(int position) {
		listNames.remove(position);
	}

	void removeNameByString(String name) {
		listNames.remove(name);
	}

// This method will modify the name of the element
	void modifyName(int position, String newName) {
		listNames.set(position, newName);
	}

// 	This method will give the position of the element 
	void search(String name) {
		System.out.println(listNames.indexOf(name));
	}
}

// Note:
// Java ArrayList class uses a dynamic array for storing the elements. 
// It is like an array, but there is no size limit. We can add or remove elements any-time.
// So, it is much more flexible than the traditional array. 
// It is found in the java.util package.
// ArrayList is implemented as a class in java, and thats why there is a pair of parenthesis
// while declaring it.

// Also very important point to note that, 
// We cannot create an arrayList of the primitive data-types, such as int, float, char, etc. 
// It is required to use the wrapper class in such cases for example Integer, Float, Character,
// Boolean, String etc.
// Also note that "String" is not a primitive data-type in java, it is a class.

// Whenever we delete a particular element from a position from an array then that 
// space remains empty and would be wasted, but in arrayList it is not like that.
// In arrayList whenever we delete a particular element from a position then that 
// position is not wasted instead all the other remaining element's position is 
// promoted/incremented in the arrayList.
// Example:
// If 0th position element is deleted and there are 4 elements in the arrayList then 
// 3rd position element will be promoted to 2nd position, 2nd position element will be 
// promoted to 1st position and the 1st position element will be promoted to 0th position.
// And in this way there is no wastage of memory/space in case of arrayList like there
// was in array.


// Advantages of ArrayList:
//1) Accessing information is very fast.
//2) Easy to access any element from any location.

// Disadvantages of ArrayList:
//1) Operations are slow
//2) Tends to use more memory while operating.




 
