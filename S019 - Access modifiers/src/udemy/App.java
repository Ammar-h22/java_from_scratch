package udemy;

import udemy.parent.A;

public class App {

	public static void main(String[] args) {

		A a1 = new A();
		a1.display(); 

		System.out.println(a1.d); // This is for public variable

	}
}

// Note:
// Access modifiers are also known as access specifiers, both are the same.
// There are in total 4 access modifiers:

// 2) Private: The access level of a private modifier is only within the class, 
//             It cannot be accessed from outside the class.

// 1) Default: If we don't use any modifier then it is treated as default access modifier.
//             The access level of a default modifier is only within the package,  
//             It cannot be accessed from outside the package.

// 4) Protected : The access level of a protected modifier is within the package and
//                outside the package through "Inheritance" only. 
//                If you do not make the child class, it cannot be accessed from outside the package.

// 3) Public :  The access level of a public modifier is everywhere. It can be accessed from 
//              within the class, outside the class, within the package and outside the package.


