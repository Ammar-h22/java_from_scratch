package udemy;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class App2 {

	public static void main(String[] args) {

//		Set<String> id = new HashSet<>();
		Set<String> id = new LinkedHashSet<>();
//		Set<String> id = new TreeSet<>();

		for (int i = 30; i > 0; i--) {
			id.add("A" + i);
		}

		for (String i : id) {
			System.out.println(i);
		}
	}

}

// Note:
// HashSet is a collection that stores its elements in a hash table.
// LinkedHashSet is a collection that stores its elements in a doubly-linked list.
// TreeSet stores its elements in a sorted tree structure.

// Here are the use-cases for all the 3 different types of sets:
// HashSet:
// 1) Set operations such as union, intersection, or difference
// 2) Quickly checking if an element is present in the set or not
// 3) Removing duplicates from a collection

// LinkedHashSet:
// 1) Maintaining the order of elements while still getting fast access times
// 2) Iterating through a set in the order in which elements were added

// TreeSet:
// 1) Sorting elements in the set
// 2) Finding the first or last element in the set
// 3) Navigating elements in the set in order

