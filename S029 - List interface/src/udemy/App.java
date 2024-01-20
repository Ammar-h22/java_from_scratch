package udemy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

//		LinkedList<String> countries = new LinkedList<>();
//		This will also work but it is recommended to use the name "List" instead of some
//		particular list name.
		List<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("Germany");
		countries.add("USA");
		countries.add("Itly");
		countries.add("UAE");
		countries.add("UK");

		new App().display(countries);

//		ArrayList<String> listNames = new ArrayList<>();
		List<String> listNames = new ArrayList<>();
		listNames.add("Ammar");
		listNames.add("Lubaina");
		listNames.add("Fatema");
		listNames.add("Shakil");
		listNames.add("Ali");
		listNames.add("Mufaddal");
		listNames.add("Teena");

		new App().display(listNames);

	}

	void display(List<String> list) {
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("*************");
	}

}

// Note:
// List in Java provides the facility to maintain the ordered collection.
// The implementation classes of List interface are ArrayList, LinkedList, Stack and Vector. 
// The ArrayList and LinkedList are widely used in Java programming. 
// The Vector class is mostly not used since Java 5.


