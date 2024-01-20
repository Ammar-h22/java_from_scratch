package udemy;

import udemy.person.*;


public class Main {

	public static void main(String[] args) {
	
		Person Teena = new Vegan();
		Teena.speak();
		Teena.eat();
		System.out.println("****************");
		Person Raj = new NonVegan();
		Raj.speak();
		Raj.eat();
	}

}
