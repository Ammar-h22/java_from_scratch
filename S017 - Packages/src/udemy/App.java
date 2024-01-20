package udemy;

import udemy.blog.Java;
//import udemy.platform.Java;
// We cannot use both the import statements (only one at a time) because both have same class name. 

public class App {

	public static void main(String[] args) {
		
		Java j1 = new Java();
		j1.usedFor();
		
//		If we want to print the method from both the classes simultaneously then we can also 
//		give the whole path that we give in import statement, and then there is no need to 
//		give the import statement at the starting.
		
		udemy.platform.Java j2 = new udemy.platform.Java();
		j2.usedFor();
	}
}

// Note:
// 1) Packages are used for better organization.
// 2) Packages are nothing but folders.
// 2) We can create classes of same names using packages, means we can give the same name to more 
//    than one class, but we will define them in different packages. So like this there will 
//    be no conflict between the names of the classes.
//    (Hence in this way packages reduces naming conflicts/ambiguity).
