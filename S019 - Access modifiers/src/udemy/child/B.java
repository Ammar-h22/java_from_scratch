package udemy.child;

import udemy.parent.A;

public class B extends A {
	
	public void show() {
		
		System.out.println(c);  // This is protected variable 
		System.out.println(d);  // This is public variable 
	}

}
