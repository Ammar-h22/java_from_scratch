package udemy;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App2 {

	public static void main(String[] args) {

		List<Object> elements = new LinkedList<>();// This 'Object' type can contain any data-type
		elements.add("Ammar");
		elements.add("Lubaina");
		elements.add("Hello India!");
		elements.add(12);
		elements.add(10.11);
		elements.add('A');
		elements.add('$');

		App2 a1 = new App2();
		a1.display(elements);

	}

//	This type of declaration is discussed just in the next project named "Iterator".
	void display(List<Object> list) {
		ListIterator<Object> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println("Element: " + itr.next());
		}
	}

}

// Note:
// The advantage of using <Object> is that there is no restriction of using
// any particular data-type. 
// (We can use all different types of data-types simultaneously)
