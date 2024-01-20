import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("Germany");
		countries.add("USA");
		countries.add("Itly");
		countries.add("UAE");
		countries.add("UK");

		System.out.println(countries);

//		If we want to add an element in between two elements then:
		countries.add(2, "Canada");
//		This will add "Canada" in between the index no. 2 & 3.

//		If we want to modify the content:
		countries.set(6, "United Kingdom");

//		If we want to remove an element from the list:
		countries.remove(5);
//		countries.remove("UAE");
		countries.remove();// If we don't specify anything then the 1st element will be deleted

		App a1 = new App();
		a1.display(countries);

	}

	void display(LinkedList<String> list) {
		for (String s : list) {
			System.out.println(s);
		}
	}

}

// Note:
// The difference between ArrayList and LinkedList is that:
// ArrayList is better for storing and accessing data.
// LinkedList is better for manipulating data.
// ArrayList is fast but is not memory efficient.
// LinkedList is slow but is memory efficient. 

