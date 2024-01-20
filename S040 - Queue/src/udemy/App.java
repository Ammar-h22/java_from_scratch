package udemy;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {

	public static void main(String[] args) {

		Queue<Integer> info1 = new LinkedBlockingQueue<>();
		info1.offer(10);  // For adding the element
		info1.offer(20);
		info1.offer(30);
		info1.offer(40);
//		OR
		info1.add(50);

		for (Integer i : info1) {
			System.out.println(i);
		}
		
		System.out.println(info1.poll());  // For removing the element
		System.out.println(info1.peek());  // For printing the first element 
		System.out.println(info1.size());  // For printing the size of the queue 

		
//		In ArrayBlockingQueue we need to specify the size of the Queue in the parameter.
		Queue<Integer> info2 = new ArrayBlockingQueue<>(5); // Means the size of the queue is 5.
		info2.add(10);
		info2.add(20);
		info2.add(30);
		info2.add(40);
		info2.add(50);
// Now if there will be more than 5 elements in this queue then the output will give error.
		for (Integer i : info2) {
			System.out.println(i);
		}
		
		System.out.println("Element removed is: "+info2.remove());
//	    This ".remove()" will remove the first element from the queue.
		
		System.out.println("First element in the list is: "+info2.element());
	}

}

// Note:
// In Java, the Queue interface is a part of the Java Collection Framework and represents
// a data structure that follows the First-In-First-Out (FIFO) principle, meaning that the
// first element added to the queue will be the first one to be removed.
// The element is added from the end, and it is removed from the front of the queue.
// A Queue can be implemented by various classes, such as LinkedList or ArrayDeque

// Some of the common methods in the Queue interface include:

//offer(E e) - Adds an element to the end of the queue and returns a boolean
//             indicating success.
//poll() - Removes and returns the head of the queue, or returns null if the queue is empty.
//
//peek() - Returns the head of the queue without removing it, or returns null if the
//         queue is empty.
//size() - Returns the number of elements in the queue.

// offer() is similar to add()
// poll() is similar to remove() 
// peek() is similar to element() 

// We should use offer(), poll() and peek() methods and not the add(), remove() and element()
// methods because for example if we use remove() method before adding any element in queue,
// then the program will give an error, and instead if we use poll() method before adding
// any element then it will not give any error, it will return "null".
// And similarly there are other advantages of using peek() and offer().
