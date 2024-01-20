// Sorting and reversing of List:
package udemy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App2 {

	private static Collections collections;

	public static void main(String[] args) {

		List<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("Germany");
		countries.add("USA");
		countries.add("Itly");
		countries.add("UAE");
		countries.add("UK");

		App2 a = new App2();
		a.display(countries);
		System.out.println("************");
//		countries.sort(null); 
		Collections.sort(countries);// This will sort the List in the ascending order by default
		a.display(countries);
		System.out.println("************");
		collections.reverse(countries); // This will print the List in the descending order
		a.display(countries);

	}

	void display(List<String> list) {
		for (String s : list) {
			System.out.println(s);
		}
	}
}
