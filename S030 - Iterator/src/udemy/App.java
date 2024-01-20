package udemy;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {

		List<String> countries = new LinkedList();
		countries.add("India");
		countries.add("Germany");
		countries.add("USA");
		countries.add("Itly");
		countries.add("UAE");
		countries.add("UK");

		new App().display(countries);
	}

//	void display(List<String> list) {
//		Iterator<String> i = list.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
//	}
	void display(List<String> list) {
		ListIterator<String> itr = list.listIterator(list.size());// In bracket we can also directly
																	// give the last element index no
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}

// Instead of using for-each loop for displaying the list we can also make
// use of the Iterator.
// Basically there is no as such advantage of using Iterator instead of for-each loop.
// So we can keep making use of for-each loop.
// But we can also use "ListIterator", it is different from "Iterator".
// This "ListIterator" is useful because it has various methods to use for lists, but
// the very useful method is "previous" method which returns the previous element in
// the list and moves the cursor position backwards.
// (Means we can get the elements in reverse order.)
// And this we can't do with the help of for-each loop.
// For more information about the ListIterator, check on youtube (TechieDeveloper).
