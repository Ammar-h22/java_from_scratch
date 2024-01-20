package udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Set<String> names = new HashSet<>();
		names.add("Ammar");
		names.add("Ali");
		names.add("Mufaddal");
		names.add("Lubaina");

		List<String> list = new ArrayList<>();
		list.addAll(names); // This will add all the elements of Set to List.

		Collections.sort(list); // This will sort the elements in natural order

		for (String i : list) { // This for-each loop is used for printing the elements.
			System.out.println(i);
		}

//		This .binarySearch() method is used for searching in Collections: 
//		It will return negative value if the given element is not present in the collection,
//		and if the element is present then it will give the index no. of that element.
		System.out.println(Collections.binarySearch(list, "Raj"));
		System.out.println(Collections.binarySearch(list, "Lubaina"));

		System.out.println(list.get(3)); // This will return the element at index no. 3

	}

}

// Note:
// The addAll() method is a static method of the java.util.Collections class in Java. 
// It is used to add all the elements of one collection to another collection.

// Note that these Collections methods will not work for 'Maps' because maps are not
// the part of collections.
// Collections only include sets, lists, queue and deque.                

