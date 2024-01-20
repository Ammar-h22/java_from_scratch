package udemy;

import udemy.test.TestStatic;

public class App {

	public static void main(String[] args) {
		
		TestStatic obj1 = new TestStatic();
		System.out.println("Obj1 current variable value: " + obj1.getStaticVariable());
		obj1.setStaticVariable(21);
		System.out.println("Obj1 current variable value: " + obj1.getStaticVariable());
		
//		Also whenever we are accessing the static variable, there is no need to initialize the objects,
//		we can directly access the methods using the "class_name".
		
//		We can also write like this: 
//		The below implementation is recommended: 
		
//		TestStatic obj2 = new TestStatic();  // There is no need to write this line
		System.out.println("Current variable value: " + TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(45);
		System.out.println("Current variable value: " + TestStatic.getStaticVariable());

		

	}

}

// Note: 
// Static variable has an independent memory location or in other words, they have a single copy in memory.
// They are not dependent on object and as a result a change in the value in one object is reflected in 
// another objects as well,  because that single static variable is shared between all the objects.

// Changes that we need to make when we define static variable:
// (The program will still work even if we don't make these changes, but in java it is considered 
// good to make these changes whenever we define static variables.
// 1) We will make the getters and setters methods as static, because it is a good practice 
//    to access static variables using static methods only.
// 2) Instead of writing "object_name.Static_method_name()" we will write "class_name.Static_method_name()".
// All these changes we can see in the above example.
 






