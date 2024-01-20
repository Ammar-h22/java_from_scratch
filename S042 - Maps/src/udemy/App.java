package udemy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {

		Map<Integer, String> students = new HashMap<>();
		students.put(3, "Ali");
		students.put(1, "Raj");
		students.put(4, "Teena");
		students.put(2, "Mufaddal");

//		This is the best & easiest way of iterating through maps:
		for (Map.Entry<Integer, String> i : students.entrySet()) {
//			System.out.println(i);
			System.out.println("Key:" + i.getKey() + ", value:" + i.getValue());
		}

// Another way of iterating through maps: (This is also easy)
		for (Integer i : students.keySet()) {
			System.out.println("Key:" + i + ", value:" + students.get(i));
		}

//	Another way of iterating through maps using "Iterators": (Just for info, not recommended)
		Iterator<Entry<Integer, String>> itr = students.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//	If we want to only print a particular 'value' then we can use '.get() method':
//	Or we can say that, if we only know the value of 'KEY' and we want to know the 
//	'VALUE' for that key, then we can use this:
		System.out.println(students.get(2));

//	Now if we know the 'VALUE' and we want to know the 'KEY' for that 'VALUE', then
//	there is so such .get()	method, we will require a 'for loop':
		int s = 0;
		for (Map.Entry<Integer, String> i : students.entrySet()) {
			if (i.getValue().equals("Teena")) {
				s = i.getKey();
			}
		}
		System.out.println("The Key for value \"Teena\" is: " + s);

	}
}

// Note:
// In Java, maps are a data structure that stores a collection of key-value pairs.
// Each key is "unique" and corresponds to a specific value. Maps are often used for tasks 
// such as caching, indexing, and searching.
// There can be same "values", but there cannot be similar "keys" in the map.
// (If there are 2 keys with the same number, then only one will be displayed).

// Maps can be implemented using different classes in Java, the 3 most important types are 
// HashMap, TreeMap, LinkedHashMap.
// HashMap is the most commonly used implementation of a map in Java. It provides constant  
// time performance for basic operations such as put() and get(), making it very efficient,
// But HashMaps does not guarantee the order of the maps/elements, it may change or it may also
// not change.

// Other popular implementations include TreeMap, which maintains the keys in sorted order,
// and LinkedHashMap, which maintains the order in which elements were inserted.

// In Maps, we can add, retrieve, and remove elements using the put(), get(), and remove()
// methods, respectively. Maps also provide other useful methods, such as keySet() and 
// entrySet(), which return sets of the keys and key-value pairs, respectively.

// In summary, maps are a powerful data structure in Java that allow us to efficiently 
// store, access, and manipulate key-value pairs.
