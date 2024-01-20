package udemy;

import udemy.phone.*;

public class Main {

	public static void main(String[] args) {
        
		Phone p1 = new Phone("Nokia 3310");
		System.out.println(p1.getModel());
		p1.features();
                                 
		Samsung note9 = new Samsung("Note 9");
		System.out.println(note9.getModel());
		note9.features();
        
		Phone p2 = new Samsung("Note 9 pro"); // Here we can see that we are making object of "Phone" class
													// and initializing constructor of "SamsungNote9 class",
													// this is possible because of inheritance.
													// ("SamsungNote9" class inherits "Phone" class)
		System.out.println(p2.getModel());
		p2.features();
        
		Phone p3 = new Nokia("Nokia 3310");
		System.out.println(p3.getModel());
		p3.features();
        
	}
    
}

// Note:
// In Polymorphism "poly" means "Multiple" and "morphishm" means "forms", hence polymorphism is 
// also called as "multiple forms".

// In the above example we can see that there are multiple forms of "features" method.
 
// How the system works:
// If we talk with the reference to the "features" method in the above example.

// First the system will check that if there is any "features" method in the child class, if it is present 
// then it will print that method from the child class, and if the "features" method is not present in the
// child class then the system will print the "features" method from the parent class.

// So in this way polymorphism works, that the object has multiple forms to access different methods.
// And for the application of poymorphism, we make the use of inheritance.


