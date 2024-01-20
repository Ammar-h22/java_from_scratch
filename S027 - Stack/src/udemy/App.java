package udemy;

import java.util.Stack;

public class App {

	public static void main(String[] args) {

		Stack<Integer> demo = new Stack<>();
		demo.push(10); // Insertion operation
		demo.push(20);
		demo.push(30);
		demo.push(40);
		demo.push(50);
//		OR
		demo.add(60);

		demo.pop(); // Deletion operation

		System.out.println(demo.peek()); // Prints the topmost element of the stack.
											// (Without deleting it)

//		This is our normal for-each loop for printing the stack:
		for (Integer i : demo) // This will print vertically
			System.out.println(i);
//		OR
		System.out.println(demo); // This will print in the list form (Horizontally)

		if (demo.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack is not empty");
		}
//		OR
		System.out.println("Is stack empty? " + demo.isEmpty());// This will print true or false

//		The ".search()" method will return a numeric value:
//		If the element is present then it will return its position in the stack,
//		and if the element is not present then it will return -1.
		System.out.println(demo.search(30));

	}

}

// Note:
// Stack is nothing but the arrangement of elements which are one above another.
// The stack is a linear data structure that is used to store the collection of objects. 
// It is based on Last-In-First-Out (LIFO).
// It extends class vector.
// Vector is similar to ArrayList. But the difference is that vector methods are
// synchronized, whereas ArrayList methods are not synchronized.
