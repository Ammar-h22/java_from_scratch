package udemy;

import udemy.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door d1 = new Door();
		System.out.println(d1.isLocked("qwerty"));
		System.out.println(d1.isLocked("testing"));

//		This was the concept of local inner class.
//		Now we can also pass the value(key) as command line argument.
//		Command line argument helps us to pass the value from outside the application.
//		For example:

		if(d1.isLocked(args[0])) {
			System.out.println("Shop is closed, visit later!");
		} else {
			System.out.println("Welcome shop is open!");
		}
	}
}
