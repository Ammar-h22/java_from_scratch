package udemy;

import udemy.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door d1 = new Door();
//		System.out.println(d1.getL1().isUnlocked("qwerty"));
		
		if(d1.getL1().isUnlocked(args[0])) {
			System.out.println("Welcome, we are open!");
		}
		else {
			System.out.println("Sorry, visit later!");
		}
	}

}
