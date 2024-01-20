package udemy;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Set<String> names = new HashSet<>();
		names.add("Ammar");
		names.add("Lubaina");
		names.add("Adnan");
		names.add("Taha");
		names.add("Naqiya");
		names.add("Naqiya");

		for (String i : names) {
			System.out.println(i);
		}
		System.out.println(names);

		System.out.println(names.contains("Ammar"));
//		This ".contains()" will return 'true' if the element is present in the set else it 
//		will return 'false'.
	}

}

// Note;
// A set in Java is a collection of unique elements, meaning that no duplicates are allowed.
// the Set interface is part of the Java Collections Framework and extends the 
// Collection interface.
// The Set interface provides methods for adding, removing, and checking for the presence 
// of elements in the set, as well as for performing set operations such as union, 
// intersection, and difference. Some of the most commonly used implementation classes of
// the Set interface are HashSet, TreeSet, and LinkedHashSet.
// But the most used one is the HashSet.

// Also note that in case of HashSets, the sequence of the output is not in the order in
// which we insert the elements. Basically this is one of the property of HashSets that
// every time the order of the output will be different, or also sometimes it may not 
// be different.
// Simply the order of elements is not maintained in HashSet.

// Also Sets are more memory efficient compared to Lists.
// But usually the usage of sets is pretty low compared to lists.
