package udemy;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class App {

	public static void main(String[] args) {
		Deque<Integer> info = new LinkedBlockingDeque<>();
		info.offer(10);
		info.offer(20);
		info.offerFirst(30);
		info.offerLast(40);

		System.out.println(info.pollFirst());
		System.out.println(info.pollLast());
		System.out.println(info.peekFirst());
		System.out.println(info.peekLast());
		System.out.println(info.size());

		for (Integer i : info) {
			System.out.println(i);
		}
	}

}

// Note:
// A Deque, or Double Ended Queue, is a data structure that allows you to add or
// remove elements from either end of the queue. 
// A Deque is similar to a Queue, but provides additional methods for inserting and removing
// elements at both ends of the queue, making it more flexible than a standard queue.

// In Deque we can use all the methods of queue plus some additional methods of deque.

// Some of the common methods in the Deque interface include:

// addFirst(E e) - Adds an element to the front of the deque.
// addLast(E e) - Adds an element to the end of the deque.
// offerFirst(E e) - Adds an element to the front of the deque and returns a boolean
//                   indicating success.
// offerLast(E e) - Adds an element to the end of the deque and returns a boolean 
//                  indicating success.
// pollFirst() - Removes and returns the first element of the deque, or returns null 
//               if the deque is empty.
// pollLast() - Removes and returns the last element of the deque, or returns null
//              if the deque is empty.
// peekFirst() - Returns the first element of the deque without removing it, or returns 
//               null if the deque is empty.
// peekLast() - Returns the last element of the deque without removing it, or returns
//              null if the deque is empty.


// Queues & deques are not mostly used when compared to Lists and Maps.
